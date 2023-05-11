<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="jakarta.servlet.RequestDispatcher"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("name", "박성재");
	request.setAttribute("address", "창원시 성산구");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>첫 번째 JSP</title>
</head>
<body>
<%
	RequestDispatcher dispatch = request.getRequestDispatcher("request2.jsp");
	dispatch.forward(request, response);
%>
</body>
</html>