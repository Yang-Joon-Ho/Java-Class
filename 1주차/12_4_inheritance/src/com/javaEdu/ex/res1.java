package com.javaEdu.ex;

public class res1 extends ChinaRes {

	private int n;
	private int Jjajang;
	private int Tangsu;
	private int bap;
	
	public res1 () {
		this.n = 1;
		this.Jjajang = 7000;
		this.Tangsu = 12000;
		this.bap = 1000;
	}
	
	@Override
	public void print() {
		System.out.println(this.n + "호점 가격표" + "\n" 
				+ this.Jjajang + "원 입니다." + "\n"
				+ super.getJjamBbong() + "원 입니다." + "\n"
				+ this.Tangsu + "원 입니다." + "\n"
				+ "판매하지 않습니다." + "\n"
				+ this.bap + "원 입니다." + "\n");
	}
}
