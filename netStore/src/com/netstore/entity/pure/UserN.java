package com.netstore.entity.pure;

/**
 * 用户实体类
 * @author Administrator
 * @version 1.1
 */
public class UserN {
	
	/**
	 * 地址主键
	 * 类型为字符串
	 * 生成策略为uuid
	 */
    private String uid;

    /**
	 * 用户等级（100为超级用户，200为商家用户，300为普通消费者用户）
	 * 用户账号状态（主要针对商家）201已注册未审核 202已审核未通过 203已审核已通过
	 */
    private Integer ugrade;

    /**
	 * 用户账号 
	 */
    private String uname;

    /**
	 * 用户密码
	 */
    private String upassword;
    /**
	 * 用户个性签名
	 */
    private String usign;

    /**
	 * 用户状态(是否登录)
	 */
    private Boolean ustatus;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getUgrade() {
        return ugrade;
    }

    public void setUgrade(Integer ugrade) {
        this.ugrade = ugrade;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getUsign() {
        return usign;
    }

    public void setUsign(String usign) {
        this.usign = usign;
    }

    public Boolean getUstatus() {
        return ustatus;
    }

    public void setUstatus(Boolean ustatus) {
        this.ustatus = ustatus;
    }
}