package com.yedam.Generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
	public static void main(String[] args) {
		Object[] strAry = new Object[5];
//		String[] strAry = new String[5]; //스트링 타입의 배열을 선언
		strAry[0] = "Hello";
		strAry[1] = new Integer(0);
//		
//		String str = (String) strAry[0];
//		Integer num = (Integer) strAry[1];
//		Integer num1 = (Integer) strAry[0];
		
		List list = new ArrayList();
		
		list.add("Hello"); // <-object타입을 담음..?
		list.add("World");
		list.add(new Double(2.4));
		
		String s1 = (String) list.get(0);
		String s2 = (String) list.get(1);
		Double d1 = (Double) list.get(0);
		
		//제네릭 <- 타입을 미리 지정해서 지정해놓은 타입으로만 반환 받을 수 있게 해주는 것
		List<String> strList = new ArrayList<String>();
		strList.add(new String("Hello")); //<- 파라미터?
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(new Integer(10));
	}

}
