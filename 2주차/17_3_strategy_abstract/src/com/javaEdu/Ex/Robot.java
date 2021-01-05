package com.javaEdu.Ex;

public abstract class Robot {

	public abstract void fly();
	public abstract void laser();
	public abstract void launchMissile();
	public abstract void move();
	public abstract void sword();
	
	public void print() {
		this.move();
		this.sword();
		this.launchMissile();
		this.fly();
		this.laser();
	}
}
