<%@ page import="com.wiwei.model.*" %>
<%@ page import="com.wiwei.util.*" %>
<%@ page import="java.util.List" %>
<%@ page import="com.wiwei.dao.*" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>

<style type="text/css">
*{
	font-size:14px;

}
</style>
</head>
<body>
商品列表：
</hr>

<h1>商品管理</h1>
</hr>
<a href="#">添加</a>
<table border="1"px>
<tr>
<td>商品名</td><td>价格</td><td>描述</td><td>库存</td><td>操作</td>
</tr>
<%
List<Goods> list = (List<Goods>)request.getAttribute("list");
for(Goods goods : list){
	%>	
	<tr>
	<td><%=goods.getName()%></td><td><%=goods.getPrice()%></td><td><%=goods.getDes()%></td><td><%=goods.getInventory()%></td><td>删除 添加</td>
	</tr>
	<%
}
%>


<%-- <c:forEach items="${list} var="g"> --%>
<!-- <tr> -->
<%-- 	<td>￥</td><td><%=goods.getPrice()%></td><td><%=goods.getDes()%></td><td><%=goods.getInventory()%></td><td>删除 添加</td> --%>
<!-- 	</tr> -->
<%-- </c:forEach> --%>



</table>

</body>
</html>