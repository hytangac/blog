package base;

import java.util.Date;

public class post {
	
	private Date date;
	private String content;
	
	/** Constructor*/
	public post(Date date, String content){
		this.date = date;
		this.content = content;
	}
	
	/**return content*/
	public String getContent(){
		return this.content;
	}
	
	/**set content*/
	public void setContent(String content){
		this.content=content;
	}
	
	/** Output the object as string*/
	
	public String toString(){
		return date+"\n"+content;
	}
	
	/** check whether this object equals object O*/
	public boolean equals(Object o){
		boolean ans = true;
		
		if(o==null) ans=false;
		Class c = this.getClass();
		
		if(o.getClass()!=c) ans=false;
		
		post post = (post) o;
		if(!this.toString().equals(post.toString()))
			ans = false;
		
		return ans;
	}
	
	/*public int hashCode() {
		int hashCode = 0;
		
		hashCode = date.hashCode() + content.hashCode();
		
		return hashCode;
	}*/
	
	/** check whether this post contains some keyword*/
	public boolean contains(String keyword){
		String myPost = this.toString();
		
		return myPost.contains(keyword);
	}
	
	
	
	
	

}