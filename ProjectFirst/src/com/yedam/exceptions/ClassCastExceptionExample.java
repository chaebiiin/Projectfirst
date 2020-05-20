package com.yedam.exceptions;

abstract class Animal { // 추상클래스 선언
	abstract void sound();
}

class Dog extends Animal { // 추상메소드를 상속받아서 구현해주는 클래스
	@Override
	void sound() {
		System.out.println("멍멍");}
}
class Cat extends Animal { // 추상메소드를 상속받아서 구현해주는 클래스
	@Override
	void sound() {
		System.out.println("야옹");}
}
public class ClassCastExceptionExample { // cast ->형 변환해주는 클래스??
	public static void main(String[] args) {
		Animal dog = new Dog();
		try { 
		changeDog(dog);
		} catch (ClassCastException e){ //정상실행되기 때문에 아래의 내용은 출력되지 않음
			System.out.println("변환불가");
		}
		Animal cat = new Cat();
		try {
		changeDog(cat);
		}catch(ClassCastException e){ //예외가 발생하기 때문에 아래의 내용이 출력 됨.
			System.out.println("변환 불가.");
		}
}
	public static void changeDog(Animal animal) // dog클래스의 인스턴스를 받고 있다?
											throws ClassCastException { //예외처리 떠넘기기 ????
//		try {
//		if (animal instanceof Dog) { // 출력하기전 검사하는???
			Dog dog = (Dog) animal; // <-Cat에 있는걸 실행하려고 할 때 오류가 남 ㅎㅎ
			dog.sound();
//		} else {
//			System.out.println("변경 할 수 없는 클래스입니다.");} //if/else로 처리 해 줄 수 도 있음.
//		}catch(ClassCastException e) {
//			System.out.println("형변환을 할 수 없습니다."); // try/ catch로 예외처리 해줘도 됨.
//		}
	}
}