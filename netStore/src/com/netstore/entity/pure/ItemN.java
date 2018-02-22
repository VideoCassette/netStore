package com.netstore.entity.pure;

import java.util.Date;

/**
 * @author 陈东时
 * @version 1.1
 * 订单项实体类
 * 
 */
public class ItemN {
	/**
	 * 订单项主键
	 * 类型为字符串
	 * 生成策略为uuid
	 */
    private String iid;

    /**
	 * 加入订单的事件
	 */
    private Date idate;
    /**
	 * 对应的产品数量
	 */
    private Integer inumber;

	/**
	 * 产品的单价  注意是单价
	 */
    private Double iprice;
    /**
	 * 是否处于已经出售状态
	 */
    private Boolean isale;

    /**
	 * 一个订单项对应一个订单
	 */
    private String orderlistOid;
    
    /**
	 * 一个订单项对应一个产品
	 */
    private String productPid;

    public String getIid() {
        return iid;
    }

    public void setIid(String iid) {
        this.iid = iid ;
    }

    public Date getIdate() {
        return idate;
    }

    public void setIdate(Date idate) {
        this.idate = idate;
    }

    public Integer getInumber() {
        return inumber;
    }

    public void setInumber(Integer inumber) {
        this.inumber = inumber;
    }

    public Double getIprice() {
        return iprice;
    }

    public void setIprice(Double iprice) {
        this.iprice = iprice;
    }

    public Boolean getIsale() {
        return isale;
    }

    public void setIsale(Boolean isale) {
        this.isale = isale;
    }

    public String getOrderlistOid() {
        return orderlistOid;
    }

    public void setOrderlistOid(String orderlistOid) {
        this.orderlistOid = orderlistOid;
    }

    public String getProductPid() {
        return productPid;
    }

    public void setProductPid(String productPid) {
        this.productPid = productPid;
    }
}