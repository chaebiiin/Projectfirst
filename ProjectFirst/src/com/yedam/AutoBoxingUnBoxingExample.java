package com.yedam;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		// 자동 boxing
		Integer obj = 100; //int 값 100을  포장해서 obj에 줌.
		System.out.println("value : " + obj.intValue());
		
		// 자동 unboxing
		int value = obj; //위에 100값이 value에 담김.
		System.out.println("value : " + value);
		
		//연산시 자동 unboxing
		int result = obj + 100; //Integer값에 있는 100이 자동 unboxing 되서  obj는 100이됨. 따라서 100+100
		System.out.println("result : " + result); // 200값이 나옴.
	}
}
