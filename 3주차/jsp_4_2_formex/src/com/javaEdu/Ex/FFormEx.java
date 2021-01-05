package com.javaEdu.Ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FFormEx")
public class FFormEx extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public FFormEx() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		String[] hobbys = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		String protocol = request.getParameter("protocol");
		
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></head><body>");
		writer.println("아이디 : " + id + "<br/>");
		writer.println("패스워드 : " + pw + "<br/>");
		writer.println("취미는 : " + Arrays.deepToString(hobbys) + "<br/>");
		writer.println("전공은 : " + major + "<br/>");
		writer.println("프로토콜은 : " + protocol);
		writer.println("</body></html>");
		
		//여기엔 writer.close() 안쓰는 이유가? 
	}
}
