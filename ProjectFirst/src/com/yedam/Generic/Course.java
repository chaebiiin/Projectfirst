package com.yedam.Generic;

public class Course<T> {
	private String name;
	private T[] students; //배열의 타입을 받아옴.? 선언하는 시점에 타입이 정해짐.
	Course(String name, int capacity) { //생성자 capacity배열의 크기를 정하는 용도
		this.name=name; //
		this.students = (T[]) new Object[capacity]; //모든타입을  받을 수 있는 Object 타입을 선언 후. 
	}
	String getName() {
		return this.name; 
	}
	T[] getStudents() {//제네릭 타입의 배열을 리턴
		return students;
	}
	void add (T t) {//타입이 정해지면 Student 클래스에 담는 역할
		for (int i=0; i < students.length; i++) {
			if (students[i] == null) { //i null일 때 
				students[i] = t; // i에 t에 담는다? 
				break; // 한 건 담고 빠져나옴?
			}
		}
	}
	
}
