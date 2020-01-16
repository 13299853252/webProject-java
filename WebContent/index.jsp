<%@ page import="com.wiwei.model.*" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%-- <c:choose> --%>
<%-- <c:when test="${empty user}"> --%>
<%-- <a href="${pageContext.request.contextPath()}/login.jsp">登录</a> --%>
<%-- <a href="${pageContext.request.contextPath()}/regster.jsp">注册</a> --%>
<%-- </c:when> --%>
<%-- <c:otherwise> --%>
<%-- 当前登录用户:${user.username}  --%>
<%-- </c:otherwise> --%>
<%-- </c:choose> --%>
</br>
<% 
 Object user = session.getAttribute("user");
 if(user==null){
 	%> 
 	
 	<a href="<%=request.getContextPath() %>/login.jsp">登录</a> 
 	<a href="<%=request.getContextPath() %>/register.jsp">注册</a> 
 	<% 
 }else{
 	out.println("当前登录用户："+((User)user).getUsername());
 }

%>


<%-- <a href="<%=request.getContextPath() %>/login.jsp">登录</a> --%>
<%-- <a href="<%=request.getContextPath() %>/register.jsp">注册</a> --%>
<hr>
各种商品的展示







</body>
</html>