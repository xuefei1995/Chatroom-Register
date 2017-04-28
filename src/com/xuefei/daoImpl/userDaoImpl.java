package com.xuefei.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xuefei.dao.userDao;
import com.xuefei.entity.user;
import com.xuefei.util.jdbcUtil;

public class userDaoImpl implements userDao {

	@Override
	public void addUser(user u) {
		Connection con = jdbcUtil.getConnect();
		String sql="INSERT INTO USER(NAME,PASSWORD,age,gender,telphone,email) VALUES (?,?,?,?,?,?)";
		PreparedStatement psm = null;
		try {
			psm = con.prepareStatement(sql);
			psm.setString(1, u.getName());
			psm.setString(2, u.getPassword());
			psm.setString(3, u.getAge());
			psm.setString(4, u.getGender());
			psm.setString(5, u.getTelphone());
			psm.setString(6, u.getEmail());
			psm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcUtil.close(psm,con);
		}
	}

	@Override
	public user findByName(String name) {
		Connection con = jdbcUtil.getConnect();
		String sql="SELECT * FROM USER WHERE NAME=?";
		PreparedStatement psm = null;
		ResultSet rst =null;
		user u=null;
		try {
			psm=con.prepareStatement(sql);
			psm.setString(1, name);
			rst=psm.executeQuery();
			if(rst.next()){
				String myname=rst.getString("name");
				String mypassword=rst.getString("password");
				String myage=rst.getString("age");
				String mygender=rst.getString("gender");
				String mytelphone=rst.getString("telphone");
				String myemail=rst.getString("email");
				u=new user();
				u.setName(myname);
				u.setPassword(mypassword);
				u.setAge(myage);
				u.setGender(mygender);
				u.setTelphone(mytelphone);
				u.setEmail(myemail);				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcUtil.close(rst, psm, con);
		} 	
		return u;
	}
}
