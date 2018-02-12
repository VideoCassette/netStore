package com.netstore.dao.pure;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.netstore.dao.BaseDao;
import com.netstore.entity.pure.UserN;

public class UserDaoN extends BaseDao<UserN> {

	// 1、根据用户名查询用户
	public UserN findUserByName(String username) {
		String Sql = "select * from user where uName=?";
		return this.find(Sql, username);
	}

	// 2.新增用户

	public Integer insertUser(UserN userN) {
		String sql = "insert into user"
				+ "(uId,uGrade,uName,uPassword,uSign,uStatus) "
				+ "values(?,?,?,?,?,?)";

		return this.add(sql, userN.getUid(),userN.getUgrade(),
				userN.getUname(),userN.getUpassword(),
				userN.getUsign(),userN.getUstatus());
	}

	// 3.修改用户
	public Integer updateUser(UserN userN) {
		String sql = "update User set uGrade=?,uName=?,uPassword=?,uSign=?,uStatus=? where uId=?";
		return this.update(sql, userN.getUgrade(),userN.getUname(),
				userN.getUpassword(),userN.getUsign(),
				userN.getUstatus(),userN.getUid());
	}

	// 4.修改用户登录状态
	public Integer updateUserState(UserN userN) {
		String sql = "update User set uStatus=? where uId=?";
		return this.update(sql, userN.getUstatus(),userN.getUid());
	}

	// 5.查询用户
	public List<UserN>findUsers(){
		return this.findAll("select * from user");
	}

	//6.条件查询用户
	//6.1 根据用户等级查询用户（超级管理员、商家用户、消费者用户）（查询所有）
	public UserN findUsersByUGrade(int uGrade){
		String sql = "select * from user where ugrade =?";
		return this.find(sql, uGrade);
		 
	}
	
	@Override
	public UserN sealEntity(ResultSet resultset) {
		// TODO Auto-generated method stub
		UserN user = new UserN();
		try {
			// uId
			user.setUid(resultset.getString("uId"));
			// uGrade
			user.setUgrade(resultset.getInt("uGrade"));
			// uName
			user.setUname(resultset.getString("uName"));
			// uPassword
			user.setUpassword(resultset.getString("uPassword"));
			// uSign
			user.setUsign(resultset.getString("uPassword"));
			// uStatus
			user.setUstatus(resultset.getBoolean("uSign"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return user;
	}

	@Override
	public List<UserN> sealEntities(ResultSet resultset) {
		// TODO Auto-generated method stub
		List<UserN> userNs = new ArrayList<UserN>();
		try {
			while(resultset.next()){
				UserN entity = sealEntity(resultset);
				userNs.add(entity);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return userNs;
	}

}
