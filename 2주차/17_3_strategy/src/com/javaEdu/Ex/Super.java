package com.javaEdu.Ex;

public class Super implements Function{

	public Super() {
		System.out.println("---------Super--------");
	}
	
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
	public void laserSword() {
		// TODO Auto-generated method stub
		System.out.println("������ ��� ����");
	}

	@Override
	public void missile() {
		// TODO Auto-generated method stub
		System.out.println("�̻��� �߻� ����");
	}

	@Override
	public void sword() {
		// TODO Auto-generated method stub
		System.out.println("��� ������");
	}

}
