package com.shop.action;

import com.opensymphony.xwork2.ActionSupport;
import com.shop.service.UserService;

public class UserAction extends ActionSupport {
	
	
	//ºËÐÄ·½·¨
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		String result= userService.getUser(username, password).size()>0?SUCCESS:ERROR;
		return result;
	}
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private UserService userService;
	private String username,password;
	
	

}
