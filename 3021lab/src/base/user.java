package base;

public class user {
	
	private int userID;
	private String username;
	private String email;
	
	/**Constructor*/
	public user(int id, String name, String email){
		this.userID = id;
		this.username = name;
		this.email = email;
	}
	
	public String toString(){
		return "userID="+userID+", userName="+username+", userEmail="+email;
	}
	
		
	
}
