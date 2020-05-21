package com.yedam.Generic;

public class Box <T> { // object는 최상위 클래스 아무 타입의 값을 받기위해 object로 선언 / 타입 파라메터라고 함. (타입이 정해지지 않은 상태)
	
		T object; // 타입을 지정하지 않음? box를 실행하는 시점에 타입을 정해 줌.
	//	Object object;
		
	void set(T object) {
		this.object = object;
	}
	T get() { //
		return object;
	}
}
