<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
////<%=request.getContextPath() //register_do
// if(request.getAttribute("message")!=null){
// 	out.println(request.getAttribute("message"+"</br>"));
// }
%>
<!--使用el表达式 -->
${message}
<form action="<%=request.getContextPath()%>/register_do" methos="post"><!-- 这是使用servlet处理请求 -->
用户名:<input type="text" name="username">
密码：<input type="password" name="password">
重复密码：<input type="password" name="password">
年龄：<input type="text" name="age">
性别：男<input type="radio" name="sex" value="男" checked="checked">女<input type="radio" name="sex" value="女"></br>
<input type="submit" value="注册">
</form>
</body>
</html>