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
	//첫 번째 방법 : session.getAttribute로 받아오기
		Object obj1 = session.getAttribute("mySessionName");
		String mySessionName = (String)obj1;
		out.println(mySessionName + "<br/>");// mySessionData
		
		Object obj2 = session.getAttribute("myNum");
		Integer myNum = (Integer)obj2;
		out.println(myNum + "<br/>");
		
		out.println("========================== <br/>");
		
		//두 번째 방법 : 열거형으로 session.getAttributeNames()으로 받아온걸 
		//하나씩 출력
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
		
		//세 번째 방법 : session id를 session.getId()로 받아오기
		String sessionID = session.getId();
		out.println("sessionID : " + sessionID + "<br/>");
		int sessionInter = session.getMaxInactiveInterval();
		//inactive interval : 아무것도 안할 때, 세션 지속 시간
		out.println("sessionInter : " + sessionInter + "<br/>");
		
		out.println("========================== <br/>");
		
		//'특정' 세션 제거
		session.removeAttribute("mySessionName");
		Enumeration enumeration1 = session.getAttributeNames();
		while(enumeration1.hasMoreElements()) {
			sName = enumeration1.nextElement().toString();
			sValue = session.getAttribute(sName).toString();
			out.println("sName : " + sName + "<br/>");
			out.println("sValue : " + sValue + "<br/>");
		}
		out.println("========================== <br/>");
		
		//모든 세션 제거
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