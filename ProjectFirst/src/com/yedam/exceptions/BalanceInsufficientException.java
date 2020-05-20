package com.yedam.exceptions;

public class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException() {
		System.out.println("잔고가 부족합니다.");
	}
	public BalanceInsufficientException(String message) {
		super(message); // 부모클래스가 가지고 있는 메소드 호출?
	}
	

}
