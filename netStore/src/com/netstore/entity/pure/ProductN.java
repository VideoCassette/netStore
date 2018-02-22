package com.netstore.entity.pure;
/**
 * @author 陈东时
 * @version 1.1
 * 产品实体类
 * 
 */
public class ProductN {
	
	/**
	 * 产品主键
	 * 类型为字符串
	 * 生成策略为UUID
	 */
    private String pid;

    /**
	 * 产品的描述
	 * 与产品名称一样做为搜索栏的模糊搜索依据
	 */
    private String pdesc;
    /**
	 * 产品名称
	 * 描述产品的名称
	 */
    private String pname;
    
    /**
	 * 产品数量
	 * 商家进行操作
	 * 作为产品的库存数量；
	 */
    private Integer pnumber;

    /**
	 * 产品数量
	 * 商家进行操作
	 * 作为产品的库存数量；
	 */
    private Double pprice;

    /**
	 * 产品销售数量
	 * 在业务逻辑层进行操作
	 * 当商家进行操作的时候，此数量自动清零
	 */
    private Integer psalenum;

    /**
	 * 产品被加入购物车还未出售的数量
	 * 在业务逻辑层进行操作
	 * 当商家进行操作的时候，此数量不清零
	 * 就是在产品被加入购物车的时候，数量从总数量中扣减，放到此项中，当确定购买
	 * 之后，从此项扣减，加入销量项pSaleNum
	 */
    private Integer ptemp;

    /**
	 * 产品类别外键
	 * 由厂家进行操作，实现功能如下：
		 * 增加产品类别
		 * 修改产品类别
		 * 删除产品类别
	 */
    private String categoryCid;

    /**
   	 * 用户外键
   	 * 说明提供产品的用户
   	 */
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