package com.yedam.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	static class Member { //클래스 안에 선언된 클래스
		String name; //필드
		int age; //필드
		Member(String name, int age) {
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
	} // class
	
	public static void main(String[] args) {
		List<Member> members = new ArrayList<>();
		members.add(new Member("hong", 10));
		members.add(new Member("hwang", 11));
		members.add(new Member("pack", 12));
		for(Member mem : members) {
			System.out.println("이름은 " + mem.getName() + ", " + "나이는 " +  mem.getAge());
		} // for
	}// main
	public static void main1(String[] args) {
		List<String> list = new ArrayList<String>();
		; // 유틸 패키지 밑에 있는 list 인터페이스를 불러옴.. /ArrayList 인터페이스도 불러옴.
		list.add("Hello"); //0
		list.add("Wold"); //1
		list.add("Hong"); //2
		list.add(3, "Hwang"); //3

		String str1 = list.get(0); // 찾기
//		list.remove(3); // 지우기

//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		for(String str : list) { //list의 사이즈만큼 루핀돈다는 의미. 
			if (str!=null)
			System.out.println(str);
		
		} // for
	} // main 
}// class
