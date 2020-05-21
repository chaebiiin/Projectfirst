package com.yedam.Generic;

public class Utils {
	public static <T> Box<T> boxing(T t) { // 박싱이라는 메소드 
		Box<T> box = new Box<T>(); // 받아오는 값의 타입은 아직 안 정해져 있음. 실행되는 시점에서 타입이 정해짐.
		box.set(t);
		return box;
	}
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) { //비교하는 메소드를 만듬
		boolean keyComp = p1.getKey().equals(p2.getKey());
		boolean valComp = p1.getValue().equals(p2.getValue());
		return keyComp && valComp;
	}
	public static <T extends Number> int compare(T t1, T t2) {
		double d1 = t1.doubleValue(); 
		double d2 = t1.doubleValue(); 
		return Double.compare(d1, d2);
	}
	
}
