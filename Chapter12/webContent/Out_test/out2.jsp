<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String age = request.getParameter("age");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 입력 창</title>
</head>
<body>
	<!-- 표현식으로 출력 -->
	<%	if(name.equals(null) || name.length() != 0) { %>
		<h1><%= name %>, <%= age %></h1>
	<% } else { %>
		<h1>이름을 입력하세요.</h1>
	<% } %>

	<!-- out 객체로 출력 -->
	<% if(name.equals(null) || name.length() != 0) { %>
		<h1><% out.println(name + ", " + age); %></h1>
	<% } else { %>
		<h1>이름을 입력하세요.</h1>
	<% } %>
</body>
</html>