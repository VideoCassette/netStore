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
	 * @param productid 
	 * @return
	 */
	public ArrayList<Product> getAllProduct(String productid)
	{
		return productDao.getAllProduct(productid);
		
	}
	/**
	 * 删除产品
	 * @param pID
	 * @return
	 */
	public boolean delArticle(int pID){
		if(productDao.delProduct(pID)>0)return true;
		return false;
	}
}
