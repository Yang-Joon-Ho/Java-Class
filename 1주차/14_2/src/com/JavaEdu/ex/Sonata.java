package com.JavaEdu.ex;

public class Sonata extends CarSpecs{
	
protected int tax; //세금
	
	protected String color;
	protected String tire;
	protected int displacement;
	protected String handle;
	
	/////////////////// 차량 스펙 변경
	public void Color(String color) {

		this.color = color;
	}
	public void Tire(String tire) {
				
		this.tire = tire;
	}				
	public void Displacement(int dis) {
			
		this.displacement = dis;
	
		switch(dis) {
			case 2000 :
				this.tax = 500;
			break;
				case 2500 : 
			this.tax= 750;
				break;
			default : 
				break;
			}
	}
	public void Handle(String handle) {
		this.handle = handle;
	}
	
	
	////////////// 차량 옵션 정보 가져오는 메소드
	public String getColor() {
		return this.color;
	}
	
	public String getTire() {
		return this.tire;
	}
	
	public int getDisplacement() {
		return this.displacement;
	}
	
	public String getHandle() {
		return this.handle;
	}
	
	///////////////////세금
	public int getTax() {
	// TODO Auto-generated method stub
		return tax;
	}
	
	///////////////// 차량 정보 출력
	public void printSpec () {
		
		System.out.println("- 차량 스펙 - \n"
				+ "색상 : "
				+ this.getColor() + "\n"
				+ "타이어 : "
				+ this.getTire() + "\n"
				+ "배기량 : "
				+ this.getDisplacement() + "\n"
				+ "핸들 : "
				+ this.getHandle() + "\n"
				+ "세금 : "
				+ this.getTax() + "\n"
				);
	}
}
