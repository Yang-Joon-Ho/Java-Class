package com.javaEdu.ex;

public class Restaurant2 extends LunchMenu{ //구내식당 2
	
	private int bread;
	private int pasta;
	private int egg;
	
	public Restaurant2 () {
		init_Price();
	}
	
	@Override
	public void init_Price() {
		// TODO Auto-generated method stub
		
		this.bread = 0;
		this.pasta = 0;
		this.egg = 0;
	}

	public int getBread() {
		return bread;
	}

	public void setBread() {
		this.bread = 1000;
	}

	public int getPasta() {
		return pasta;
	}

	public void setPasta() {
		this.pasta = 5000;
	}

	public int getEgg() {
		return egg;
	}

	public void setEgg() {
		this.egg = 500;
	}
	
	

}
