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
// if(request.getAttribute("message")!=null){
// 	out.println(request.getAttribute("message"+"</br>"));
// }{
// 	out.println("SetAtribute出现错误");
// }
%>

<!--使用el表达式 -->
${message}
</br>
当前是用户登录页面
</br>
<form action="<%=request.getContextPath()%>/login_do" methos="post">
用户名:<input type="text" name="username">
密码：<input type="password" name="password">
重复密码：<input type="password" name="password">
<input type="submit" value="登录">
</form>
</body>
</html>