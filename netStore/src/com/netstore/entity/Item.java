package com.netstore.entity;

import java.io.Serializable;



public class Item implements Serializable  {
	
	private Integer iId;
	
	private Integer iNumber;
	
	private Double iPrice;
	
	private OrderList orderlist;
	
	private Product product;
	public Integer getiId() {
		return iId;
	}
	public void setiId(Integer iId) {
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
