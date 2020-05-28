package com.yedam.exam;

public class Exam03 {
	public static void main(String[] args) {
		System.out.println("a와  b사이의 합(for 반복문 사용)" + forSum(1, 3));
		System.out.println("a와  b사이의 합 (while 반복문 사용)" + whileSum(1,3));
	}

	public static int forSum(int a, int b) {
		int sum = 0;
		for (int j = a; j <= b; j++) {
			sum += j;
		}
		return sum;
	}

	public static int whileSum(int a, int b) {
		int sum1 = 0;
		while (true) {
			for(int j = a; j <= b; j++) {
				sum1 += j;
			}
			return sum1;
		}
	}
}
