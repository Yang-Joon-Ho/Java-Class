package com.javaEdu.ex;

public class res2 extends ChinaRes {
	
	private int n;
	private int Jjajang;
	private int JjamBbong;
	private int Tangsu;
	private int mandu;
	
	public res2 () {
		this.n = 2;
		this.Jjajang = 7000;
		this.JjamBbong = 9000;
		this.mandu = 3500;
		this.Tangsu = 12000;
	}
	
	@Override
	public void print() {
		System.out.println(this.n + "호점 가격표" + "\n" 
				+ this.Jjajang + "원 입니다." + "\n"
				+ this.JjamBbong + "원 입니다." + "\n"
				+ this.Tangsu + "원 입니다." + "\n"
				+ this.mandu + "원 입니다." + "\n"
				+ super.getBap() + "원 입니다." + "\n");
	}
}
