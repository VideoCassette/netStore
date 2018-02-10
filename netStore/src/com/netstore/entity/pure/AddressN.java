package com.netstore.entity.pure;

public class AddressN {
    private String aid;

    private String acity;

    private String adetail;

    private String aprovince;

    private String atown;

    private Boolean adefault;

    private Integer userUid;

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

    public Integer getUserUid() {
        return userUid;
    }

    public void setUserUid(Integer userUid) {
        this.userUid = userUid;
    }
}