package com.javaEdu.Ex;

public class Majing implements Missile, move {
	
	public Majing () {
		System.out.println("---------��¡��--------");
	}
	
	@Override
	public void launchMissile() {
		// TODO Auto-generated method stub
		System.out.println("�̻��� �߻�");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("�ȴٸ� ������");
	}
	
	public void print() {
		this.launchMissile();
		this.move();
	}
}
