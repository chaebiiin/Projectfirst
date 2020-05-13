package com.yedam.classes.inherit;

public class Bus extends Vehicle { // 자식 클래스와 부

	@Override // 부모 클래스에 정의 된 메소드를 재 정의
	void run() {
		System.out.println("버스가 달립니다.");
	}

}
