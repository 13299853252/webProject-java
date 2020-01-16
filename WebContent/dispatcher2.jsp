<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
request.getRequestDispatcher("dispatcher1.jsp").forward(request,response);
%>
Dispathcer2
<%-- <jsp:include page="dispatcher2.jsp"></jsp:include> --%>
</body>
</html>