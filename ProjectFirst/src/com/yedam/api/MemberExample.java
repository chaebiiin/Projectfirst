package com.yedam.api;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("Hong"); // member 타임의 HONG 선언
		Member m2 = new Member("Hong");
		Member m3 = new Member("Pack");// member 타임의 Pack 선언
		if (m2.equals(m3)) { // 
			System.out.println("동등합니다.");
		} else {
			System.out.println("다릅니다."); //<-이게 출력됨, m1과 m2에 들어있는 값은 같지만, 두 개의 주소 값이다르기때문에 다르다고 출력 됨.

		}
		System.out.println(m1.toString());
		if (m1 == m2) { //
			System.out.println("동일한 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
	}
	
}
