package com.yedam;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		//boxing
		Integer obj1  = new Integer(100); // int 타입의 100
		Integer obj2  = new Integer("100"); // 문자열로 100을 줌
		
		//생성자를 만들지 않고 valueOf 메소드를 사용할 수 있다.
		Integer obj3  = Integer.valueOf(300); //valueOf는 정적메소드
		Integer obj4  = Integer.valueOf("300"); 

		//unboxing
		//unboxing 하기 위해서는 "기본타입명 + value()" 메소드를 호출해주면 된다.
		int value1 = obj1.intValue(); //100
		int value2 = obj2.intValue(); //100
		int value3 = obj3.intValue(); //300
		int value4 = obj4.intValue(); //300

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);		
		System.out.println(value4);
	}
}
