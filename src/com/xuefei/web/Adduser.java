package com.xuefei.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xuefei.entity.user;
import com.xuefei.service.userService;
import com.xuefei.serviceImpl.userServiceImpl;
import com.xuefei.util.WebUtil;

public class Adduser extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		user u = WebUtil.copyRequestToBean(request, user.class);
		String name=u.getName();
		userService se=new userServiceImpl();
		boolean tag = se.checkName(name);
		if(tag==false){
			se.addUser(u);
			request.getRequestDispatcher("/registsuccess.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("/registdefault.jsp").forward(request, response);
		}		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
