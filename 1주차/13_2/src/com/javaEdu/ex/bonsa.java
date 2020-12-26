package com.javaEdu.ex;

public abstract class bonsa {

	public abstract void ho();
	public abstract void kimchi ();
	public abstract void budae ();
	public abstract void bibim ();
	public abstract void sundae ();
	public abstract void gonki ();
	
	public void print () {
		
		this.ho();
		this.kimchi();
		this.budae();
		this.bibim();
		this.sundae();
		this.gonki();
		System.out.println();
	}
	
}
