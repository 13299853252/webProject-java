<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.wiwei.model.*"%>
<%@ page import="com.wiwei.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>



<!-- <!-- request.setAttribute("username","wiwei"); 相当于下面这句话-->
<%-- <c:set var="username" value="wiwei" scope="request" ></c:set>  --%>
<%-- ${username} --%>
<%-- <c:out value="shaibishaibi"></c:out> --%>
<!-- <v:remove var="username"/> -->




<!-- jstl if语句的使用 -->

<%-- <c:set var="age" value="20" scope="request"></c:set> --%>
<%-- <c:if test="${age>=18}"> --%>
<!-- <font color="green">你是成年人</font> -->
<%-- </c:if> --%>




<!-- jstl if_else语句的使用 -->

<%-- <c:set var="age" value="20" scope="request"></c:set> --%>
<%-- <c:choose> --%>
<%-- <c:when test="${age>=18}"> --%>
<!-- <font color="green">你是成年人</font> -->
<%-- </c:when> --%>
<%-- <c:otherwise> --%>
<!-- <font color="red">未成年人</font> -->
<%-- </c:otherwise> --%>
<%-- </c:choose> --%>



<!-- <!-- 循环方法 --> -->
<%-- <c:forEach var="i" begin="1" end="10"> --%>
<!-- wiwie!_！ -->
<%-- </c:forEach> --%>


<!-- 一个小测试案例 -->
<%
List<User> list = new ArrayList<User>();
list.add(new User("魏云","123","男",23,false));
list.add(new User("wiwei","123","男",23,false));
list.add(new User("瓜皮","123","男",23,false));
list.add(new User("傻逼","123","男",23,false));
list.add(new User("魏云","123","男",23,false));
request.setAttribute("list", list);
%>
<c:forEach items="${list}" var="user">  
${user.username}:${user.password}:${user.age}</br>
</c:forEach>
</body>
</html>