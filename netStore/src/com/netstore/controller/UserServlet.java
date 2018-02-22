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
		System.out.println(op);
		if("queryUsers".equalsIgnoreCase(op)){
			List<UserN> queryUsers = this.queryUsers();
			request.setAttribute("queryUsers", queryUsers);
			request.getRequestDispatcher("/admin/userlist.jsp").forward(request, response);
			return ;
			
		}else if("queryUserUnchecked".equalsIgnoreCase(op)){
			
			
			List<UserN> queryUserUnchecked = this.queryUserUnchecked();
			request.setAttribute("queryUsers", queryUserUnchecked);
			request.getRequestDispatcher("/admin/userlist.jsp").forward(request, response);
			return ;
		}else if("checkedUser".equals(op)){
			String uid = request.getParameter("uid");
			this.checkedUser(uid);
			List<UserN> queryUsers = this.queryUsers();
			request.setAttribute("queryUsers", queryUsers);
			request.getRequestDispatcher("/admin/userlist.jsp").forward(request, response);
			return ;
		}else if("unCheckedUser".equals(op)){
		String uid = request.getParameter("uid");
		this.unCheckedUser(uid);
		List<UserN> queryUsers = this.queryUsers();
		request.setAttribute("queryUsers", queryUsers);
		request.getRequestDispatcher("/admin/userlist.jsp").forward(request, response);
		return ;
	}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
	/**
	 * 控制台查询所有用户
	 * @return
	 */
	private List<UserN> queryUsers(){
		UserService userservice = new UserService();
		return userservice.queryUsers();
	}
	/**
	 * 查询未审核用户
	 * @return
	 */
	private List<UserN> queryUserUnchecked(){
		UserService userservice = new UserService();
		return userservice.queryUserUnchecked();
	}
	
	/**
	 * 审核用户
	 * @return
	 */
	private Integer checkedUser(String uid){
		UserService userservice = new UserService();
		return userservice.checkUser(uid);
	}
	
	/**
	 * 用户禁用
	 * @return
	 */
	private Integer unCheckedUser(String uid){
		UserService userservice = new UserService();
		return userservice.unCheckedUser(uid);
	}
	
	

}
