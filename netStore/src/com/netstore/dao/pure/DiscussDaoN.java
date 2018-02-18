package com.netstore.dao.pure;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.netstore.dao.BaseDao;
import com.netstore.entity.pure.DiscussN;

public class DiscussDaoN extends BaseDao<DiscussN> {
	//	1.添加评论
	public void addDiscuss(DiscussN discussN){
		UUID random = UUID.randomUUID();
		String did = random.toString().replace("-", "");
		discussN.setDid(did);
		String sql = "insert into discuss(dId,dContext,dDate,dScore,product_pId,user_uId) values(?,?,?,?,?,?)";
		this.add(sql, discussN.getDid(),discussN.getDcontext(),
				discussN.getDdate(),discussN.getProductPid(),discussN.getUserUid());
	}
	//	2.修改评论
	public void updateDiscuss(DiscussN discussN){
		String sql = "update discuss set dContext=?,dDate=?,dScore=?,product_pId=?,user_uId=? where dId=? ";
		
		this.update(sql, discussN.getDcontext(),
				discussN.getDdate(),discussN.getProductPid(),discussN.getUserUid(),discussN.getDid());
	}
	
	//	3.删除评论
	public void deleteDiscuss(String did){
		String sql = "delete from discuss where did=?";
		this.delete(sql, did);
	}
	
	//	4.查询评论
	public List<DiscussN> findDiscussByScore(Integer score){
		String sql = "select * from discuss where dScore="+score;
		return this.findAll(sql);
	}
	public List<DiscussN> findDiscussLessThan(Integer score){
		String sql = "select * from discuss where dScore<"+score;
		return this.findAll(sql);
	}
	public List<DiscussN> findDiscussMoreThan(Integer score){
		String sql = "select * from discuss where dScore>"+score;
		return this.findAll(sql);
	}
	public List<DiscussN> findDiscuss(){
		return this.findAll("select * from discuss");
	}
	@Override
	public DiscussN sealEntity(ResultSet resultset) {
		// TODO Auto-generated method stub
		DiscussN d = new DiscussN();
		try {
			d.setDid(resultset.getString("dId"));
			d.setDcontext(resultset.getString("dContext"));
			d.setDdate(resultset.getDate("dDate"));
			d.setDscore(resultset.getInt("dScore"));
			d.setProductPid(resultset.getString("product_pId"));
			d.setUserUid(resultset.getString("user_uId"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return d;
	}

	@Override
	public List<DiscussN> sealEntities(ResultSet resultset) {
		// TODO Auto-generated method stub
		List<DiscussN> discussNs = new ArrayList<DiscussN>();
		try {
			while(resultset.next()){
				discussNs.add(this.sealEntity(resultset));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return discussNs;
	}

}
