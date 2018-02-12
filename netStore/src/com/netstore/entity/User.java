package com.netstore.entity;

import java.io.Serializable;
import java.util.List;


/**
 * 用户实体类
 * @author Administrator
 * @version 1.0
 */

public class User implements Serializable{
	
	/**
	 * 地址主键
	 * 类型为字符串
	 * 生成策略为uuid
	 */
	private String uId;
	
	/**
	 * 用户账号 
	 */
	
	private String uName;
	/**
	 * 用户密码
	 */
	private String uPassword;
	/**
	 * 用户个性签名
	 */
	private String uSign;
	/**
	 * 用户状态(是否登录)
	 */
	private boolean uStatus;
	/**
	 * 用户等级（100为超级用户，200为商家用户，300为普通消费者用户）
	 * 用户账号状态（主要针对商家）201已注册未审核 202已审核未通过 203已审核已通过
	 */
	private Integer uGrade;
	
	
	///////////////以下为外键关系///
	
	/**
	 * 一个用户可以有多个地址列表
	 */
	private  List<Address> addresses;
	/**
	 * 一个用户可以有多个订单
	 */
	private List<OrderList> orderLists;
	/**
	 * 一个用户可以有多个评论
	 */
	private List<Discuss> discusses;
	
	
	
	//setter and getter
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public String getuSign() {
		return uSign;
	}
	public void setuSign(String uSign) {
		this.uSign = uSign;
	}
	public boolean isuStatus() {
		return uStatus;
	}
	public void setuStatus(boolean uStatus) {
		this.uStatus = uStatus;
	}
	public Integer getuGrade() {
		return uGrade;
	}
	public void setuGrade(Integer uGrade) {
		this.uGrade = uGrade;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public List<OrderList> getOrderLists() {
		return orderLists;
	}
	public void setOrderLists(List<OrderList> orderLists) {
		this.orderLists = orderLists;
	}
	public List<Discuss> getDiscusses() {
		return discusses;
	}
	public void setDiscusses(List<Discuss> discusses) {
		this.discusses = discusses;
	}
	

}
