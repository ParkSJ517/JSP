<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include2.jsp : 박성재</title>
</head>
<body>
	안녕하세요. JSP 쇼핑몰 시작 부분입니다. <br>
	<jsp:include page="duke_image.jsp">
		<jsp:param value="듀크2" name="name"/>
		<jsp:param value="duke2.png" name="imgName"/>
	</jsp:include>
	
	<br>
	JSP 쇼핑몰 끝 부분 입니다.
</body>
</html>