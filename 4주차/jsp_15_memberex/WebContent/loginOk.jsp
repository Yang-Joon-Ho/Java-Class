<%@ page import = "com.javaEdu.ex.MemberDto" %>
<%@ page import = "com.javaEdu.ex.MemberDao" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	request.setCharacterEncoding("EUC-KR");

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	MemberDao dao = MemberDao.getInstance();
	int checkNum = dao.userCheck(id, pw);
	if(checkNum == -1) {
%>
	<script>
		alert('아이디가 존재하지 않다.');
		history.go(-1);
	</script>
<%
	} else if(checkNum == 0) {
%>
		<script>
			alert('비밀번호가 틀립니다.');
			history.go(-1);
		</script>
<%
	} else if (checkNum == 1) {
		MemberDto dto = dao.getMember(id);
		
		if(dto == null) {
%>
		<script>
			alert('존재하지않는 회원');
			history.go(-1);
		</script>
<% 
		} else {
			String name = dto.getName();
			session.setAttribute("id", id);
			session.setAttribute("name", name);
			session.setAttribute("validMem", "yes");
			response.sendRedirect("main.jsp");
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