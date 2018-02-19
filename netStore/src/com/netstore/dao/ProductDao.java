package com.netstore.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.netstore.entity.Product;

/**
 * 
 * @author 李尧坤
 *
 */
public class ProductDao extends DaseDao<Product> implements GetEntity<Product>{

	

	public ArrayList<Product> getAllProduct()
	{
		ArrayList<Product> articleList = new ArrayList<Product>();
		String sql="select * from product where 1=1 ";
		StringBuffer sb = new StringBuffer(sql);
	
//		if(title!=null &&!"".equals(title)){
//			sb.append(" and articletitle like '%"+title+"%'");
//		}
//		
//		if(author!=null &&!"".equals(author)){
//			sb.append(" and author like '%"+author+"%'");
//		}
		
		articleList=(ArrayList<Product>) this.query(sb.toString(),this);
		System.out.println("articleList:"+articleList);
		System.out.println("sql"+sb.toString());
		return articleList;
	}
	



	@Override
	public Product getEntity(ResultSet rs) throws SQLException {
		Product p = new Product();
		p.setpId(rs.getString("pid"));
		p.setpDesc(rs.getString("pDesc"));
		p.setpName(rs.getString("pName"));
		p.setpNumber(rs.getInt("pNumber"));
		p.setpPrice(rs.getDouble("pPrice"));
		p.setpSaleNum(rs.getInt("pSaleNum"));
		p.setpTemp(rs.getInt("pTemp"));
		return p;
	}


	
}
