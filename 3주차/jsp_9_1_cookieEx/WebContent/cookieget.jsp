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
		Cookie[] cookies = request.getCookies(); //cookieinitset���κ��� ��Ű�� ����, ��Ű ���� �� ���� ���� ����
	
		for(int i = 0; i < cookies.length; i++) {
			String str = cookies[i].getName();
			out.println("cookies[" + i + "] name : " + cookies[i].getName() + "<br/>");
			out.println("cookies[" + i + "] value : " + cookies[i].getValue() + "<br/>");

			out.println("==================<br/>");
			if(str.equals("cookieN")) {
			
			}
		}
	%>
	
	<a href="cookiedel.jsp">cookie delete</a>

</body>
</html>