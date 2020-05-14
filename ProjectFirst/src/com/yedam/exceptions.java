package com.yedam;

public class exceptions { //예외처리
	public static void main(String[] args) {
		String str = null;
//		String str = "HELLO"; <- 값이 있으면 Nullpointerexception은 실행 되지 않음. 
		try {// 예외처리
			System.out.println(str.toString());
			Class.forName("java.lang.String2");
		} catch (NullPointerException e) { // 에외처리
			System.out.println("알 수 없는 예외가 발생.");
		} catch (Exception e) {
			System.out.println("..");
		}
		System.out.println("프로그램 종료.");
	}
}
