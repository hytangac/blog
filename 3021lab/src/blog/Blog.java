package blog;

import java.util.ArrayList;

import base.*;

public class Blog {
	
	private user user;
	private ArrayList<post> allPosts;
	
	public Blog(user user){
		this.user = user;
		this.allPosts = new ArrayList<post>();
	}
	public void setUser(user user){
		this.user=user;
		
	}
	public user getUser(){
		return this.user;
	}
	public void post(post p){
		allPosts.add(p);
		if (!allPosts.isEmpty()) 
			System.out.println("Create a new post succsessfully.");
	}
	public void list(){
		for (int i=0; i<allPosts.size();i++){
			System.out.println(allPosts.get(i).toString());
		}		
	}
	public void delete(int index){
		if (index<=allPosts.size()&&index>0)
			allPosts.remove(index-1);
		else System.out.println("Invalid index: Cannot delete post.");
	}
	public String toString(){
		String temp = null;
		for (int i=0; i<allPosts.size();i++)
			temp= temp+ allPosts.get(i).toString()+"\n";
		return temp;
	}
	public int hashCode(){
		int hc=0;
		for (int i=0; i<allPosts.size();i++){
			hc=allPosts.get(i).hashCode();
		}
		return hc;
	}
	public ArrayList<post> getAllPost(){
		return this.allPosts;
	}
	public boolean equals(Object o){
		if (this == o) {
			return true;
		}
		Class c = this.getClass();		
		if(o.getClass()!=c) return false;		
		Blog blog = (Blog) o;
		if (allPosts.size()!=blog.getAllPost().size()) return false;
		if (blog.toString()!=this.toString()) return false;
		return true;
	}
}
