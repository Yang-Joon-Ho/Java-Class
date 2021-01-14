<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "java.util.Enumeration" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	//ù ��° ��� : session.getAttribute�� �޾ƿ���
		Object obj1 = session.getAttribute("mySessionName");
		String mySessionName = (String)obj1;
		out.println(mySessionName + "<br/>");// mySessionData
		
		Object obj2 = session.getAttribute("myNum");
		Integer myNum = (Integer)obj2;
		out.println(myNum + "<br/>");
		
		out.println("========================== <br/>");
		
		//�� ��° ��� : ���������� session.getAttributeNames()���� �޾ƿ°� 
		//�ϳ��� ���
		String sName;
		String sValue;
		Enumeration enumeration = session.getAttributeNames();
		
		while(enumeration.hasMoreElements()) {
			sName = enumeration.nextElement().toString();
			sValue = session.getAttribute(sName).toString();
			
			out.println("sName : " + sName + "<br/>");
			out.println("sValue : " + sValue + "<br/>");
		}
		out.println("========================== <br/>");
		
		//�� ��° ��� : session id�� session.getId()�� �޾ƿ���
		String sessionID = session.getId();
		out.println("sessionID : " + sessionID + "<br/>");
		int sessionInter = session.getMaxInactiveInterval();
		//inactive interval : �ƹ��͵� ���� ��, ���� ���� �ð�
		out.println("sessionInter : " + sessionInter + "<br/>");
		
		out.println("========================== <br/>");
		
		//'Ư��' ���� ����
		session.removeAttribute("mySessionName");
		Enumeration enumeration1 = session.getAttributeNames();
		while(enumeration1.hasMoreElements()) {
			sName = enumeration1.nextElement().toString();
			sValue = session.getAttribute(sName).toString();
			out.println("sName : " + sName + "<br/>");
			out.println("sValue : " + sValue + "<br/>");
		}
		out.println("========================== <br/>");
		
		//��� ���� ����
		session.invalidate();
		if(request.isRequestedSessionIdValid()) {
			out.println("session valid");
		} else {
			out.println("session invalid");
		}
	%>
	
	<a href="sessiontest.jsp">session test</a>
</body>
</html>