package com.yedam.classes.inherit;

public class parent {
	private String lastName;
	private String firstName;
	private String telNumber; 
	
	public parent() {
		
	}
	public parent(String lastName, String firstName, String telNumber) {
		super(); // object 클래스 상속. (모든 클래스의 최 상위 클래스는 object이다. )
		this.lastName = lastName;
		this.firstName = firstName;
		this.telNumber = telNumber;
	}
	
	
	String getLastName() {
		return lastName;
	}
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	protected  String getFirstName() {
		return firstName;
	}
	protected  void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	@Override //부모클래스가 가지고 있는 메소드를 수정해서 씀
	public String toString() {
		return "lastName = " + lastName + "firstName = " + firstName;
	}
}

