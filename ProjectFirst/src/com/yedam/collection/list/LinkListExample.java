package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>(); //인덱스의 값으로 ? 
		long startTime, endTime;
		startTime = System.nanoTime(); // 현재 시간을 long타입으로 세세하게 리턴해줌.
		for (int i = 0; i < 10000; i++) { //만번 반복해서 
			list1.add(0, String.valueOf(i)); //valueOf는 숫자를 문자로 바꿔줌.
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList : 처리시간 = " + (endTime - startTime));
		
		// list1과 list2의 차이
		List<String> list2 = new LinkedList<>();
		
		startTime = System.nanoTime(); //
		for (int i = 0; i < 10000; i++) { //
			list2.add(0, String.valueOf(i)); //
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList : 처리시간 = " + (endTime - startTime));
	}
}
