package com.xuefei.service;

import com.xuefei.entity.user;

public interface userService {
	public abstract void addUser(user u);
	public abstract boolean checkName(String name);
}
