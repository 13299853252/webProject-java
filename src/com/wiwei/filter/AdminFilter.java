package com.wiwei.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wiwei.model.User;

/**
 * Servlet Filter implementation class AdminFilter
 */
//@WebFilter("/AdminFilter")
public class AdminFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AdminFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		//进行管理员登录过滤验证
		HttpServletRequest HttpReq = (HttpServletRequest)request;
		HttpServletResponse HttpResp = (HttpServletResponse)response;
		Object o = HttpReq.getSession().getAttribute("user");
		if(o==null) {
			HttpResp.sendRedirect(HttpReq.getContextPath()+"/index.jsp");//重定向要使用项目名称
		}else {
			User u = (User)o;
			if(u.isAdmin()) {
				chain.doFilter(request, response);//放行
			}else {
				HttpResp.sendRedirect(HttpReq.getContextPath()+"/index.jsp");
			}
		}
		// pass the request along the filter chain
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
