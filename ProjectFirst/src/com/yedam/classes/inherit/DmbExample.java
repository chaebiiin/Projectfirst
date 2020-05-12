package com.yedam.classes.inherit;

public class DmbExample { 
	public static void main(String[] args) {
		DmbCellPhone dcp = new DmbCellPhone("DMB폰", "흰색", 10);
		//cellPhone(부모 클래스)의 필드
		System.out.println(dcp.model + " ," + dcp.color);
		//DmbCellPhone(현재 클래)스의 필드(channel)도 쓸수 있다. 		
	System.out.println(dcp.channel);
	//부모클래스가 가지고 있는 메소드 ▽
	dcp.powerOn();
	dcp.bell();
	dcp.sendVoices("안녕하세요.");
	dcp.receiveVoices("반갑습니다.");
	//본인이 가지고 있는 메소드 ▽
	dcp.turnOnDmb();
	dcp.changeChannel(12);
	dcp.powerOff();
	}
}
