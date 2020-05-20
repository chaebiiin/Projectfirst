package com.yedam.exceptions;

public class Account {
	private long balance;
	public long getBalance() {
		return balance;
	}
	public void deposit (int money) {
		this.balance += money; // 입금이 되면 기존 잔액에 입금된 금액을(?) 누적시키기 위한 작업?
	}
	public void withdraw(int money) throws BalanceInsufficientException { 
		if(balance < money ) { //잔액보다 인출하려는 금액이 많은 경우 예외를 발생시킴
			throw new BalanceInsufficientException("잔고가 " + (money-balance) + "원 부족합니다."); //
			
		}
		this.balance += money;
	}
}
