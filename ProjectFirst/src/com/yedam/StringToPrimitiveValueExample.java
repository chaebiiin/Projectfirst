package com.yedam;

public class StringToPrimitiveValueExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10"); // 문자열 10이 숫자화 되어서 value1에 담김
		double value2 = Double.parseDouble("3.14"); //문자열 3.14가 숫자화 되어서 value2에 담김
		boolean value3 = Boolean.parseBoolean("true"); // 문자열 true가 boolean으로 변환됨
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
	}
}
