package com.yedam.exam;

public class Exam01 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
			}
		}
		System.out.println("2의 배수의 합 (3의 배수는 제외) : " + sum);
		
		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum1 += i;
			}
		}
		System.out.println("3의 배수의 합 (2의 배수는 제외) : " + sum1);
	}
}
