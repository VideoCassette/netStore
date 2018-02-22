package com.netstore.junit;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.UUID;

import org.junit.Test;

import com.netstore.dao.BaseDao;
import com.netstore.dao.UserDao;
import com.netstore.entity.User;
import com.netstore.utils.JDBCUtil;

public class JDBUCUtilsTest {

	@Test
	public void testConnection() throws Exception {
		Statement state = JDBCUtil.getState();
		ResultSet query = state.executeQuery("select * from user");
		while (query.next()){
			System.out.println(query.getString(2));
		}
		
		
	}
	
	@Test
	public void testBaseDAO() throws Exception {
		
		UUID random = UUID.randomUUID();
		String replace = random.toString().replace("-", "");
		System.out.println(replace);
	}
	
}
