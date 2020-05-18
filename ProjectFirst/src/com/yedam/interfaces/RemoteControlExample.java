package com.yedam.interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();

		rc = new Telecision();
		rc.turnOn();
		rc.turnOff();
		// 익명객체
		RemoteControl rc2 = new RemoteControl() { // 익명객체에는 새로운 인터페이스를 만 들 수 있다.

			@Override
			public void turnOn() {
				System.out.println("익명 객체 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("익명 객체 끕니다.");
			}

		}; // 호출하고 나서 ;으로 닫아주면 된다.
	}
}
