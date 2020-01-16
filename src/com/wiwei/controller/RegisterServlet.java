package com.wiwei.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wiwei.service.UserService;


@WebServlet("/register_do")
public class RegisterServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//处理注册请求
		//request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		int age = Integer.parseInt(request.getParameter("age"));
		UserService userservice = new UserService();
		boolean isSuccess = userservice.register(username, password, sex, age);
		if(isSuccess) {
			request.setAttribute("message", "<font color='green'>注册成功，跳转登录页面</font>");
			request.getRequestDispatcher("/login.jsp").forward(request,response);
		}else {
			request.setAttribute("message", "<font color='red'>用户名重复，请重新填写</font>");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
	}
}
