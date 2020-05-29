package com.yedam.morning;

public class Code20200529 {
	public static void main(String[] args) { // 4장 확인문제 주사위를 던졌을 때 눈의 합이 5가 되면 멈추게 함.
		while (true) {
			int num1 = (int) (Math.random() * 6) + 1; // 주사위 1의 값
			int num2 = (int) (Math.random() * 6) + 1; // 주사위 2의 값
			System.out.println("(" + num1 + "," + num2 + ")");
			if ((num1 + num2) == 5) { // 주사위 2개의 합이 5 이면 if 종료
				break;

			} else {
				System.out.println("주사위의 합이 5가 아닙니다.");
			}
		}

	}

}
