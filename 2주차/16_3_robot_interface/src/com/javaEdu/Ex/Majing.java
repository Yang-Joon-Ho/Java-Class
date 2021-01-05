package com.javaEdu.Ex;

public class Majing implements Missile, move {
	
	public Majing () {
		System.out.println("---------마징가--------");
	}
	
	@Override
	public void launchMissile() {
		// TODO Auto-generated method stub
		System.out.println("미사일 발사");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("팔다리 움직임");
	}
	
	public void print() {
		this.launchMissile();
		this.move();
	}
}
