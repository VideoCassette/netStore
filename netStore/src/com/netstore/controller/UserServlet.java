package com.netstore.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.netstore.entity.pure.UserN;
import com.netstore.service.UserService;

public class UserServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置编码
		request.setCharacterEncoding("UTF8");
		response.setContentType(" text/html;charset=utf-8");
		
		String op = request.getParameter("OP");
		if("queryUsers".equalsIgnoreCase(op)){
			List<UserN> queryUsers = this.queryUsers();
			request.setAttribute("queryUsers", queryUsers);
			System.out.println(queryUsers.size());
			request.getRequestDispatcher("/admin/userlist.jsp").forward(request, response);
			return ;
			
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
	/**
	 * 控制台查询用户
	 * @return
	 */
	private List<UserN> queryUsers(){
		UserService userservice = new UserService();
		return userservice.queryUsers();
	}
	
	

}
