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
		out.print("나이는 " + age);
	%>
	
	성인 이므로 주류 구매 가능.

<a href="requestEx.html">처음으로 이동</a>

</body>
</html>