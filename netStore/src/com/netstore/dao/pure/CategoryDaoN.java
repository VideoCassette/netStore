package com.netstore.dao.pure;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.netstore.dao.BaseDao;
import com.netstore.entity.pure.CategoryN;

public class CategoryDaoN extends BaseDao<CategoryN> {
	
	
	/**
	 * 	1.增加分类
	 * @param categoryN
	 */
	public void  addCategory(CategoryN categoryN){
		UUID random = UUID.randomUUID();
		String cid = random.toString().replace("-", "");
		categoryN.setCid(cid);
		String sql = "insert into category(cId，cColor，cDesc，cName，cRom，cScreenSize)VALUES(?,?,?,?,?,?)";
		this.add(sql, categoryN.getCid(),categoryN.getCcolor(),categoryN.getCdesc(),
				categoryN.getCname(),categoryN.getCrom(),categoryN.getCscreensize());
	}
	
	
	/**
	 * 	2.修改分类
	 * @param categoryN
	 */
	public void  updateCategory(CategoryN categoryN){
		String sql = "update category set cColor=?,cDesc=?,cName=?,cRom=?,cScreenSize=? where cId=?";
		this.add(sql, categoryN.getCcolor(),categoryN.getCdesc(),categoryN.getCname(),
				categoryN.getCrom(),categoryN.getCscreensize(),categoryN.getCid());
	}
	/**
	 * 	3.查询分类
	 * @param cName
	 * @return
	 */
	public CategoryN findCategoryByName(String cName){
		String sql = "select * from category where cName = ?";
		return this.find(sql, cName);
	}
	public CategoryN findCategoryById(String cId){
		String sql = "select * from category where cId = ?";
		return this.find(sql, cId);
	}
	public List<CategoryN> findCategories(String cName){
		String sql = "select * from category";
		return this.findAll(sql);
	}
	
	/**
	 * 	4.删除分类
	 * @param cid
	 */
	
	public void deleteCagtegory(Integer cid){
		String sql = "delete from category where cId = ?";
		this.delete(sql, cid);
	}
	

	@Override
	public CategoryN sealEntity(ResultSet resultset) {
		// TODO Auto-generated method stub
		CategoryN c = new CategoryN();
		try {
			c.setCcolor(resultset.getString("cColor"));
			c.setCdesc(resultset.getString("cDesc"));
			c.setCid(resultset.getString("cId"));
			c.setCname(resultset.getString("cName"));
			c.setCrom(resultset.getInt("cRom"));
			c.setCscreensize(resultset.getInt("cScreenSize"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;

	}

	@Override
	public List<CategoryN> sealEntities(ResultSet resultset) {
		// TODO Auto-generated method stub
		List<CategoryN> categoryNs = new ArrayList<CategoryN>();
		try {
			while (resultset.next()){
				categoryNs.add(this.sealEntity(resultset));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return categoryNs;
	}

}
