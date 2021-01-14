<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%!
		int age;
	%>
	
	<%
		String str = request.getParameter("age");
		age = Integer.parseInt(str);
	%>
	
	<%= age %>
	
	성인이므로 주류구매 가능
	
	<a href ="requestEx.html">처음으로 돌아가기</a>
</body>
</html>