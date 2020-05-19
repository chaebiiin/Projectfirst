package com.yedam.interfaces;
interface Action { //인터페이스 추상메소드를 정의해 놔야함
	void work();
}

public class ActionExample {
	public static void main(String[] args) { 
		Action action = new Action() {// <-여기에 익명의 객체를 만들어야 함. 아래의 action.work를 실행할 수 있도록 work라는 추상메소드를 오버라이딩 하면서
			@Override
			public void work() { // <-익명 구현객체 설정. 클래스를 따로 만들어서 추상메소드를 정의하지 않아도. 추상메소드를 구현 할 수 있다(?)
				System.out.println("복사를 합니다."); 
			}  
			
		};
		action.work(); // 복사를 합니다가 나와야 함.
	}
}
