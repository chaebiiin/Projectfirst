package com.yedam.morning;

public class Code20200529 {

	public static void main(String[] args) {
		while(true) {
			int num1 = (int) (Math.random()*6) + 1;
			int num2 = (int) (Math.random()*6) + 1;

			System.out.println("(" + num1 + ", " +num2 + ")");
			if(num1+num2 ==5) {
			System.out.println("5 입니다.");
			} else {
				System.out.println("5가 아닙니다.");
			}	break;
		}
	}

}
