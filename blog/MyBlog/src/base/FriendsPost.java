package base;

import java.util.Date;

public class FriendsPost extends Post{
	
	private User friend;

	public FriendsPost(Date date, String content, User user) {
		super(date, content);
		// TODO Auto-generated constructor stub
		friend=user;
	}
	
	public String toString(){
		return "User ["+friend.toString()+"]\n"+super.toString();
	}

}
