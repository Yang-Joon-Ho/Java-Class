package com.javaEdu.ex;

public class res3 extends ChinaRes {
	
	private int n;
	private int Jjajang;
	private int JjamBbong;
	private int Tangsu;
	private int mandu;
	private int bap;
	
	public res3 () {
		this.n = 3;
		this.Jjajang = 7500;
		this.JjamBbong = 8500;
		this.mandu = 3900;
		this.Tangsu = 11000;
		this.bap = 1500;
	}
	
	@Override
	public void print() {
		System.out.println(this.n + "호점 가격표" + "\n" 
				+ this.Jjajang + "원 입니다." + "\n"
				+ this.JjamBbong + "원 입니다." + "\n"
				+ this.Tangsu + "원 입니다." + "\n"
				+ this.mandu + "원 입니다." + "\n"
				+ this.bap + "원 입니다." + "\n");
	}
}
