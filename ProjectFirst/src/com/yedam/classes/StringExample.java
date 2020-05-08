package com.yedam.classes;

public class StringExample {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "HELLO";
		
		if(str1.equals(str2)) { // 문자비교할 때는 equals를 씀
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
	}
}
