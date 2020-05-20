package com.yedam.api;

public class Member { // "extends object "가 포함되어 있다.
	public String id;
	public Member() { // 기본생성자
		
	}
	public Member(String id) { // 
		this.id = id;
	}
	
	@Override  
	public int hashCode() { 
		return id.hashCode();
		//		return super.hashCode();
	
	}
	@Override
	public boolean equals(Object obj) { //부모클래스가 가지고 있는 equals를 가져옴(?)
		Member m = (Member) obj; //obj를 member 타입으로 변환(?)
		return this.id.equals(m.id); //(String 타입으로 비교해줌)
		//		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "id 값은 " + this.id;
//		return super.toString();
	}
	
}
