package com.netstore.entity.pure;

import java.util.Date;

/**
 * 
 * @author 陈东时
 * @version 1.1
 * 评论列表实体类
 *
 */
public class DiscussN {
	/**
	 * 评论主键
	 * 类型为字符串
	 * 生成策略为uuid
	 */
    private String did;
    /**
	 * 评论内容
	 */
    private String dcontext;
    
    /**
	 * 评论时间
	 */
    private Date ddate;

    /**
     * 评论的星数 1-5 5星代表好评
     */
    private Integer dscore;
    /**
	 * 被评论的产品
	 */
    private String productPid;
    /**
	 * 评论提供者
	 */
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