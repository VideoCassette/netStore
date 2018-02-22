package com.netstore.entity.pure;

/**
 * @author 陈东时
 * 订单实体类
 */
public class OrderlistN {
	/**
	 * 订单主键
	 * 类型为字符串
	 * 生成策略为uuid
	 */
    private String oid;

    /**
	 * 订单状态
	 * 0：代表临时订单
	 * 1：代表已提交未付款订单
	 * 2：代表已已提交已付款订单
	 * 3：代表已提交已到货订单
	 * 4：代表已完成订单
	 */
    private Integer ostatus;
    
    /**
	 * 订单总金额（通过程序计算之后存入数据库
	 */
    private Double ototal;
    
    /**
	 * 一个订单只有一个派送地址
	 */
    private String addressAid;
    /**
	 * 一个订单只有一个用户
	 */
    private String userUid;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Integer getOstatus() {
        return ostatus;
    }

    public void setOstatus(Integer ostatus) {
        this.ostatus = ostatus;
    }

    public Double getOtotal() {
        return ototal;
    }

    public void setOtotal(Double ototal) {
        this.ototal = ototal;
    }

    public String getAddressAid() {
        return addressAid;
    }

    public void setAddressAid(String addressAid) {
        this.addressAid = addressAid;
    }

    public String getUserUid() {
        return userUid;
    }

    public void setUserUid(String userUid) {
        this.userUid = userUid;
    }
}