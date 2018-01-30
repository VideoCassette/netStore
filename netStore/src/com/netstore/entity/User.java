package com.netstore.entity;

import java.io.Serializable;
import java.util.List;





/**
 * 用户实体类
 * @author Administrator
 *
 */

public class User implements Serializable{
	private Integer uId;
	
	private String uName;
	
	private String uPassword;
	
	private String uSign;
	
	private boolean uStatus;
	private  List<Address> address;
	
	private List<OrderList>list;
	
	private List<Discuss> discuss;

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public String getuSign() {
		return uSign;
	}

	public void setuSign(String uSign) {
		this.uSign = uSign;
	}

	public boolean isuStatus() {
		return uStatus;
	}

	public void setuStatus(boolean uStatus) {
		this.uStatus = uStatus;
	}

	public List<Address> getAdress() {
		return address;
	}

	public void setAdress(List<Address> address) {
		this.address = address;
	}

	public List<OrderList> getList() {
		return list;
	}

	public void setList(List<OrderList> list) {
		this.list = list;
	}

	public List<Discuss> getDiscuss() {
		return discuss;
	}

	public void setDiscuss(List<Discuss> discuss) {
		this.discuss = discuss;
	}
}
