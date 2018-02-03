package com.netstore.entity;

import java.io.Serializable;



/**
 * 
 * @author 陈东时
 * @version 1.0
 * 通讯实体类
 *
 */
public class Message implements Serializable {
	/**
	 * 消息主键
	 * 类型为字符串
	 * 生成策略为uuid
	 */
	private String mId;
	
	/**
	 * 发送者的id
	 */
	
	private String mSender;
	
	/**
	 * 接受者的id
	 */
	
	private String mAcceptor;
	
	/**
	 * 消息内容
	 */
	
	private String mContext;
	
	/**
	 * 消息是否被读取
	 */
	private Boolean mStatus;
	
	//setter and getter

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmSender() {
		return mSender;
	}

	public void setmSender(String mSender) {
		this.mSender = mSender;
	}

	public String getmAcceptor() {
		return mAcceptor;
	}

	public void setmAcceptor(String mAcceptor) {
		this.mAcceptor = mAcceptor;
	}

	public String getmContext() {
		return mContext;
	}

	public void setmContext(String mContext) {
		this.mContext = mContext;
	}

	public Boolean getmStatus() {
		return mStatus;
	}

	public void setmStatus(Boolean mStatus) {
		this.mStatus = mStatus;
	}

}
