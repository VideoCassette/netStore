package com.netstore.dao.pure;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.netstore.dao.BaseDao;
import com.netstore.entity.pure.OrderlistN;

public class OrderlistDaoN extends BaseDao<OrderlistN> {

	/**
	 * 	1.添加订单
	 * @param orderlistN
	 */
	public void addOrderlist(OrderlistN orderlistN){
		UUID random = UUID.randomUUID();
		String oid = random.toString().replace("-", "");
		orderlistN.setOid(oid);
		String sql = "insert into orderlist(oId,oStatus,oTotal,address_aId,user_uId) values(?,?,?,?,?)";
		this.add(sql, orderlistN.getOid(), orderlistN.getOstatus(), orderlistN.getOtotal(),
				orderlistN.getAddressAid(), orderlistN.getUserUid());
		
		
	}
	
	/**
	 * 	2.修改订单
	 * @param orderlistN
	 */
	public void updateOrderlist(OrderlistN orderlistN){
		String sql = "update orderlist set oStatus=?,oTotal=?,address_aId=?,user_uId=? where oId=?";
		this.update(sql,  orderlistN.getOstatus(), orderlistN.getOtotal(),
				orderlistN.getAddressAid(), orderlistN.getUserUid(),orderlistN.getOid());
	}
	/**
	 * 	3.1查询用户的所有订单
	 * @param uid
	 * @return
	 */
	public List<OrderlistN> findOrderlistByUser(String uid){
		String sql = "select * from user where user_uId='"+uid+"'";
		return this.findAll(sql);
	}
	/**
	 * 	3.2查询用户的订单 
	 * @param uid
	 * @return
	 */
	public OrderlistN findOrderlistByUserAnd(String uid){
		String sql = "select * from user where user_uId='"+uid+"' and oStatus=0 ";
		return this.find(sql);
	}
	
	
	/**
	 * 	4.删除订单 入参为订单号id
	 * @param oId
	 */
	public void deleteOrderlist(String oId){
		String sql = "delete from orderlist where oId=?";
		this.delete(sql, oId);
	}
	
	
	@Override
	public OrderlistN sealEntity(ResultSet resultset) {
		// TODO Auto-generated method stub
		OrderlistN o = new OrderlistN();
		try {
			o.setOid(resultset.getString("oId"));	
			o.setOstatus(resultset.getInt("oStatus"));	
			o.setOtotal(resultset.getDouble("oTotal"));	
			o.setAddressAid(resultset.getString("address_aId"));	
			o.setUserUid(resultset.getString("user_uId"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return o;
	}

	@Override
	public List<OrderlistN> sealEntities(ResultSet resultset) {
		// TODO Auto-generated method stub
		List<OrderlistN> orderlistNs = new ArrayList<OrderlistN>();
		try {
			while(resultset.next()){
				orderlistNs.add(this.sealEntity(resultset));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orderlistNs;
	}

}
