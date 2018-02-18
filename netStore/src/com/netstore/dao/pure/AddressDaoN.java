package com.netstore.dao.pure;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.netstore.dao.BaseDao;
import com.netstore.entity.pure.AddressN;

public class AddressDaoN extends BaseDao<AddressN> {

	// 1.增加地址
	public void addAddress(AddressN addressN){
		UUID random = UUID.randomUUID();
		String aid = random.toString().replace("-", "");
		addressN.setAid(aid);
		String sql = "insert into address (aId，aCity，aDetail，aProvince，aTown，adefault，user_uId) VALUES(?,?,?,?,?,?,?)";
		this.add(sql, addressN.getAid(),addressN.getAcity(),addressN.getAdetail(),
				addressN.getAprovince(),addressN.getAtown(),addressN.getAdefault(),addressN.getUserUid()
				);
	}
	// 2.修改地址
	public void updateAddress(AddressN addressN){
		String sql = "update address SET aCity=?,aDetail=?,aProvince=?,aTown=?,adefault=?,user_uId=? WHERE	aId=?";
		this.update(sql, addressN.getAcity(),addressN.getAdetail(),
				addressN.getAprovince(),addressN.getAtown(),
				addressN.getAdefault(),addressN.getUserUid(),addressN.getAid());
	}
	
	// 3.查询地址
	public List<AddressN> findAddress(Integer uid){
		String sql = "select * from address where user_uId="+uid;
		return this.findAll(sql);
	}
	public AddressN findOneAddress(Integer aid){
		String sql = "select * from address where aid = ?";
		return this.find(sql, aid);
	}
	// 4.删除地址
	public void deleteAddress(Integer aid){
		String sql = "delete from address where aid = ?";
		this.find(sql, aid);
	}
	
	// aId
	// aCity
	// aDetail
	// aProvince
	// aTown
	// adefault
	// user_uId

	@Override
	public AddressN sealEntity(ResultSet resultset) {
		// TODO Auto-generated method stub
		AddressN a = new AddressN();
		try {
			a.setAid(resultset.getString("aId"));
			a.setAcity(resultset.getString("aCity"));
			a.setAdefault(resultset.getBoolean("adefault"));
			a.setAprovince(resultset.getString("aProvince"));
			a.setAtown(resultset.getString("aTown"));
			a.setAdetail(resultset.getString("aDetail"));
			a.setUserUid(resultset.getString("user_uId"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

	@Override
	public List<AddressN> sealEntities(ResultSet resultset) {
		// TODO Auto-generated method stub
		List<AddressN> addresses = new ArrayList<AddressN>();
		try {
			while(resultset.next()){
				AddressN sealEntity = this.sealEntity(resultset);
				addresses.add(sealEntity);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return addresses;
	}

}
