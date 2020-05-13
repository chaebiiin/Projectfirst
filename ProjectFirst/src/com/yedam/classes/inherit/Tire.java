package com.yedam.classes.inherit;

public class Tire {
	public int maxRotation; // 타이어 수명
	public int accumulatedRotation; // 현재 사용된 회전 수
	public String location;

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		++accumulatedRotation; // Roll은 한번 호출 될 때 마다 현재 사용된 회전수를 더함.
		if (accumulatedRotation < maxRotation) { // 사용 회전수가 타이어 수명보다 크면
			System.out.println(location + "Tire의 수명" + (maxRotation - accumulatedRotation) + " 회");
			return true;
		} else {
			System.out.println("***" + location + "Tire 펑크***");
			return false;
		}
	}
}
