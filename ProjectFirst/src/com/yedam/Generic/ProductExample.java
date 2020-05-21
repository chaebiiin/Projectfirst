package com.yedam.Generic;

public class ProductExample {

	public static void main(String[] args) {
		product<Apple, String> p1 = new product<Apple, String>();
		p1.setKind(new Apple());
		Apple apple = p1.getKind(); // 
		p1.setModel("사과");
		String str = p1.getModel();
	
		product<String, Orange> p2 = new product<String, Orange>();
		p2.setKind("오렌지");
		p2.setModel(new Orange());
		
		
	}

}
