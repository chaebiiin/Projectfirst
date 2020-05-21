package com.yedam.Generic;
class Apple {
	
	
}
class Orange {
	
}

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box = new Box<String>(); //<String 타입을 받음. 생성자도 똑같이 해줘야 함.
		box.set("Hello"); //<- String 타입만 받음 형변환 안 해줘도 됨. ㅎㅎ
		box.get(); // 리턴타입은 오브젝트
		String str = (String) box.get(); //<-형변환을 해줘야 한다. get은 리턴타입이 object이기 때문에. 
		
		Box<Apple> appleBox = new Box<Apple>();
		appleBox.set(new Apple());
		Apple apple = appleBox.get();

		Box<Orange> orangeBox = new Box<Orange>();
		orangeBox.set(new Orange());
		Orange orange = orangeBox.get();
	
	
	}

}
