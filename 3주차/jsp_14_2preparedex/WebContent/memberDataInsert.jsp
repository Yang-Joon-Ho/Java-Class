<%@ page import = "java.sql.PreparedStatement" %>
<%@ page import = "java.sql.DriverManager" %>
<%@ page import = "java.sql.ResultSet" %>
<%@ page import = "java.sql.Connection" %>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <%!
	    Connection connection;
		PreparedStatement preparedStatement;
		ResultSet resultSet;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "scott";
		String upw = "tiger";
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<%
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, uid, upw);
			int n;
			
			String query = "insert into memberforpre (id, pw, name, phone) values (?, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, "abc");
			preparedStatement.setString(2, "123");
			preparedStatement.setString(3, "양준호");
			preparedStatement.setString(4, "010-010-010");
			
			n = preparedStatement.executeUpdate();
			
			preparedStatement.setString(1, "def");
			preparedStatement.setString(2, "456");
			preparedStatement.setString(3, "전우진");
			preparedStatement.setString(4, "010-011-110");
			
			n = preparedStatement.executeUpdate();
			
			preparedStatement.setString(1, "abㅂㅈㄷㄱ");
			preparedStatement.setString(2, "123523");
			preparedStatement.setString(3, "양준호235");
			preparedStatement.setString(4, "010-010-010");
			
			n = preparedStatement.executeUpdate();
			
			preparedStatement.setString(1, "abcㅈㄷㄱ");
			preparedStatement.setString(2, "12ㅂㅈㄷ3");
			preparedStatement.setString(3, "양ㅂㅈㄷ준호");
			preparedStatement.setString(4, "010-010-010");
			
			n = preparedStatement.executeUpdate(); //성공하면 1 반환?
			
			if(n == 1) {
				out.println("insert success");
			} else {
				out.println("insert fail");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch(Exception e){}
		}
	%>
	
	<br/>
	<a href="memberDataView.jsp">회원 정보 보기</a>
	
</body>
</html>