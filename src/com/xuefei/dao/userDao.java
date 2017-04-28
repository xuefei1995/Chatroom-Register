package com.xuefei.dao;

import com.xuefei.entity.user;

public interface userDao {
	public abstract void addUser(user u);
	public abstract user findByName(String name);
}
