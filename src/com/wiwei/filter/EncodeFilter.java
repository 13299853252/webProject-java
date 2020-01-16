package com.wiwei.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class EncodeFilter
 */
// @WebFilter("/EncodeFilter")
public class EncodeFilter implements Filter {


	private String encoding;
	

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		//���� ʹ��ʹ�õ�ʱ��ʹ������
		request.setCharacterEncoding(encoding);
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		encoding = fConfig.getInitParameter("Encoding");//��ʱ�ı��������Ǵ������ļ��л�ȡ��
	}
	
	public void destroy() {
		// TODO Auto-generated method stub
	}

}