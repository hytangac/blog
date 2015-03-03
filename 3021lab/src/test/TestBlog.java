package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import base.*;
import blog.*;

public class TestBlog {
	public String getInput(){
		String line ="";
		System.out.print("Enter the prompt:");
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			line = br.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		return line;
	}
	
	public static void main(String[] args){
		TestBlog testBlog = new TestBlog();
		user user = new user(1, "COMP3021", "COMP3021@cse.ust.hk");
		Blog myblog = new Blog(user);
		String prompt = null;
		Date date = new Date();
		while(!(prompt = testBlog.getInput()).equals("exit")){
			if(prompt.startsWith("list")){
				myblog.list();
			}
			else if(prompt.startsWith("post")){
				
				String []arr = prompt.split(" ",2);
				String content =arr[1];
				post post =new post(date,content);
				myblog.post(post);
			}
			else if(prompt.startsWith("delete")){
				String []arr = prompt.split(" ",2);
				String temp =arr[1];
				//System.out.println("temp = "+ temp);
				int index = Integer.parseInt(temp);
				myblog.delete(index);
			}
		}
	}

}
