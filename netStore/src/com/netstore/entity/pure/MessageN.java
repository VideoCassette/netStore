package com.netstore.entity.pure;

/**
 * 
 * @author 陈东时
 * @version 1.0
 * 通讯实体类
 *
 */
public class MessageN {
	/**
	 * 消息主键
	 * 类型为字符串
	 * 生成策略为uuid
	 */
    private String mid;
    /**
	 * 接受者的id
	 */
    private String macceptor;

    /**
	 * 消息内容
	 */
    private String mcontext;

    /**
     * 发送者的id
     */
    private String msender;
    /**
	 * 消息是否被读取
	 */
    private Boolean mstatus;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMacceptor() {
        return macceptor;
    }

    public void setMacceptor(String macceptor) {
        this.macceptor = macceptor;
    }

    public String getMcontext() {
        return mcontext;
    }

    public void setMcontext(String mcontext) {
        this.mcontext = mcontext;
    }

    public String getMsender() {
        return msender;
    }

    public void setMsender(String msender) {
        this.msender = msender;
    }

    public Boolean getMstatus() {
        return mstatus;
    }

    public void setMstatus(Boolean mstatus) {
        this.mstatus = mstatus;
    }
}