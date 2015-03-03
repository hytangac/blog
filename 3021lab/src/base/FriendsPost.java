package base;

import java.util.Date;

public class FriendsPost extends post{
	
	private user friend;

	public FriendsPost(Date date, String content, user user) {
		super(date, content);
		// TODO Auto-generated constructor stub
		friend=user;
	}
	
	public String toString(){
		return "User ["+friend.toString()+"]\n"+super.toString();
	}

}
