package com.netstore.dao.pure;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.netstore.dao.BaseDao;
import com.netstore.entity.pure.UserN;

public class UserDaoN extends BaseDao<UserN> {

	/**
	 *  1、根据用户名查询用户
	 * @param username
	 * @return UserN
	 */
	public UserN findUserByName(String username) {
		String Sql = "select * from user where uName=?";
		return this.find(Sql, username);
	}

	/**
	 *  2.新增用户
	 * @param userN
	 * @return
	 */

	public Integer insertUser(UserN userN) {
		String sql = "insert into user"
				+ "(uId,uGrade,uName,uPassword,uSign,uStatus) "
				+ "values(?,?,?,?,?,?)";
		//生成UUID主键
		UUID random = UUID.randomUUID();
		String uid = random.toString().replace("_", "");
		userN.setUid(uid);
		
		return this.add(sql, userN.getUid(),userN.getUgrade(),
				userN.getUname(),userN.getUpassword(),
				userN.getUsign(),userN.getUstatus());
	}

	/**
	 *  3.修改用户
	 * @param userN
	 * @return
	 */
	public Integer updateUser(UserN userN) {
		String sql = "update User set uGrade=?,uName=?,uPassword=?,uSign=?,uStatus=? where uId=?";
		return this.update(sql, userN.getUgrade(),userN.getUname(),
				userN.getUpassword(),userN.getUsign(),
				userN.getUstatus(),userN.getUid());
	}
	public Integer checkUser(String uId) {
		String sql = "update User set uGrade=203 where uId=?";
		return this.update(sql, uId);
	}

	/**
	 *  4.修改用户登录状态
	 * @param userN
	 * @return
	 */
	public Integer updateUserState(UserN userN) {
		String sql = "update User set uStatus=? where uId=?";
		return this.update(sql, userN.getUstatus(),userN.getUid());
	}

	/**
	 *  5.查询用户
	 * @return
	 */
	public List<UserN>findUsers(){
		return this.findAll("select * from user");
	}

	/**
	 * 6.条件查询用户
	 * 6.1 根据用户等级查询用户（超级管理员、商家用户、消费者用户）（查询所有）
	 * @param uGrade
	 * @return
	 */
	public List<UserN> findUsersByUGrade(int uGrade){
		String sql = "select * from user where ugrade ="+uGrade;
		return this.findAll(sql);
		 
	}
	/**
	 * 根据用户状态查询用户 ，详见用户实体类对Ugrade的解释
	 * 入参说明：
	 * 		low<ugrade<high
	 * @param low
	 * @param high
	 * @return
	 */
	public List<UserN> findUsersBetweenUGrade(int low,int high){
		String sql = "select * from user where ugrade between "+low+" and "+high;
		return this.findAll(sql);
		 
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

	public Integer unCheckedUser(String uid) {
		// TODO Auto-generated method stub
		String sql = "update User set uGrade=202 where uId=?";
		return this.update(sql, uid);
	}

}
