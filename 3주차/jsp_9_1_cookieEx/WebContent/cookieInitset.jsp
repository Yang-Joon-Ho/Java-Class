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
		Cookie cookie = new Cookie("cookieN", "cookieV"); //��Ű id, ��Ű value
		cookie.setMaxAge(60*60); //��Ű ���ӽð� 1�ð�
		response.addCookie(cookie);
	%>
	
	<a href="cookieget.jsp">cookie get</a> //�����۸�ũ
	
</body>
</html>