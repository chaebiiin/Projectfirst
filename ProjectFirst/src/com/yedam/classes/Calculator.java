package com.yedam.classes;

public class Calculator {
	String model;

	void powerOn() { // <-(메소드) void 매게값도 없고 리턴 타입이 없음..
		System.out.println("전원을 켭니다.");
	}

	int sum(int num1, int num2) {
		return num1 + num2;
	}

	double sum(double num1, double num2) {
		return num1 + num2;
	}

	void println(String str) {
		System.out.println("결과값은 : " + str);
	}

	void println(int str) {
		System.out.println("결과값은 : " + str);
	}

	void println(double str) {
		System.out.println("결과값은 : " + str);
	}

	double getAreaRectangle(double width, double height) { // 사각형의 넓이 계산
		return width * height;
	}

	double getAreaRectangle(double width) {
		return width * width;
	}	
}
