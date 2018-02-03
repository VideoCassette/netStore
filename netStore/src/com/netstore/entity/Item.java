package com.netstore.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * @author 陈东时
 * @version 1.0
 * 订单项实体类
 * 
 */


public class Item implements Serializable  {
	
	/**
	 * 订单项主键
	 * 类型为字符串
	 * 生成策略为uuid
	 */

	private String iId;
	
	/**
	 * 对应的产品数量
	 */
	private Integer iNumber;
	
	/**
	 * 产品的单价  注意是单价
	 */
	private Double iPrice;
	
	/**
	 * 是否处于已经出售状态
	 */
	private Boolean iSale;
	
	/**
	 * 加入订单的事件
	 */
	private Date iDate;
	
	//////////////////////以下为外键关系///////////////
	/**
	 * 一个订单项对应一个订单
	 */
	private OrderList orderlist;
	
	/**
	 * 一个订单项对应一个产品
	 */
	private Product product;
	
	
	
	//setter and getter
	public String getiId() {
		return iId;
	}
	public void setiId(String iId) {
		this.iId = iId;
	}
	public Integer getiNumber() {
		return iNumber;
	}
	public void setiNumber(Integer iNumber) {
		this.iNumber = iNumber;
	}
	public Double getiPrice() {
		return iPrice;
	}
	public void setiPrice(Double iPrice) {
		this.iPrice = iPrice;
	}
	public Boolean getiSale() {
		return iSale;
	}
	public void setiSale(Boolean iSale) {
		this.iSale = iSale;
	}
	public Date getiDate() {
		return iDate;
	}
	public void setiDate(Date iDate) {
		this.iDate = iDate;
	}
	public OrderList getOrderlist() {
		return orderlist;
	}
	public void setOrderlist(OrderList orderlist) {
		this.orderlist = orderlist;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

}
