package com.netstore.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.netstore.entity.Product;
import com.netstore.service.ProductService;
/**
 * 
 * @author 李尧坤
 *
 */
public class ProductServlet extends HttpServlet {
	private ProductService productService = new ProductService();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public ProductServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String op = request.getParameter("op");
		if(op.equals("query"))
		{
			
			this.query(request, response);
		}
		
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Product>  list =  productService.getAllProduct();
		PrintWriter out = response.getWriter();
		Gson gson = new Gson();
		String strJson = gson.toJson(list);
		
		
		response.setContentType("application/json");
		out.print(strJson);
		out.close();
		
	}

	public void query(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Product>  list =  productService.getAllProduct();
//		PrintWriter out = response.getWriter();
//		Gson gson = new Gson();
//		String strJson = gson.toJson(list);
//		
//		
//		response.setContentType("application/json");
//		out.print(strJson);
//		out.close();
		request.setAttribute("product_List", list);
		request.getRequestDispatcher("back/productlist.jsp").forward(
				request, response);
		
	}


}
