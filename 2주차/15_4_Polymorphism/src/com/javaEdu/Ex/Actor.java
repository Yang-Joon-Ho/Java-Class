package com.javaEdu.Ex;

public class Actor implements Cook, fireFighter, policeOfficer{
	
	public void pizza() {
		System.out.println("���ڸ� ���� �� �ֽ��ϴ�.");
	}
	
	public void pasta() {
		System.out.println("�Ľ�Ÿ�� ���� �� �ֽ��ϴ�.");
	}
	
	
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("������ ã�� �� �ֽ��ϴ�.");
	}

	public void stuff() {
		// TODO Auto-generated method stub
		System.out.println("������ ã�� �� �ֽ��ϴ�.");
	}

	
	public void fire() {
		// TODO Auto-generated method stub
		System.out.println("���� �� �� �ֽ��ϴ�.");
	}

	public void people() {
		// TODO Auto-generated method stub
		System.out.println("����� ���� �� �ֽ��ϴ�.");
	}
	
	
	@Override
	public void cookPrint() {
		// TODO Auto-generated method stub
		System.out.println("----------�丮��----------");
		this.pasta();
		this.pizza();
	}

	@Override
	public void policePrint() {
		// TODO Auto-generated method stub
		System.out.println("----------������----------");
		this.stuff();
		this.find();
	}

	@Override
	public void firePrint() {
		// TODO Auto-generated method stub
		System.out.println("----------�ҹ��----------");
		this.fire();
		this.people();
	}
}
