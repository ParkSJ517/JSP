<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    isELIgnored="false"  %>
<%
   request.setCharacterEncoding("UTF-8");
	// 표현식으로 출력하기 위해 회원 정보 가져옴.
   //String id=(String)request.getAttribute("id");
   //String pwd=(String)request.getAttribute("pwd");
   //String name=(String)session.getAttribute("name");
   //String email=(String)application.getAttribute("email");
   //session에 address속성이름으로 바인딩
   session.setAttribute("address", "부산시 사상구");
%>   
<html>
	<head>
		<meta charset=”UTF-8">
		<title>회원 정보 출력창</title>
	</head>
	<body>
		<table border="1"  align="center" >
		    <tr align="center" bgcolor="#99ccff">
		      <td width="20%"><b>아이디</b></td>
		      <td width="20%"><b>비밀번호</b></td>
		      <td width="20%"><b>이름</b></td>
		      <td width="20%"><b>이메일</b></td>
		      <td width="20%"><b>주소</b></td>
		   </tr>   
		   <tr align=center>
		   <!-- 바인딩된 속성 이름으로 회원 정보 출력 -->
		      <td>${id} </td>
		      <td>${pwd} </td>
		      <td>${name} </td>
		      <td>${email} </td>
		      <td>${address }</td>
		   </tr>
		</table>
	</body>
</html>
