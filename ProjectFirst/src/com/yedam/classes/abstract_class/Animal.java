package com.yedam.classes.abstract_class;
//추상 클래스()
public abstract class  Animal {
	String kind;
	public Animal(String kind) {
		this.kind = kind;
	}
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	public abstract void sound(); //추상메소드 sound() 구현하는 부분이 없다...? 상속받는 클래스들(자식)은 이 메소드를 꼭 정의 해줘야 한다.
}
