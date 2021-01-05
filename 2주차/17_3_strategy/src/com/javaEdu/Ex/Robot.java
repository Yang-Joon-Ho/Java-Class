package com.javaEdu.Ex;

public class Robot {
	
	private Function function;
	
	public Robot(Function function) {
		this.function = function;
	}
	
	public void print() {
		this.function.move();
		this.function.laserSword();
		this.function.fly();
		this.function.missile();
		this.function.sword();
	}
}
