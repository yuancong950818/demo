package com.shop.serviceImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.shop.bean.User;
import com.shop.service.UserService;

public class UserServiceImpl implements UserService {
	
	private HibernateTemplate ht;

	public List<User> getUser(String username, String password) {
		
		
		return ht.find("from User where username='"+username+"' and password='"+password+"'");
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	public HibernateTemplate getHt() {
		return ht;
	}

}
