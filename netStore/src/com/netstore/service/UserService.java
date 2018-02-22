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
	
	public List<UserN> queryUserUnchecked(){
		List<UserN> users = userdaoN.findUsersByUGrade(201);
		return users;
		
	}
	public Integer checkUser(String uid){
		Integer row= userdaoN.checkUser(uid);
		return row ;
		
	}

	public Integer unCheckedUser(String uid) {
		// TODO Auto-generated method stub
		Integer row = userdaoN.unCheckedUser(uid);
		return row;
	}
	
}
