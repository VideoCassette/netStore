package com.netstore.entity;

import java.io.Serializable;




public class Message implements Serializable {
	
	private Integer mId;
	
	private Integer mSender;
	
	private Integer mAcceptor;
	
	private String mMessage;
	
	private Boolean mStatus;

	public Integer getmId() {
		return mId;
	}

	public void setmId(Integer mId) {
		this.mId = mId;
	}

	public Integer getmSender() {
		return mSender;
	}

	public void setmSender(Integer mSender) {
		this.mSender = mSender;
	}

	public Integer getmAcceptor() {
		return mAcceptor;
	}

	public void setmAcceptor(Integer mAcceptor) {
		this.mAcceptor = mAcceptor;
	}

	public String getmMessage() {
		return mMessage;
	}

	public void setmMessage(String mMessage) {
		this.mMessage = mMessage;
	}

	public Boolean getmStatus() {
		return mStatus;
	}

	public void setmStatus(Boolean mStatus) {
		this.mStatus = mStatus;
	}
}
