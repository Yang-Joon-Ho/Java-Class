<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>application ����</h2>
	
		1. ���� ���� : <%= application.getServerInfo() %><BR>
		2. ���� API ���� ���� : <%= application.getMajorVersion() + "." + application.getMinorVersion() %><BR>
		3. application.jsp ������ ��� : <%= application.getRealPath("application.jsp") %> <br/>
		
		<% application.setAttribute("username", "����ȣ");
		application.log("username = ����ȣ");
		
		%>
</body>
</html>