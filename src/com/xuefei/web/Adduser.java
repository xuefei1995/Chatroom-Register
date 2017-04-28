package com.xuefei.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xuefei.entity.user;
import com.xuefei.service.userService;
import com.xuefei.serviceImpl.userServiceImpl;

public class Adduser extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String age=request.getParameter("age");
		String gender=request.getParameter("gender");
		String telphone=request.getParameter("telphone");
		String email=request.getParameter("email");
		user u=new user();
		u.setName(name);
		u.setPassword(password);
		u.setAge(age);
		u.setGender(gender);
		u.setTelphone(telphone);
		u.setEmail(email);
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
