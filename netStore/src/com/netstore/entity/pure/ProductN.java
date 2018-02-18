package com.netstore.entity.pure;

public class ProductN {
    private String pid;

    private String pdesc;

    private String pname;

    private Integer pnumber;

    private Double pprice;

    private Integer psalenum;

    private Integer ptemp;

    private String categoryCid;

    private String userUid;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPnumber() {
        return pnumber;
    }

    public void setPnumber(Integer pnumber) {
        this.pnumber = pnumber;
    }

    public Double getPprice() {
        return pprice;
    }

    public void setPprice(Double pprice) {
        this.pprice = pprice;
    }

    public Integer getPsalenum() {
        return psalenum;
    }

    public void setPsalenum(Integer psalenum) {
        this.psalenum = psalenum;
    }

    public Integer getPtemp() {
        return ptemp;
    }

    public void setPtemp(Integer ptemp) {
        this.ptemp = ptemp;
    }

    public String getCategoryCid() {
        return categoryCid;
    }

    public void setCategoryCid(String categoryCid) {
        this.categoryCid = categoryCid;
    }

    public String getUserUid() {
        return userUid;
    }

    public void setUserUid(String string) {
        this.userUid = string;
    }
}