package com.netstore.entity.pure;

/**
 * 
 * @author 陈东时
 * @version 1.1
 * 产品分类实体类
 *
 */
public class CategoryN {
	
	/**
	 * 分类id
	 * 类型为字符串
	 * 生成策略为UUID
	 */
    private String cid;
    /**
	 * 手机颜色
	 */
    private String ccolor;
    /**
	 * 分类描述
	 */
    private String cdesc;
    /**
	 * 分类名称
	 * 
	 */
    private String cname;
    /**
	 * 内存大小
	 */
    private Integer crom;
	
	/**
	 * 屏幕大小
	 */
    private Integer cscreensize;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid ;
    }

    public String getCcolor() {
        return ccolor;
    }

    public void setCcolor(String ccolor) {
        this.ccolor = ccolor;
    }

    public String getCdesc() {
        return cdesc;
    }

    public void setCdesc(String cdesc) {
        this.cdesc = cdesc;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getCrom() {
        return crom;
    }

    public void setCrom(Integer crom) {
        this.crom = crom;
    }

    public Integer getCscreensize() {
        return cscreensize;
    }

    public void setCscreensize(Integer cscreensize) {
        this.cscreensize = cscreensize;
    }
}