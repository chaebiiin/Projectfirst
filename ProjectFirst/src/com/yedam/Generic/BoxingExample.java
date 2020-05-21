package com.yedam.Generic;

public class BoxingExample {
	public static void main(String[] args) {
		Box<Integer> box = Utils.boxing(new Integer(10)); //<Integer는 int타입중에 하나.. box에 integer를 담을 수 있는 타입이 선언 됨
		Integer num = box.get();
		System.out.println(num);
		
		Box<String> strBox = Utils.boxing("Park"); //< Box에 String 타입이 담김.
		String result = strBox.get();
		System.out.println(result);
	}
}
