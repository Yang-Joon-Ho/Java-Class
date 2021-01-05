package com.javaEdu.Ex;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener 
//contextlistener은 웹 어플이 시작하거나 중지될 때 알려주는 것
public class ContextListenerEx implements ServletContextListener{
	
	public ContextListenerEx() {
		
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("contextDestroyed");
	}
	
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Application contextInitialized");
	}
}
