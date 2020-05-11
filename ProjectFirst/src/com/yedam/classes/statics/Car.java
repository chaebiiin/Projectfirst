package com.yedam.classes.statics;

public class Car {
	// 메소드안에 선언되어지는건 변수
	// 클래스 안에 선언 되어지는건 필드
	private int speed; //초기값은 0
	private boolean stop; // boolean타입의 초기값은 false, private가 붙으면 다른 클래스에서 값을 가져 갈 수가 없음.
//	Car (int speed) {
	// this.speed = speed;
//	}

	void setSpeed(int speed) { //메소드에서 스피드의 값을 지정해줌.. 필드안의 값은 숨기고(?)
		if (speed < 0)
			this.speed = 0;
		else
			this.speed = speed;
	}
	
	int getSpeed() {
		return this.speed;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) { 
		this.stop = stop;
		this.speed = 0;
	}
	
	
}
