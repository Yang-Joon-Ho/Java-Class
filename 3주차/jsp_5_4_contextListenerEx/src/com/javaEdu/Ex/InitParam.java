package com.javaEdu.Ex;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;

@WebServlet(urlPatterns= {"/InitParam"}, initParams= {@WebInitParam(name="id", value="abcdef"), @WebInitParam(name="pw", value="1234")})
public class InitParam extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public InitParam() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
	}
}
