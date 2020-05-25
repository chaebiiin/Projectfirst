package com.yedam.Generic;

public class Person {
	private String name;
	Person(String name) { //생성자에 name이라는 매게값을 받음.
		this.name = name; // this.
	}
	String getName() {
		return this.name; //사용자가 입력한 name을 받아서 불러오는 역할.
		
	}
}
