package com.netstore.junit;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

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
	
}
