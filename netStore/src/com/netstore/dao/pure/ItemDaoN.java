package com.netstore.dao.pure;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.netstore.dao.BaseDao;
import com.netstore.entity.pure.ItemN;

public class ItemDaoN extends BaseDao<ItemN> {

	
	/**
	 * 	1.添加订单项
	 * @param itemN
	 */
	public void addItem(ItemN itemN){
		String random = UUID.randomUUID().toString();
		String iid = random.replace("-", "");
		itemN.setIid(iid);
		String sql = "insert into item (iId,iDate,iNumber,iPrice,iSale,orderlist_oId,product_pId) values(?,?,?,?,?,?,?)";
		this.add(sql, itemN.getIid(),itemN.getIdate(),itemN.getInumber(),itemN.getIprice(),
				itemN.getIsale(),itemN.getOrderlistOid(),itemN.getProductPid());
		
	}
	
	/**
	 * 	2.修改订单项
	 * @param itemN
	 */
	public void updateItem(ItemN itemN){
		String sql = "update item set iDate=?,iNumber=?,iPrice=?,iSale=?,orderlist_oId=?,product_pId=? where iId=? ";
		this.add(sql, itemN.getIdate(),itemN.getInumber(),itemN.getIprice(),
				itemN.getIsale(),itemN.getOrderlistOid(),itemN.getProductPid(),itemN.getIid());
	}
	
	/**
	 * 	3.查询订单项   查询同一个订单的订单项
	 * @param fk
	 * @return
	 */
	public List<ItemN> findItemByFK(String fk){
		String sql = "select * from item where orderlist_oId ="+fk;
		return this.findAll(sql);
		
	}
	public List<ItemN> findItemIdFK(String iId){
		String sql = "select * from item where iId ="+iId;
		return this.findAll(sql);
		
	}
	
	
	/**
	 * 	4.删除订单项
	 * @param iid
	 */
	public void deleteItem(String iid){
		String sql = "delete from item where iId = ?";
		this.delete(sql, iid);
	}
	
	@Override
	public ItemN sealEntity(ResultSet resultset) {
		// TODO Auto-generated method stub
		ItemN i = new ItemN();
		try {
			i.setIid(resultset.getString("iId"));
			i.setIdate(resultset.getDate("iDate"));
			i.setInumber(resultset.getInt("iNumber"));
			i.setIprice(resultset.getDouble("iPrice"));
			i.setIsale(resultset.getBoolean("iSale"));
			i.setOrderlistOid(resultset.getString("orderlist_oId"));
			i.setProductPid(resultset.getString("product_pId"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public List<ItemN> sealEntities(ResultSet resultset) {
		// TODO Auto-generated method stub
		List<ItemN> itemNs = new ArrayList<ItemN>();
		try {
			while(resultset.next()){
				itemNs.add(this.sealEntity(resultset));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return itemNs;
	}

}
