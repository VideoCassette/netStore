package com.netstore.entity;


/**
 * 
 * @author 陈东时
 * @version 1.0
 * 产品图片存放位置实体类
 */


public class Picture {

	/**
	 * 图片主键
	 * 类型为字符串
	 * 生成策略为UUID
	 */
	private String picId;

	/**
	 * 图片的url地址
	 * 如果在程序外部默认了统一的存储位置，可以进行只保存图片的文件名
	 */
	private String pUrl;

	/**
	 * 图片的数量
	 * 
	 */
	private Integer pCount;
	//////////////图片的外键关系///////////////
	/**
	 * 一个产品可以有多个图片
	 */
	private Product product;
	
	//setter and getter
	public String getPicId() {
		return picId;
	}
	public void setPicId(String picId) {
		this.picId = picId;
	}
	
	public String getpUrl() {
		return pUrl;
	}
	public void setpUrl(String pUrl) {
		this.pUrl = pUrl;
	}
	public Integer getpCount() {
		return pCount;
	}
	public void setpCount(Integer pCount) {
		this.pCount = pCount;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
	
	
}
