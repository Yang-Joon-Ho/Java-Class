<%@ page import = "com.javaEdu.ex.MemberDao" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	request.setCharacterEncoding("EUC-KR");
%>

<jsp:useBean id="dto" class = "com.javaEdu.ex.MemberDto" scope="page"/>
<jsp:setProperty property="*" name="dto"/>

<%
	String id = (String)session.getAttribute("id");
	dto.setId(id);
	
	MemberDao dao = MemberDao.getInstance();
	int ri = dao.updateMember(dto);
	
	if(ri == 1) {
%>

	<script language="javascript">
		alert("�������� �Ǿ���");
		document.location.href="main.jsp";
	</script>
	
<%
	} else {
%>

	<script>
		alert("���� ���� ����");
		history.go(-1);
	</script>
<%
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>