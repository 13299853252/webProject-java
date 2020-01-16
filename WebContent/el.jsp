<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.wiwei.model.*"%>
<%@ page import="com.wiwei.model.*" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<!-- page request session application -->
<%
// request.setAttribute("number", 200);
// session.setAttribute("user","wiwei");
// application.setAttribute("count","sdbjbcjsb");

// session.removeAttribute("user");
//${requestScope.number}除了这三种表达方式，还可以直接使用{number},就可以，他会依次的查找 
%>

<%-- 在线人数为：${requestScope.number}  --%>
<!-- </br> -->
<%-- 用户名：${sessionScope.user} --%>
<!-- </br> -->
<%-- 账号：${applicationScope.count} --%>



<%
// User u = new User("魏云","123","男",23,false);
// request.setAttribute("user",u);
%>
<%-- ${user.getUsername()}; --%>
<%-- 也可以直接${user.username}  --%>
</br>
<%-- ${user.password};这种方法是使用对象的get方法调用的 --%>



<%
// Map<String,String> map = new HashMap<String,String>();
// map.put("name","wiwei");
// map.put("age","24");
// request.setAttribute("map",map);
%>
<%-- ${map.name} --%>
<%-- ${map.age}  --%>


<%
List<User> list = new ArrayList<User>();
list.add(new User("魏云","123","男",23,false));
list.add(new User("魏云","123","男",23,false));
list.add(new User("魏云","123","男",23,false));
list.add(new User("魏云","123","男",23,false));
list.add(new User("魏云","123","男",23,false));
request.setAttribute("list", list);
%>
${list[1].username}
${list[2].password}
<!-- el表达式中还可以进行运算 -->
${90+800}
${90>80}
${empty list}
${empty list2}

</br>
<!-- 获取项目路径可以使用 -->
${pageContext.request.contextPath }




<!-- 最后el表达式可以在JSP页面省去写JAVA代码，获取数据和信息 -->
</body>
</html>