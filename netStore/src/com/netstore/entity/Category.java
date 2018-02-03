package com.netstore.entity;

import java.io.Serializable;
import java.util.List;



/**
 * 
 * @author 陈东时
 * @version 1.0
 * 产品分类实体类
 *
 */

public class Category implements Serializable {
	
	/**
	 * 分类id
	 * 类型为字符串
	 * 生成策略为UUID
	 */
	
	private String cId;
	/**
	 * 分类名称
	 * 
	 */
	private String cName;
	
	/**
	 * 分类描述
	 */
	private String cDesc;
	
	/**
	 * 屏幕大小
	 */
	private Integer cScreenSize;
	
	/**
	 * 手机颜色
	 */
	private String cColor;
	
	/**
	 * 内存大小
	 */
	private Integer cRom;
	
//////////////////////以下是外键关系//////////////////
	/**
	 * 分类与产品是外键关系
	 */
	private List<Product> products;

	
	//setter and getter
	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcDesc() {
		return cDesc;
	}

	public void setcDesc(String cDesc) {
		this.cDesc = cDesc;
	}

	public Integer getcScreenSize() {
		return cScreenSize;
	}

	public void setcScreenSize(Integer cScreenSize) {
		this.cScreenSize = cScreenSize;
	}

	

	public String getcColor() {
		return cColor;
	}

	public void setcColor(String cColor) {
		this.cColor = cColor;
	}

	public Integer getcRom() {
		return cRom;
	}

	public void setcRom(Integer cRom) {
		this.cRom = cRom;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	
	
	
	
	
}
