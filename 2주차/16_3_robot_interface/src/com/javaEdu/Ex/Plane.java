package com.javaEdu.Ex;

public class Plane implements Light, Missile{

	public Plane() {
		System.out.println("---------�����--------");
	}
	
	@Override
	public void launchMissile() {
		// TODO Auto-generated method stub
		System.out.println("�̻��� �߻�");
	}
	
	@Override
	public void launchLight() {
		// TODO Auto-generated method stub
		System.out.println("�Һ� �߻�");
	}
	
	public void print() {
		this.launchLight();
		this.launchMissile();
	}

}
