package com.netstore.entity;

import java.io.Serializable;
import java.util.List;


/**
 * 
 * @author 陈东时
 * @version 1.0
 * 用户地址实体类
 * 
 */


public class Address implements Serializable {
	
	/**
	 * 地址主键
	 * 类型为字符串
	 * 生成策略为uuid
	 */
	private String aId;
	
	/**
	 * 省份
	 */
	private String aProvince;
	
	/**
	 * 市
	 */
	private String aCity;
	
	/**
	 * 县
	 */
	private String aTown;
	
	/**
	 * 详细地址（街道）
	 */
	private String aDetail;
	
	/**
	 * 是否是默认地址
	 */
	private Boolean adefault;
	
	////////////以下是外键关系//////////
	
	/**
	 * 一个用户可以有多个地址
	 * 
	 */
	
	private User user;
	
	/**
	 * 一个地址可以有多个订单派送到这里
	 */
	private List<OrderList> orderLists;

	
	
	//setter and getter
	public String getaId() {
		return aId;
	}

	public void setaId(String aId) {
		this.aId = aId;
	}

	public String getaProvince() {
		return aProvince;
	}

	public void setaProvince(String aProvince) {
		this.aProvince = aProvince;
	}

	public String getaCity() {
		return aCity;
	}

	public void setaCity(String aCity) {
		this.aCity = aCity;
	}

	public String getaTown() {
		return aTown;
	}

	public void setaTown(String aTown) {
		this.aTown = aTown;
	}

	public String getaDetail() {
		return aDetail;
	}

	public void setaDetail(String aDetail) {
		this.aDetail = aDetail;
	}

	public Boolean getAdefault() {
		return adefault;
	}

	public void setAdefault(Boolean adefault) {
		this.adefault = adefault;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<OrderList> getOrderLists() {
		return orderLists;
	}

	public void setOrderLists(List<OrderList> orderLists) {
		this.orderLists = orderLists;
	}
	
}
