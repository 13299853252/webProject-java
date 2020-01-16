package com.wiwei.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wiwei.model.User;
import com.wiwei.service.*;

@WebServlet("/login_do")
public class LoginServlet extends HttpServlet {
     	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserService service = new UserService();
		User user = service.login(username, password);
		if(user!=null) {
			request.getSession().setAttribute("user",user);
			if(user.isAdmin()) {
				System.out.println("����Ա��¼");
				request.getRequestDispatcher("admin/goods_list").forward(request, response);
				//response.sendRedirect(request.getContextPath()+"/admin/goods_list.jsp");
			}else {
				request.getRequestDispatcher("/").forward(request, response);				
			}
		}else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
			request.setAttribute("message", "<font color='red'>������������д</font>");
		}
	}

}
