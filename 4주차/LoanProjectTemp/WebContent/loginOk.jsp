<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "com.Users.UserDto" %>
<%@ page import = "com.Users.UserDao" %>
 
<%
 request.setCharacterEncoding("EUC-KR");

  	String id = request.getParameter("id");
  	String pw = request.getParameter("pw");
  	
  	UserDao dao = UserDao.getInstance();
  	int checkNum = dao.userCheck(id, pw);
  	if(checkNum == -1) {
 %>

	<script>
		alert('���̵� �������� �ʽ��ϴ�.');
		history.go(-1);
	</script> 
<%
 } else if(checkNum == 0) {
 %>
	<script>
		alert('��й�ȣ�� Ʋ���ϴ�.');
		history.go(-1);
	</script>
<%
} else if(checkNum == 1) {
		UserDto dto = dao.getMember(id);	
	
		if(dto == null) {
%>
	<script>
 			alert('�������� �ʴ� ȸ���Դϴ�.');
 			history.go(-1);
	</script>
<%
		} else { // success the login
			String name = dto.getName();
			String bank = dto.getBankName();
			
			int num = dto.getNum();
			
			session.setAttribute("id", id);
			session.setAttribute("name", name);
			session.setAttribute("bank", bank);
			
			/////////////
			System.out.println(bank);
			//////////////
			
			session.setAttribute("validMem", "yes");
			
			switch(num) {
			case 0 : //users
				response.sendRedirect("index.jsp");
				break;
			case 1 : //government
				response.sendRedirect("index_gov.jsp");
				break;
			case 2 :
				response.sendRedirect("index_bank.jsp");
				break;
			default :
				break;
			}
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