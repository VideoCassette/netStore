package com.netstore.dao.pure;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.netstore.dao.BaseDao;
import com.netstore.entity.pure.PictureN;

public class PictureDaoN extends BaseDao<PictureN> {

	// 1.添加图片
	public void addPicture(PictureN pictureN) {
		UUID random = UUID.randomUUID();
		String picId = random.toString().replace("-", "");
		pictureN.setPicid(picId);
		String sql = "insert into picture(picId,pCount,pUrl,product_pId,) values(?,?,?,?)";
		this.add(sql, pictureN.getPicid(), pictureN.getPcount(),
				pictureN.getPurl(), pictureN.getProductPid());
	}

	// 2.修改图片
	public void updatePicture(PictureN pictureN) {
		UUID random = UUID.randomUUID();
		String picId = random.toString().replace("-", "");
		pictureN.setPicid(picId);
		String sql = "update picture set picId=?,pCount=?,pUrl=?,product_pId=?where picId=?";
		this.add(sql, pictureN.getPcount(), pictureN.getPurl(),
				pictureN.getProductPid(), pictureN.getPicid());
	}

	// 3.查询图片
	public List<PictureN> findPictureByFK(String pid){
		String sql = "select * from picture where product_pId='"+pid+"'";
		return this.findAll(sql);
	}
	// 4.删除图片
	public void deletePictureByFk(String pid){
		String sql = "delete from picture where product_pId=?";
		this.delete(sql, pid);
	}
	
	public void deletePictureById(String pid){
		String sql = "delete from picture where picId=?";
		this.delete(sql, pid);
	}

	@Override
	public PictureN sealEntity(ResultSet resultset) {
		// TODO Auto-generated method stub

		PictureN p = new PictureN();
		try {
			p.setPicid(resultset.getString("picId"));
			p.setPcount(resultset.getInt("pCount"));
			p.setPurl(resultset.getString("pUrl"));
			p.setProductPid(resultset.getString("product_pId"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return p;
	}

	@Override
	public List<PictureN> sealEntities(ResultSet resultset) {
		// TODO Auto-generated method stub
		List<PictureN> pictureNs = new ArrayList<PictureN>();
		try {
			while (resultset.next()) {
				pictureNs.add(this.sealEntity(resultset));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pictureNs;
	}

}
