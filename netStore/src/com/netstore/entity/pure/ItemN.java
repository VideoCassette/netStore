package com.netstore.entity.pure;

import java.util.Date;

public class ItemN {
    private String iid;

    private Date idate;

    private Integer inumber;

    private Double iprice;

    private Boolean isale;

    private String orderlistOid;

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