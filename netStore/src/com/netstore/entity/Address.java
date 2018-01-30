package com.netstore.entity;

import java.io.Serializable;





public class Address implements Serializable {
	
	private Integer aId;
	
	private String aProvince;
	
	private String aCity;
	
	private String aTown;
	
	private String aDetail;
	
	private User user;
	public Integer getaId() {
		return aId;
	}
	public void setaId(Integer aId) {
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
