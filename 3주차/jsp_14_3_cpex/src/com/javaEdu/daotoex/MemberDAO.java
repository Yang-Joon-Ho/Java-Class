package com.javaEdu.daotoex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

// connection 객체가 이미 만들어져 있는것을 갖다쓰기만 하면 된다.

public class MemberDAO {
	
	private DataSource dataSource;
	/*
	 * datasource란 java에서 connection pool을 지원하기 위한 인터페이스.
	 * */
	
	public MemberDAO() {
		try {
			Context context = new InitialContext();
			//context란 어떤 객체를 핸들링하기 위한 접근 수단
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
			//DBCP에서 oracle용 connection을 만들어 놓음
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public ArrayList<MemberDTO> memberSelect() {
		
		ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//con = DriverManager.getConnection(url, uid, upw);
			con = dataSource.getConnection(); //DBCP에서 dataSource로 부터 connection을 하나씩 갖다 사용하면 됨.
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from member"); //rs = result
			
			while(rs.next()) {
				String name = rs.getString("name");
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String phone1 = rs.getString("phone1");
				String phone2 = rs.getString("phone2");
				String phone3 = rs.getString("phone3");
				String gender = rs.getString("gender");
				
				MemberDTO dto = new MemberDTO(name, id, pw, phone1, phone2, phone3, gender);
				dtos.add(dto);
			}
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return dtos;
	}
}
