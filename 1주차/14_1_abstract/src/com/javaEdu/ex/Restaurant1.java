package com.javaEdu.ex;

public class Restaurant1 extends LunchMenu{ //구내식당 1
	
	private int rice;
	private int bulgogi;
	private int banana;
	private int milk;
	private int almond;
	
	public Restaurant1 () {
		init_Price();
	}
	
	public void init_Price() {
		this.almond = 0;
		this.banana = 0;
		this.bulgogi = 5000;
		this.milk = 0;
		this.rice = 1000;
	}
	
	public int getRice() {
		// TODO Auto-generated method stub
		return this.rice;
	}

	public int getBulgogi() {
		// TODO Auto-generated method stub
		return this.bulgogi;
	}

	public int getBanana() {
		// TODO Auto-generated method stub
		return this.banana;
	}

	public int getMilk() {
		// TODO Auto-generated method stub
		return this.milk;
	}

	public int getAlmond() {
		// TODO Auto-generated method stub
		return this.almond;
	}


	public void setBanana() {
		// TODO Auto-generated method stub
		this.banana = 700;
	}


	public void setMilk() {
		// TODO Auto-generated method stub
		this.milk = 1000;
	}

	public void setAlmond() {
		// TODO Auto-generated method stub
		this.almond = 500;
	}
	
}
