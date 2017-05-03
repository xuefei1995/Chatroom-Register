package com.xuefei.daoImpl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.xuefei.dao.userDao;
import com.xuefei.entity.user;
import com.xuefei.util.JdbcUtil;

public class userDaoImpl implements userDao {

	@Override
	public void addUser(user u) {		
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		Object[] obj={u.getName(),u.getPassword(),u.getAge(), u.getGender(),u.getTelphone(),u.getEmail()};
		String sql="INSERT INTO USER(NAME,PASSWORD,age,gender,telphone,email) VALUES (?,?,?,?,?,?)";
		try {
			qr.update(sql, obj);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}

	@Override
	public user findByName(String name) {
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		String sql="SELECT * FROM USER WHERE NAME=?";
		Object[] obj={name};
		user u=null;
		try {
			u = (user)qr.query(sql, new BeanHandler(user.class), obj);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;	
	}

}
