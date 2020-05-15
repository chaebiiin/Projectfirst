package com.yedam.interfaces;

public class Telecision implements RemoteControl { //인터페이스를 구현클래스 

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}

}
