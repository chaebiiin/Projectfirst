package com.yedam.interfaces;

public interface RemoteControl { // 뉴 인스턴스를 못 만듬. 인터페이스를 만들 용도로 규격(?)만 정해주면 됨
	// 상수 final static 포함
	public int MAX_VOLUME = 0; // class 기준으로 한번 선언된 값은 바꿀 수 없음.(상수)
	public int MIN_VOLUME = 10;

	// 추상 메소드.
	public void turnOn();

	public void turnOff();
}
