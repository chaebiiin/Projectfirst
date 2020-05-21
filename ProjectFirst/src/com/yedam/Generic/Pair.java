package com.yedam.Generic;

public class Pair <K, V> {
	K key; //필드
	V value; //필드
	public Pair(K key, V value) { //생성자
		this.key = key;
		this.value = value;
	
}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}