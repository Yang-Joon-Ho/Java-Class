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
		
		if(cookies != null) {
			for(int i = 0; i < cookies.length; i++) {
				if(cookies[i].getValue().equals("abcde")) {
					cookies[i].setMaxAge(0);
					response.addCookie(cookies[i]);
				}
			}
		}
		
		//만약에 위에서 처럼 죽이지 않고 그냥 쿠키 수명시간 60초동안 기다렸다가 하면 어떻게 될까?
		
		response.sendRedirect("cookietest.jsp");
	%>

</body>
</html>