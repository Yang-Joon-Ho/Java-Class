package com.javaEdu.Ex;

public class Plane implements Light, Missile{

	public Plane() {
		System.out.println("---------비행기--------");
	}
	
	@Override
	public void launchMissile() {
		// TODO Auto-generated method stub
		System.out.println("미사일 발사");
	}
	
	@Override
	public void launchLight() {
		// TODO Auto-generated method stub
		System.out.println("불빛 발사");
	}
	
	public void print() {
		this.launchLight();
		this.launchMissile();
	}

}
