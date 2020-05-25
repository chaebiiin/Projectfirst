package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {// List에 Sting타입으로 받겠다.
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add(new String("Hello"));
		list.add("World");
		list.add(2, "Hong"); //[0]인텍스에 들어감.
		list.add(2, "Hong"); //[1]중복값 가능
		list.add(2, "Hwang"); // 한칸씩 뒤로 밀어준다????????????
		list.set(2, "Park");//위치의 값을 바꿔준다. Hwang이 park으로 바뀜
		
		for (String str : list) { //list인터페이스에 담겨져있는 객체의 개수 만큼 루핀돈다?
			System.out.println(str.toString());
			
		}
		System.out.println("--------------------------------");
		System.out.println(list.get(1));
		System.out.println("------------------------------------");
		
		
		list.remove(4);
		System.out.println("after remove(4)");
//		for (String str : list) { //list인터페이스에 담겨져있는 객체의 개수 만큼 루핀돈다?
//		System.out.println(str.toString());
		for( int i=0; i<list.size(); i++) {	
		System.out.println(list.get(i).toString());
		}
	}
}
