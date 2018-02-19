package com.netstore.service;

import java.util.ArrayList;

import com.netstore.dao.ProductDao;
import com.netstore.entity.Product;

/**
 * 
 * @author 李尧坤
 *
 */
public class ProductService {
	private ProductDao productDao = new ProductDao();
	/**
	 * 查询所有产品
	 * @return
	 */
	public ArrayList<Product> getAllProduct()
	{
		return productDao.getAllProduct();
		
	}
}
