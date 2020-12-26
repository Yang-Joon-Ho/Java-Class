package com.JavaEdu.ex;

//고객이 처음부터 High 혹은 Low가 아닌 알아서 차량 스펙을 정하는 경우
public class SonataHybridGrade extends Sonata{
	
	public SonataHybridGrade(String color, String tire, int displacement, String handle) {
		
		this.color = color;
		this.tire = tire;
		this.displacement = displacement;
		this.handle = handle;
		
		switch(displacement) {
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
}
