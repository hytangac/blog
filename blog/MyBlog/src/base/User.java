package base;

public class User {
	
	private int userID;
	private String username;
	private String email;
	
	/**Constructor*/
	public User(int id, String name, String email){
		this.userID = id;
		this.username = name;
		this.email = email;
	}
	
	public String toString(){
		return "userID="+userID+", userName="+username+", userEmail="+email;
	}
}
