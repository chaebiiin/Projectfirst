package com.yedam.collection.set;

import java.util.HashSet;
import java.util.Set;

class Member{
	String name;
	int age;
	Member(String name, int age) { //생성자
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return this.name + ", " + this.age;
	}
	
	@Override
	public int hashCode() {
//		return this.age; //age를 기준으로 hash코드를 보여줌?
		return this.name.hashCode();
	}

	
	@Override
	public boolean equals(Object obj) {
		Member mem =(Member) obj;
		return this.name.equals(mem.name);
	}
	
}
public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> members = new HashSet<>();
		members.add(new Member("Hong" ,10)); // add
		members.add(new Member("Hong" ,20));
		members.add(new Member("Hong" ,10));

		for(Member member : members) {
			System.out.println(member.toString());
			
		}
		
		Set<String> set = new HashSet<>();  //set은 중복된 값은 나타나지 않음. 
		
		set.add("Hello");
		set.add("World");
		set.add("Hello"); //<-중복값이라 출력 안됨.

		for (String str : set) {
			System.out.println(str.toString());
		}
	}
}

