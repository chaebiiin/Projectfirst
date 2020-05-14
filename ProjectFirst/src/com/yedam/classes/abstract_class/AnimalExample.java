package com.yedam.classes.abstract_class;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal animal = new Animal(); // 추상클래스이기 때문에 인스턴스 못 만듬
		Animal animal = new Bird("조류"); // 
		animal.breathe();
		animal.sound();
		
		Cat cat = new Cat("포유류");
		cat.breathe();
		cat.sound();
		
		animal = cat; //상속관계에서는 자동 형변환이 발생함. 부모가 가지고 있는 메소드를 자식이 호출해서 쓸 수 있다.
		
	}
}
