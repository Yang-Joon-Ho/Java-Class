package com.javaEdu.Ex;

public class Super implements Move, Missile, Fly, Laser{

	public Super() {
		System.out.println("---------Super--------");
	}
	
	@Override
	public void launchMissile() {
		// TODO Auto-generated method stub
		System.out.println("�̻��� �߻�");
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("�Ȱ� �� �� ����");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("�� �� ����");
	}
	
	@Override
	public void laser() {
		// TODO Auto-generated method stub
		System.out.println("������ ��� ����");
	}
	
	public void print() {
		this.move();
		this.launchMissile();
		this.fly();
		this.laser();
	}

}
