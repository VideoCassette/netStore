package com.netstore.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * @author 陈东时
 * @version 1.0
 * 评论列表实体类
 *
 */
public class Discuss implements Serializable {
	
	/**
	 * 评论主键
	 * 类型为字符串
	 * 生成策略为uuid
	 */
	private String dId;
	
	/**
	 * 评论内容
	 */
	private String dContext;
	
	/**
	 * 评论的星数 1-5 5星代表好评
	 */
	private Integer dScore;
	
	/**
	 * 评论时间
	 */
	private Date dDate;
	//////////////////////以下为外键关系///////////////
	
	/**
	 * 评论提供者
	 */
	private User user;
	
	/**
	 * 被评论的产品
	 */
	private Product product;
	
	
	//setter and getter
	public String getdId() {
		return dId;
	}
	public void setdId(String dId) {
		this.dId = dId;
	}
	public String getdContext() {
		return dContext;
	}
	public void setdContext(String dContext) {
		this.dContext = dContext;
	}
	public Integer getdScore() {
		return dScore;
	}
	public void setdScore(Integer dScore) {
		this.dScore = dScore;
	}
	public Date getdDate() {
		return dDate;
	}
	public void setdDate(Date dDate) {
		this.dDate = dDate;
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
