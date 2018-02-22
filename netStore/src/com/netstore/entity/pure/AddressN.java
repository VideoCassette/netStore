package com.netstore.entity.pure;
/**
 * 
 * @author 陈东时
 * @version 1.1
 * 用户地址实体类
 * 
 */
public class AddressN {
	/**
	 * 地址主键
	 * 类型为字符串
	 * 生成策略为uuid
	 */
    private String aid;
    /**
	 * 市
	 */
    private String acity;
    /**
	 * 详细地址（街道）
	 */
    private String adetail;
    /**
	 * 省份
	 */
    private String aprovince;
    /**
	 * 县
	 */
    private String atown;
    /**
	 * 是否是默认地址
	 */
    private Boolean adefault;
    /**
	 * 一个用户可以有多个地址
	 * 
	 */
    private String userUid;

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid == null ? null : aid.trim();
    }

    public String getAcity() {
        return acity;
    }

    public void setAcity(String acity) {
        this.acity = acity == null ? null : acity.trim();
    }

    public String getAdetail() {
        return adetail;
    }

    public void setAdetail(String adetail) {
        this.adetail = adetail;
    }

    public String getAprovince() {
        return aprovince;
    }

    public void setAprovince(String aprovince) {
        this.aprovince = aprovince;
    }

    public String getAtown() {
        return atown;
    }

    public void setAtown(String atown) {
        this.atown = atown ;
    }

    public Boolean getAdefault() {
        return adefault;
    }

    public void setAdefault(Boolean adefault) {
        this.adefault = adefault;
    }

    public String getUserUid() {
        return userUid;
    }

    public void setUserUid(String string) {
        this.userUid = string;
    }
}