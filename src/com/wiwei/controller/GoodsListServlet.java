package com.wiwei.controller;

import java.io.IOException;
import java.util.List;
import com.wiwei.dao.*;
import com.wiwei.service.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wiwei.model.Goods;
import com.wiwei.service.GoodsService;


@WebServlet("/admin/goods_list")
public class GoodsListServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Goods> list = new GoodsService().selectAllGoods();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/admin/goods_list.jsp").forward(request, response);
	}	

}
