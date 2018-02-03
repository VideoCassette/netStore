package com.netstore.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class OrderList implements Serializable  {
	/**
	 * 订单主键
	 * 类型为字符串
	 * 生成策略为uuid
	 */
	private String oId;
	
	/**
	 * 订单总金额（通过程序计算之后存入数据库
	 */
	
	private Double oTotal;
	
	/**
	 * 订单状态
	 * 0：代表临时订单
	 * 1：代表已提交未付款订单
	 * 2：代表已已提交已付款订单
	 * 3：代表已提交已到货订单
	 * 4：代表已完成订单
	 */
	private Integer oStatus;
//////////////////////以下为外键关系///////////////
	/**
	 * 一个订单有多个订单项
	 */
	private List<Item> items;
	/**
	 * 一个订单只有一个用户
	 */
	private User user;
	
	/**
	 * 一个订单只有一个派送地址
	 */
	private Address address;

	
	//setter and getter
	public String getoId() {
		return oId;
	}

	public void setoId(String oId) {
		this.oId = oId;
	}

	public Double getoTotal() {
		return oTotal;
	}

	public void setoTotal(Double oTotal) {
		this.oTotal = oTotal;
	}

	public Integer getoStatus() {
		return oStatus;
	}

	public void setoStatus(Integer oStatus) {
		this.oStatus = oStatus;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
}
