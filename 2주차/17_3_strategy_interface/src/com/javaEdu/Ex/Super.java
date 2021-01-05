package com.javaEdu.Ex;

public class Super implements Move, Missile, Fly, Laser{

	public Super() {
		System.out.println("---------Super--------");
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
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("날 수 있음");
	}
	
	@Override
	public void laser() {
		// TODO Auto-generated method stub
		System.out.println("광선검 사용 가능");
	}
	
	public void print() {
		this.move();
		this.launchMissile();
		this.fly();
		this.laser();
	}

}
