package com.javaEdu.Ex;

public class Super extends Robot{

	public Super() {
		System.out.println("---------Super--------");
	}
	
	public void launchMissile() {
		// TODO Auto-generated method stub
		System.out.println("�̻��� �߻�");
	}
	
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("�Ȱ� �� �� ����");
	}

	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("�� �� ����");
	}
	
	public void laser() {
		// TODO Auto-generated method stub
		System.out.println("������ ��� ����");
	}

	@Override
	public void sword() {
		// TODO Auto-generated method stub
		System.out.println("��� ��� ����");
	}

}
