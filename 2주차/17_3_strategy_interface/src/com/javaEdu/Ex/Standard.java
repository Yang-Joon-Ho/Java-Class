package com.javaEdu.Ex;

public class Standard implements Missile, Move, Sword {
	
	public Standard () {
		System.out.println("---------standard--------");
	}
	
	@Override
	public void launchMissile() {
		// TODO Auto-generated method stub
		System.out.println("미사일 발사");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("걷고 뛸 수 있음");
	}
	
	@Override
	public void sword() {
		// TODO Auto-generated method stub
		System.out.println("목검 사용 가능");
	}
	
	public void print() {
		this.launchMissile();
		this.move();
		this.sword();
	}
}
