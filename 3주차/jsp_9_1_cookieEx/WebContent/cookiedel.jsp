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
		Cookie[] cookies = request.getCookies();
		for(int i = 0; i < cookies.length; i++) {
			String str = cookies[i].getName();
			
			if(str.equals("cookieN")) {
				out.println("삭제할 쿠키 name : " + cookies[i].getName() + "<br/>");
				cookies[i].setMaxAge(0); // 수명을 0으로 설정함으로써 쿠키 삭제
				response.addCookie(cookies[i]);
			}
		}
	%>
	
	<a href="cookietest.jsp">쿠키확인</a>

</body>
</html>