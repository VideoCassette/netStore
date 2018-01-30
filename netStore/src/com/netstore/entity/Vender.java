package com.netstore.entity;

import java.io.Serializable;
import java.util.List;


public class Vender implements Serializable {
	private Integer vId;
	
	private String vName;
	
	private String vPassword;
	
	private String vDesc;
	
	private boolean vStatus;
	
	private Integer vConfirm;
	
	private List<Product> pList;

	public Integer getvId() {
		return vId;
	}

	public void setvId(Integer vId) {
		this.vId = vId;
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public String getvPassword() {
		return vPassword;
	}

	public void setvPassword(String vPassword) {
		this.vPassword = vPassword;
	}

	public String getvDesc() {
		return vDesc;
	}

	public void setvDesc(String vDesc) {
		this.vDesc = vDesc;
	}

	public boolean isvStatus() {
		return vStatus;
	}

	public void setvStatus(boolean vStatus) {
		this.vStatus = vStatus;
	}

	public Integer getvConfirm() {
		return vConfirm;
	}

	public void setvConfirm(Integer vConfirm) {
		this.vConfirm = vConfirm;
	}

	public List<Product> getList() {
		return pList;
	}

	public void setList(List<Product> pList) {
		this.pList = pList;
	}
}
