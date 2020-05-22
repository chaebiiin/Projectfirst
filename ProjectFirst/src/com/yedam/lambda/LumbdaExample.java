package com.yedam.lambda;

public class LumbdaExample {
	public static void main(String[] args) {
		// 1)매게값이 없는 인터페이스.
		MyfunctionalInterface fi = new MyfunctionalInterface() { // 추상메소드를 여기에서 정의해줘야함.
			// 익명구현객체/ 클래스의 이름이 없다.
			@Override
			public void run() {
				System.out.println("실행");
			}
		};
		fi.run();

		// 간단한 람다표현식. 알 수 있을만한 부분은 다 지워줌.
		MyfunctionalInterface fi2 = () -> { // -> run() 메소드를 구현하는 부분. 매게값을 넣어주는 부분.
			System.out.println("실행"); // 구현하는 부분.
		};
		fi2.run();

		// 더 간단한 람다 표현식.
		MyfunctionalInterface fi3 = () -> System.out.println("실행"); // 구현하는 부분.
		fi3.run();

		// 2)매게값이 있는 인터페이스
		// 람다 표현식.
//		MySumInterface si = new MySumInterface() {//<익명의 객체를 통해 추상메소드를 정의
//			@Override
//			public void sum(int num1, int num2) {
//				int result =  num1 + num2;
//				System.out.println("두 수의 합 : " + result);
//			} 		
		// 더 간단하게 표현.
		MySumInterface si = (num1, num2) -> { // 메게 값을 받는 부분
			int result = num1 + num2;
			System.out.println("두 수의 합 : " + result); // 실행하는 부분
		};
		si.sum(10, 20); // 메소드를 호출하고 값을 넣음.

		// 3) 반환값이 있는 인터페이스.

//		MyMultiInterface mi = new MyMultiInterface() { // 익명의 구현객체를 만듬.
//
//			@Override
//			public int multi(int num1, int num2) { //구현해줘야는 부분.
//				return num1 * num2; //매게값 2개를 곱하는걸 실행해 줄 수 있게 설정 해 준 부분
//		}
			// mi.multi(10, 15);
		
		// 더 간단하게 표현.
		MyMultiInterface mi = (num3, num4) -> {
			return num3 * num4; // 매게값 2개를 곱하는걸 실행해 줄 수 있게 설정 해 준 부분
		};
			int result = mi.multi(10,15);
			System.out.println("결과 값은 : " + result);
		
	} // main
} // class
