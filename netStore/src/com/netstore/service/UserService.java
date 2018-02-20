package com.netstore.service;

import java.util.List;

import com.netstore.dao.pure.UserDaoN;
import com.netstore.entity.pure.UserN;

public class UserService {

	private UserDaoN userdaoN = new UserDaoN();
	
	public List<UserN> queryUsers(){
		List<UserN> users = userdaoN.findUsersBetweenUGrade(200, 300);
		return users;
		
	}
	
}
