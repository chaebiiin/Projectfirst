package com.yedam.morning.chap04;

public class exam02_IfElseExample {
	public static void main(String[] args) {
		int score = 75;

		if (score >= 90) {
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A 입니다.");

		} else if (score >= 80) {
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B 입니다.");
		} else if (score >= 70) {
			System.out.println("점수는 70~79입니다.");
			System.out.println("등급은 C 입니다.");
		} else {
			System.out.println("점수는 70 미만입니다.");
			System.out.println("등급은 D 입니다.");
		}
	}
}
