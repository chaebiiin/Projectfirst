package com.yedam.classes.inherit;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() { // HankookTire라는 메소드에 Roll을 호출
		++accumulatedRotation; // Roll은 한번 호출 될 때 마다 현재 사용된 회전수를 더함.
		if (accumulatedRotation < maxRotation) { // 사용 회전수가 타이어 수명보다 크면
			System.out.println(location + "HankookTire의 수명" + (maxRotation - accumulatedRotation) + " 회");
			return true;
		} else {
			System.out.println("***" + location + "HankookTire 펑크***");
			return false;
		}
	}

}
