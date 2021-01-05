package com.javaEdu.Ex;

import java.util.ArrayList;

public class Price {
	
	protected static final int bread = 1000;
	protected static final int pasta = 5000;
	protected static final int milk = 1000;
	protected static final int amond = 500;
	protected static final int banana = 700;
	
	protected int price;
	protected ArrayList <String> food;
	
	public void milk() {
		this.price += this.milk;
		this.food.add("우유");
	}
	
	public void amond() {
		this.price += this.amond;
		this.food.add("아몬드");
	}
	
	public void banana() {
		this.price += this.banana;
		this.food.add("바나나");
	}
	
}
