package com.netstore.entity.pure;

public class OrderlistN {
    private String oid;

    private Integer ostatus;

    private Double ototal;

    private String addressAid;

    private Integer userUid;

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
        this.addressAid;
    }

    public Integer getUserUid() {
        return userUid;
    }

    public void setUserUid(Integer userUid) {
        this.userUid = userUid;
    }
}