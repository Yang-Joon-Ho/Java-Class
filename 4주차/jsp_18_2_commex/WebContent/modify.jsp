<%@ page import="com.javaEdu.ex.MemberDto" %>
<%@ page import="com.javaEdu.ex.MemberDao" %>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<% request.setCharacterEncoding("EUC-KR"); %>
<%
	String id = (String)session.getAttribute("id");
	MemberDao dao = MemberDao.getInstance();
	MemberDto dto = dao.getMember(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script language="JavaScript" src="members.js"></script>
</head>
<body>
	<form action = "modifyOk.jsp" method="post" name="reg_frm">
		���̵� : <%= dto.getId() %> <br/>
		��й�ȣ : <input ype="password" name ="pw" size = "20"><br/>
		��й�ȣ Ȯ�� : <input type="password" name = "pw_check" size = "20"><br/>
		�̸� : <%= dto.getName() %><br/>
		���� : <input type="text" name="eMail" size="20" value="<%= dto.geteMail() %>"><br/>
		�ּ� : <input type = "text" name="address" size = "50" value="<%= dto.getAddress() %>"><br/>
		<input type = "button" value="����" onClick="updateInfoConfirm()">&nbsp; <input type="reset" value="���" onClick="javascript:window.location='login.jsp'">
	</form>

</body>
</html>