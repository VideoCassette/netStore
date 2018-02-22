package com.netstore.dao.pure;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.netstore.dao.BaseDao;
import com.netstore.entity.pure.ItemN;
import com.netstore.entity.pure.ProductN;

public class ProductDaoN extends BaseDao<ProductN> {

	/**
	 *  1、添加商品
	 * @param productN
	 * @return
	 */
	public Integer inertProduct(ProductN productN) {
		String sql = "insert into product (pId,pDesc,pName,pNumber,pPrice,pSaleNum,pTemp,category_cId,user_uId)values(?,?,?,?,?,?,?,?,?)";

		UUID random = UUID.randomUUID();
		String uid = random.toString().replace("-", "");
		productN.setPid(uid);
		return this.add(sql,productN,productN.getPid(),productN.getPdesc(),productN.getPname(),
				productN.getPnumber(),productN.getPprice(),productN.getPsalenum(),productN.getPtemp(),
				productN.getCategoryCid(),productN.getUserUid()
				);
	}

	/**
	 *  2、修改商品
	 * @param productN
	 * @return
	 */
	public Integer updateProduct(ProductN productN){
		String sql = "update product set pDesc=?,pName=?,pNumber=?,pPrice=?,pSaleNum=?,pTemp=?,category_cId=?,user_uId=? where pid=?";

		
		return this.update(sql,productN.getPdesc(),productN.getPname(),
				productN.getPnumber(),productN.getPprice(),productN.getPsalenum(),productN.getPtemp(),
				productN.getCategoryCid(),productN.getUserUid(),productN.getPid()
				);
		
	}
	/**
	 *  3、查询商品
	 *  3.1查询所有商品
	 * @return
	 */
	public List<ProductN> findProducts(){
		String sql = "select * from product";
		List<ProductN> productNs = this.findAll(sql);
		return productNs;
	}
	/**
	 * 3.2根据pid查询商品
	 * @param pid
	 * @return
	 */
	public ProductN findProductNById(String pid){
		String sql = "select * from product where pid = ?";
		return this.find(sql, pid);
	}
	
	
	/**
	 * 3.3根据uid查询商品
	 * @param user_uId
	 * @return
	 */
	public List<ProductN> findProductNByUid(String user_uId){
		String sql = "select * from product where user_uId = '"+user_uId+"'";
		return this.findAll(sql);
	}
	/**
	 *  4、删除商品（考虑级联删除Item表中的相关字段）
	 * @param productN
	 * @return
	 */
	public Integer deleteProduct(ProductN productN){
		//1、删除Item中的产品
		String SQL = "delete from item where product_pId = '"+productN.getPid()+"'";
		Integer index = this.delete(SQL, null);
		if(index!=0){
			//2、删除产品表记录
			String sql =  "delete from product where pid = '"+productN.getPid()+"'";
			return this.update(sql, null);
			
		}else{
			return 2;
		}

	}

	@Override
	public ProductN sealEntity(ResultSet resultset) {
		// TODO Auto-generated method stub
		ProductN productN = new ProductN();
		try {
		
			productN.setPid(resultset.getString("pId"));
			productN.setPdesc(resultset.getString("pDesc"));
			productN.setPname(resultset.getString("pName"));
			productN.setPnumber(resultset.getInt("pNumber"));
			productN.setPprice(resultset.getDouble("pPrice"));
			productN.setPsalenum(resultset.getInt("pSaleNum"));
			productN.setPtemp(resultset.getInt("pTemp"));
			productN.setCategoryCid(resultset.getString("category_cId"));
			productN.setUserUid(resultset.getString("user_uId"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return productN;
	}

	@Override
	public List<ProductN> sealEntities(ResultSet resultset) {
		// TODO Auto-generated method stub
		List<ProductN> productNs = new ArrayList<ProductN>();
		try {
			while(resultset.next()){
				ProductN entity = this.sealEntity(resultset);
				productNs.add(entity);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return productNs;
	}

}
