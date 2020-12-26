package com.javaEdu.ex;

public class ChildMenu extends ParentMenu{
	public ChildMenu() {
		
	}
	
	private void chungGuck() {
		System.out.println("쇠고기청국장(private)");
	}
	public void getChungGuck() { //private method 접근하기
		this.chungGuck();
	}
	
	public void jangGuck() {
		System.out.println("얼큰 된장국");
	}
	public void naMool() {
		System.out.println("콩나물국");
	}
	public void makeChungGuckJang() {
		System.out.println("냄새x청국장");
	}
}
