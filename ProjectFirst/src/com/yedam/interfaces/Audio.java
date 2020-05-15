package com.yedam.interfaces;

public class Audio implements RemoteControl { // implements를 넣어서 RemoteControl 클래스를 구현하게 만들 어줌. (구현 클래스)

	@Override // 추상메소드를 구현해야함...
	public void turnOn() {
		System.out.println("Audio 를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio 를 끕니다.");

	} //

}
