<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%!
    	Connection connection;
    	Statement statement;
    	ResultSet resultSet;
    	
    	String name, id, pw, phone1,phone2,phone3,gender;
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<%
		id = (String)session.getAttribute("id");
		
		String query = "select * from member where id = '" +id + "'";
		
		Class.forName("oracle.jdbc.driver.OracleDriver"); //oracle jdbc
		connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger"); //jdbc:1521
		statement = connection.createStatement();
		resultSet = statement.executeQuery(query); //select * from member
	
		while(resultSet.next()) {
			name = resultSet.getString("name");
			pw = resultSet.getString("pw");
			phone1 = resultSet.getString("phone1");
			phone2 = resultSet.getString("phone2");
			phone3 = resultSet.getString("phone3");
			gender = resultSet.getString("gender");
		}
	%>
	
	<form action="ModifyOk" method="post">
		이름 : <input type="text" name="name" size="10" value=<%=name %>><br/>
		아이디 : <%=id %> <br/>
		비밀번호 : <input type="text" name="pw" size="10"><br/>
		전화번호 : <select name="phone1">
			<option value="010">010</option>
			<option value="011">011</option>
		</select>
		<input type="text" name="phone2" size="5"> - <input type="text" name="phone3" size="5"> <br/>
		
		<%
			if(gender.equals("man")) {
		%>
		성별구분 : <input type="radio" name= "gender" value="man">남 &nbsp;<input type="radio" name= "gender" value="woman">여 <br/>
		<%
			} else {
		%>
		성별구분 : <input type="radio" name= "gender" value="man">남 &nbsp;<input type="radio" name= "gender" value="woman">여 <br/>
		<%
			}
		%>
		<input type="submit" value="정보수정"> <input type="reset" value="취소">
	
	</form>

</body>
</html>