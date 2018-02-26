package com.netstore.entity;

import java.io.Serializable;
import java.util.List;


/**
 * @author 陈东时
 * @version 1.0
 * 产品实体类
 * 
 */
public class Product implements Serializable {
	
	/**
	 * 产品主键
	 * 类型为字符串
	 * 生成策略为UUID
	 */
	private String pId;
	
	/**
	 * 产品名称
	 * 描述产品的名称
	 */
	private String pName;
	
	/**
	 * 产品数量
	 * 商家进行操作
	 * 作为产品的库存数量；
	 */
	private Integer pNumber;
	
	/**
	 * 产品价格 
	 * 商家进行操作
	 */
	private Double pPrice;
	
	/**
	 * 产品销售数量
	 * 在业务逻辑层进行操作
	 * 当商家进行操作的时候，此数量自动清零
	 */
	private Integer pSaleNum;
	
	/**
	 * 产品被加入购物车还未出售的数量
	 * 在业务逻辑层进行操作
	 * 当商家进行操作的时候，此数量不清零
	 * 就是在产品被加入购物车的时候，数量从总数量中扣减，放到此项中，当确定购买
	 * 之后，从此项扣减，加入销量项pSaleNum
	 */
	private Integer pTemp;
	
	/**
	 * 产品的描述
	 * 与产品名称一样做为搜索栏的模糊搜索依据
	 */
	private String pDesc;
	
	/**
	 * 产品审核状态，参见用户审核状态
	 */
	private Integer pState;
	//////////////////////以下是外键关系//////////////
	/**
	 * 产品类别
	 * 由厂家进行操作，实现功能如下：
		 * 增加产品类别
		 * 修改产品类别
		 * 删除产品类别
	 */
	private Category category;

	/**
	 * 对应厂家
	 * 在登录过程中进行操作
	 * 
	 */
	private User user;
	
	/**
	 * 购物车单项（订单单项）理解就行
	 * 一个产品可以被多个购物车收入，成为购物车其中的一个单项
	 */
	private List<Item>items;

	/**
	 * 评论数量
	 * 一个产品有多个评论
	 */
	private List<Discuss> discusses;
	
	/**
	 * 产品图片，默认是五个（并没有在数据库或者实体类中进行约束）
	 */
	private List<Picture> pictures;

	//setter and getter
	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
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

	public Integer getpSaleNum() {
		return pSaleNum;
	}

	public void setpSaleNum(Integer pSaleNum) {
		this.pSaleNum = pSaleNum;
	}

	public Integer getpTemp() {
		return pTemp;
	}

	public void setpTemp(Integer pTemp) {
		this.pTemp = pTemp;
	}

	public String getpDesc() {
		return pDesc;
	}

	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}

	public Integer getpState() {
		return pState;
	}

	public void setpState(Integer pState) {
		this.pState = pState;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<Discuss> getDiscusses() {
		return discusses;
	}

	public void setDiscusses(List<Discuss> discusses) {
		this.discusses = discusses;
	}

	public List<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
	
	
	
	
}
