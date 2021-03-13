<%@ page import="java.sql.Timestamp" %>
<%@ page import="com.javaEdu.ex.*" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	request.setCharacterEncoding("EUC-KR");    
%>

<jsp:useBean id="dto" class ="com.javaEdu.ex.MemberDto"/>
<jsp:setProperty name = "dto" property="*"/> <!-- *�� �ڵ������� DTO ��ü�� �Էµȴٴ� �ǹ� -->

<% 
	dto.setrDate(new Timestamp(System.currentTimeMillis()));
	MemberDao dao = MemberDao.getInstance();
	if(dao.confirmId(dto.getId()) == MemberDao.MEMBER_EXISTENT) {
%>
	
	<script>
		alert('���̵� �̹� ����');
		history.back(); <%-- �������� �ѹ� back ��. --%>
	</script>
	
<% 	
	} else {
		int ri = dao.insertMember(dto);
		if(ri == MemberDao.MEMBER_JOIN_SUCCESS) {
			session.setAttribute("id", dto.getId());
%>
	<script>
		alert('ȸ�� ���� ����');
		document.location.href = "login.jsp";
	</script>
<%
		} else {
%>
	<script>
		alert(ri + 'ȸ�����Կ� ����');
		document.location.href="login.jsp";
	</script>
<% 
		}
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