package com.netstore.entity.pure;

/**
 * 
 * @author 陈东时
 * @version 1.0
 * 产品图片存放位置实体类
 */
public class PictureN {
	
	/**
	 * 图片主键
	 * 类型为字符串
	 * 生成策略为UUID
	 */
    private String picid;

	/**
	 * 图片的数量
	 * 
	 */
    private Integer pcount;
    /**
	 * 图片的url地址
	 * 如果在程序外部默认了统一的存储位置，可以进行只保存图片的文件名
	 */
    private String purl;

    
    /**
	 * 一个产品可以有多个图片 ，说明是哪一个产品的图片
	 */
    private String productPid;

    public String getPicid() {
        return picid;
    }

    public void setPicid(String picid) {
        this.picid = picid;
    }

    public Integer getPcount() {
        return pcount;
    }

    public void setPcount(Integer pcount) {
        this.pcount = pcount;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }

    public String getProductPid() {
        return productPid;
    }

    public void setProductPid(String productPid) {
        this.productPid = productPid;
    }
}