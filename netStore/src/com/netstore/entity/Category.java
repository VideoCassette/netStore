package com.netstore.entity;

import java.io.Serializable;
import java.util.List;




public class Category implements Serializable {
	
	private Integer cId;
	
	private String categoryName;
	
	private String cDesc;
	
	private List<Product> pList;
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getcDesc() {
		return cDesc;
	}
	public void setcDesc(String cDesc) {
		this.cDesc = cDesc;
	}
	public List<Product> getpList() {
		return pList;
	}
	public void setpList(List<Product> pList) {
		this.pList = pList;
	}
}
