package com.netstore.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.netstore.entity.Product;
import com.netstore.entity.pure.ProductN;
import com.netstore.service.ProductService;

/**
 * 
 * @author 李尧坤
 * 
 */
public class ProductServlet extends HttpServlet {
	private ProductService productService = new ProductService();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String op = request.getParameter("op");
		if (op.equals("query")) {
			this.query(request, response);
		} else if (op.equals("del")) {
			this.del(request, response);
		}

	}

	public void query(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String productid = request.getParameter("productid");
		System.out.println(productid + "");
		ArrayList<Product> list = productService.getAllProduct(productid);

		request.setAttribute("product_List", list);
		request.getRequestDispatcher("back/productlist.jsp").forward(request,
				response);

	}

	public void del(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String strArticleId = request.getParameter("articleId");
		System.out.println("id:" + strArticleId);
		if (strArticleId != null) {
			if (productService.delArticle(Integer.parseInt(strArticleId))) {
				System.out.println("删除成功！");

			}
		}
		ArrayList<Product> list = productService.getAllProduct(null);
		request.setAttribute("product_List", list);

		request.getRequestDispatcher("back/productdel.jsp").forward(request,
				response);

	}

	public List<ProductN> queryProducts(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// productService.getAllProduct();

		return null;
	}

}
