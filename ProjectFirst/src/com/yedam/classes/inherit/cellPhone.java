package com.yedam.classes.inherit;

public class cellPhone { //부모 클래스
	// fields
	String model;
	String color; // 아무 값도 설정해주지 않으면 초기값으로 읽힘
	// 생성자 constructors

	cellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	// 메소드 methods
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void bell() {
		System.out.println("벨이 울립니다.");
	}

	void sendVoices(String message) {
		System.out.println("자신 : " + message);
	}

	void receiveVoices(String message) {
		System.out.println("상대방 : " + message);
	}

	void powerOff() {
		System.out.println("전월을 끕니다.");
	}

} //class
