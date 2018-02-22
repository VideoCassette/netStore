package com.netstore.dao.pure;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.netstore.dao.BaseDao;
import com.netstore.entity.pure.MessageN;

public class MessageDaoN extends BaseDao<MessageN> {
	/**
	 * 	1.添加信息
	 * @param messageN
	 */
	public void addMessage(MessageN messageN){
		String sql = "insert into message(mId,mAcceptor,mContext,mSender,mStatus) VALUES(?,?,?,?,?)";
		this.add(sql, messageN.getMid(), messageN.getMacceptor(),
				messageN.getMcontext(), messageN.getMsender(), messageN.getMstatus());
	}
	
	/**
	 * 	2.修改信息
	 * @param messageN
	 */
	public void updateMessage(MessageN messageN){
		String sql = "update message set mAcceptor=?,mContext=?,mSender=?,mStatus=? where mId=?";
		this.update(sql, messageN.getMacceptor(),
				messageN.getMcontext(), messageN.getMsender(), messageN.getMstatus(), messageN.getMid());
	}
	/**
	 * 	3.查询信息
	 * @return
	 */
	public List<MessageN> findMessages(){
		String sql = "select * from message";
		return this.findAll(sql);
	}
	public List<MessageN> findMessageByAcceptor(String mAcceptor){
		String sql = "select * from message where mAcceptor = "+mAcceptor;
		return this.findAll(sql);
	}
	/**
	 * 查询已读/未读信息
	 * @param mAcceptor
	 * @param flag
	 * @return
	 */
	public List<MessageN> findMessageByAcceptorAnd(String mAcceptor, boolean flag){
		String sql = "select * from message where mAcceptor = '"+mAcceptor+"' and mStatus = '"+ flag+"'";
		return this.findAll(sql);
	}
	
	/**
	 * 	4.删除信息
	 * @param mId
	 */
	public void deleteMessage(String mId){
		String sql = "delete from message where mId=?";
		this.delete(sql, mId);
	}
	@Override
	public MessageN sealEntity(ResultSet resultset) {
		// TODO Auto-generated method stub
		MessageN m = new MessageN();
		try {
			m.setMid(resultset.getString("mId"));
			m.setMacceptor(resultset.getString("mAcceptor"));
			m.setMsender(resultset.getString("mSender"));
			m.setMcontext(resultset.getString("mContext"));
			m.setMstatus(resultset.getBoolean("mStatus"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}

	@Override
	public List<MessageN> sealEntities(ResultSet resultset) {
		// TODO Auto-generated method stub
		List<MessageN> messageNs = new ArrayList<MessageN>();
		try {
			while(resultset.next()){
				messageNs.add(this.sealEntity(resultset));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return messageNs;
	}

}
