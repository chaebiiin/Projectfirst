package com.yedam.api.string;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("신용권"); // new로 만들면 무조건 새로운 객체가 만들어짐. 객체안의 값이 같더라도 다르다고 인식함.
		String strVar2 = "신용권";
		String strVar3 = "신용권";
		
		if(strVar1 ==strVar2) {
			System.out.println("같은 String 객체 참조");
		} else {
			System.out.println("다른 String 객체 참조");
		}
	
		if(strVar1.equals(strVar2)) { // 문자열을 비교하려면 equals로 비교해야한다. 
				System.out.println("같은 String 객체 참조");
			} else {
				System.out.println("다른 String 객체 참조");
			}
		}
	}
	
