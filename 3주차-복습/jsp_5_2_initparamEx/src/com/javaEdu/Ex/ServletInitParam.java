package com.javaEdu.Ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/ServletInitParam"}, initParams= {@WebInitParam(name="id", value="abc"),
@WebInitParam(name="pw", value="1234"), @WebInitParam(name="path", value="C:\\javaEdu\\workSpace")})
public class ServletInitParam extends  HttpServlet{
	private static final long serialVersionUID = 1L;

	public ServletInitParam() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		
		/*
		 * 이런식으로 값을 미리 초기화 하는 경우는 시연할 때, admin계정으로
		 * 보여줄 때 좋을 것 같다.
		 * */
		
		String id = getInitParameter("id");
		String pw = getInitParameter("pw");
		String path = getInitParameter("path");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></head><body>");
		writer.println("아이디 : " + id + "<br/>");
		writer.println("패스워드 : " + pw + "<br/>");
		writer.println("path : " + path);
		writer.println("</body></html>");
		
		writer.close();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
	}
}
