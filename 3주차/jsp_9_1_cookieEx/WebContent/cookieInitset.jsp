<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<%
		Cookie cookie = new Cookie("cookieN", "cookieV"); //쿠키 id, 쿠키 value
		cookie.setMaxAge(60*60); //쿠키 지속시간 1시간
		response.addCookie(cookie);
	%>
	
	<a href="cookieget.jsp">cookie get</a> //하이퍼링크
	
</body>
</html>