package com.netstore.entity;

import java.io.Serializable;
import java.util.List;


public class Product implements Serializable {
	private Integer pId;
	
	private String pName;
	
	private Integer pNumber;
	
	private Double pPrice;
	
	private String pDesc;
	
	private Category category;
	
	private Vender vender;
	
	
	private List<Item>list;
	
	private List<Discuss> discuss;

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Integer getpNumber() {
		return pNumber;
	}

	public void setpNumber(Integer pNumber) {
		this.pNumber = pNumber;
	}

	public Double getpPrice() {
		return pPrice;
	}

	public void setpPrice(Double pPrice) {
		this.pPrice = pPrice;
	}

	public String getpDesc() {
		return pDesc;
	}

	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Vender getVender() {
		return vender;
	}

	public void setVender(Vender vender) {
		this.vender = vender;
	}

	public List<Item> getList() {
		return list;
	}

	public void setList(List<Item> list) {
		this.list = list;
	}

	public List<Discuss> getDiscuss() {
		return discuss;
	}

	public void setDiscuss(List<Discuss> discuss) {
		this.discuss = discuss;
	}
}
