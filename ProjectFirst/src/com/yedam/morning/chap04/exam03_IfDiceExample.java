package com.yedam.morning.chap04;

public class exam03_IfDiceExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()+1); //임의의 정수를 넣고 산출.

		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
			
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
	}
}
