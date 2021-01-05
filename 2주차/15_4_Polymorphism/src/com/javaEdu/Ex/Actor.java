package com.javaEdu.Ex;

public class Actor implements Cook, fireFighter, policeOfficer{
	
	public void pizza() {
		System.out.println("피자를 만들 수 있습니다.");
	}
	
	public void pasta() {
		System.out.println("파스타를 만들 수 있습니다.");
	}
	
	
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("범인을 찾을 수 있습니다.");
	}

	public void stuff() {
		// TODO Auto-generated method stub
		System.out.println("물건을 찾을 수 있습니다.");
	}

	
	public void fire() {
		// TODO Auto-generated method stub
		System.out.println("불을 끌 수 있습니다.");
	}

	public void people() {
		// TODO Auto-generated method stub
		System.out.println("사람을 구할 수 있습니다.");
	}
	
	
	@Override
	public void cookPrint() {
		// TODO Auto-generated method stub
		System.out.println("----------요리사----------");
		this.pasta();
		this.pizza();
	}

	@Override
	public void policePrint() {
		// TODO Auto-generated method stub
		System.out.println("----------경찰관----------");
		this.stuff();
		this.find();
	}

	@Override
	public void firePrint() {
		// TODO Auto-generated method stub
		System.out.println("----------소방관----------");
		this.fire();
		this.people();
	}
}
