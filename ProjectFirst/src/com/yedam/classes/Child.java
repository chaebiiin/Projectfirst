package com.yedam.classes;

import com.yedam.classes.inherit.parent;

	public class Child extends parent {
	Child() {
		super();
	}
	Child (String LastName, String FirstName, String TelNumber) {
		super(LastName, FirstName, TelNumber);
	}
	void showInfo() {
		Child child = new Child();
//		child.getLastName(); //default 값이라 불러 올 수 없음.. (동일한 패키지 안에서는 접근이 가능함.)
		child.getFirstName(); // protected (상속의 관계에 있으면 접근이 가능하다.)
		child.getTelNumber(); //public 
	}
}
