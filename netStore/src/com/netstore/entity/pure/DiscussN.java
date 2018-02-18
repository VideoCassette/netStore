package com.netstore.entity.pure;

import java.util.Date;

public class DiscussN {
    private String did;

    private String dcontext;

    private Date ddate;

    private Integer dscore;

    private String productPid;

    private String userUid;

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getDcontext() {
        return dcontext;
    }

    public void setDcontext(String dcontext) {
        this.dcontext = dcontext;
    }

    public Date getDdate() {
        return ddate;
    }

    public void setDdate(Date ddate) {
        this.ddate = ddate;
    }

    public Integer getDscore() {
        return dscore;
    }

    public void setDscore(Integer dscore) {
        this.dscore = dscore;
    }

    public String getProductPid() {
        return productPid;
    }

    public void setProductPid(String productPid) {
        this.productPid = productPid;
    }

    public String getUserUid() {
        return userUid;
    }

    public void setUserUid(String userUid) {
        this.userUid = userUid;
    }
}