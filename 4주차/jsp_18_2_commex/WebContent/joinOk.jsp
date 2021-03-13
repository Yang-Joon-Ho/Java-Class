<%@ page import="java.sql.Timestamp" %>
<%@ page import="com.javaEdu.ex.*" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	request.setCharacterEncoding("EUC-KR");    
%>

<jsp:useBean id="dto" class ="com.javaEdu.ex.MemberDto"/>
<jsp:setProperty name = "dto" property="*"/> <!-- *는 자동적으로 DTO 객체에 입력된다는 의미 -->

<% 
	dto.setrDate(new Timestamp(System.currentTimeMillis()));
	MemberDao dao = MemberDao.getInstance();
	if(dao.confirmId(dto.getId()) == MemberDao.MEMBER_EXISTENT) {
%>
	
	<script>
		alert('아이디가 이미 존재');
		history.back(); <%-- 브라우저를 한번 back 함. --%>
	</script>
	
<% 	
	} else {
		int ri = dao.insertMember(dto);
		if(ri == MemberDao.MEMBER_JOIN_SUCCESS) {
			session.setAttribute("id", dto.getId());
%>
	<script>
		alert('회원 가입 축하');
		document.location.href = "login.jsp";
	</script>
<%
		} else {
%>
	<script>
		alert(ri + '회원가입에 실패');
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