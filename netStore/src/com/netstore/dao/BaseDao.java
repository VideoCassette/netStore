package com.netstore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.netstore.utils.JDBCUtil;

/**
 * 
 * @author 陈东时
 * @param <E>
 * 
 * @param <E>
 *            传入要查询的实体类
 */
public abstract class BaseDao<E> {

	protected Connection con = JDBCUtil.getCon();

	

	/**
	 * 
	 * @param sql
	 *            SQL 语句
	 * @param obj
	 *            入参
	 * @return 返回值 返回值为1 插入成功 范围值为2 出现异常
	 */
	public Integer add(String sql, Object... obj) {
		PreparedStatement preState;
		try {
			preState = con.prepareStatement(sql);
			// TODO Auto-generated catch block
			if (obj != null) {
				for (int i = 0; i < obj.length; i++) {
					preState.setObject(i + 1, obj[i]);
				}
			}
			int row = preState.executeUpdate();
			if(row >0){
				return 1;
			}
			return 2;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 2;
		}
		
	}

	/**
	 * 
	 * @param sql
	 *            SQL 语句
	 * @param obj
	 *            入参
	 * @return 返回值 返回值为1 删除成功 范围值为2 出现异常
	 */
	public Integer delete(String sql, Object... obj) {

		PreparedStatement preState;
		try {
			preState = con.prepareStatement(sql);
			// TODO Auto-generated catch block
			if (obj != null) {
				for (int i = 0; i < obj.length; i++) {
					preState.setObject(i + 1, obj[i]);
				}
			}
			int row = preState.executeUpdate();
			if(row >0){
				return 1;
			}
			return 2;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 2;
		}
		
	}

	/**
	 * 
	 * @param sql
	 *            SQL 语句
	 * @param obj
	 *            入参
	 * @return 返回值 返回值为E 修改成功 范围值为null 修改失败
	 */
	public Integer update(String sql, Object... obj) {
		
		PreparedStatement preState;
		try {
			preState = con.prepareStatement(sql);
			// TODO Auto-generated catch block
			if (obj != null) {
				for (int i = 0; i < obj.length; i++) {
					preState.setObject(i + 1, obj[i]);
				}
			}
			int row = preState.executeUpdate();
			if(row >0){
				return 1;
			}
			return 2;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 2;
		}
	}

	/**
	 * 
	 * @param sql
	 *            SQL 语句
	 * @param obj
	 *            入参
	 * @return 返回值 返回值为 E 查询到实体类 范围值为 null 查无此类
	 */
	public E find(String SQL, Object... obj) {
		PreparedStatement state;
		try {
			state = con.prepareStatement(SQL);
			for (int i = 0; i < obj.length; i++) {
				state.setObject(i+1, obj[0]);
			}
			ResultSet query=state.executeQuery();
			E entity = this.sealEntity(query);
			return entity;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}

	/**
	 * 
	 * @param sql
	 *            SQL 语句
	 * @param obj
	 *            入参
	 * @return 返回值 返回值为List<E> 查询到实体类集合，通过集合大小判断是否有，有多少 范围值为null 出现异常
	 * @throws SQLException
	 * 
	 */
	public List<E> findAll(String SQL) throws SQLException {
		Statement state = con.createStatement();
		ResultSet query = state.executeQuery(SQL);
		List<E> useentities = (List<E>) this.sealEntities(query);
		return null;

	}

	/**
	 * @param resultset
	 *            入参
	 * @return 返回要查询的类的对象 由子类重写
	 */
	public abstract E sealEntity(ResultSet resultset) ;

	/**
	 * @param resultset
	 *            入参
	 * @return 返回要查询的类的对象 由子类重写
	 */
	public abstract List<E> sealEntities(ResultSet resultset) ;

}
