package com.yedam.classes;

public class People {
	//속성 (필드) 3가지
	String name; //이름
	int phoneNum; // 전화번호
	String job; //직업
	
	// 기능(메소드) 2가지
	void work(String str1) {
		System.out.println(name + "는  " + str1 + " 에서 일한다.");
	}
	void eat(String str) {
		System.out.println(name + "는 점심으로 " + str + "을(를)먹는다.");
	}
	
	void showInfo() {
	System.out.println("이름은 : " + name + "  전화번호는  :  " + phoneNum + "  직업은 : " + job);	
	}
}
