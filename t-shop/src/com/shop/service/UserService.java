package com.shop.service;

import java.util.List;

import com.shop.bean.User;

public interface UserService {
	
	public List<User> getUser(String username,String password);
}
