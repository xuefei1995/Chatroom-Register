package com.xuefei.serviceImpl;

import com.xuefei.dao.userDao;
import com.xuefei.daoImpl.userDaoImpl;
import com.xuefei.entity.user;
import com.xuefei.service.userService;

public class userServiceImpl implements userService {
	
	userDao dao=new userDaoImpl();
	@Override
	public void addUser(user u) {
		dao.addUser(u);
	}
	@Override
	public boolean checkName(String name) {
		boolean flag=false;
		user u = dao.findByName(name);
		if(u!=null){
			flag=true;
		}
		return flag;
	}
}
