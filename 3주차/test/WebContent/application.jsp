<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>application 예제</h2>
	
		1. 서버 정보 : <%= application.getServerInfo() %><BR>
		2. 서블릿 API 버전 정보 : <%= application.getMajorVersion() + "." + application.getMinorVersion() %><BR>
		3. application.jsp 파일의 경로 : <%= application.getRealPath("application.jsp") %> <br/>
		
		<% application.setAttribute("username", "양준호");
		application.log("username = 양준호");
		
		%>
</body>
</html>