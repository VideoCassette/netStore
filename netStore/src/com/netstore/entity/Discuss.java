package com.netstore.entity;

import java.io.Serializable;



public class Discuss implements Serializable {
	
	private Integer dId;
	
	private String dDiscuss;
	
	private Integer dScore;
	
	private User user;

	private Product product;
	public Integer getdId() {
		return dId;
	}
	public void setdId(Integer dId) {
		this.dId = dId;
	}
	public String getdDiscuss() {
		return dDiscuss;
	}
	public void setdDiscuss(String dDiscuss) {
		this.dDiscuss = dDiscuss;
	}
	public Integer getdScore() {
		return dScore;
	}
	public void setdScore(Integer dScore) {
		this.dScore = dScore;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
}
