package com.netstore.entity;

import java.io.Serializable;
import java.util.List;


public class OrderList implements Serializable  {

	private Integer oId;
	
	private Double oTotal;
	
	private Integer oStatus;
	
	private List<Item> list;
	
	private User user;

	public Integer getoId() {
		return oId;
	}

	public void setoId(Integer oId) {
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

	public List<Item> getList() {
		return list;
	}

	public void setList(List<Item> list) {
		this.list = list;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
