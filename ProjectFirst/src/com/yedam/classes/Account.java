package com.yedam.classes;

public class Account {
	private String ano; //계좌번호
	private String owner; //계좌주
	private int balance; //잔액표시

	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;	
	}

	public String getAno() {
		return ano; //계좌번호 가져오기
	}

	public void setAno(String ano) {
		this.ano = ano; //계좌번호 수정?
	}

	public String getOwner() {
		return owner; //계좌주 가져오기
	}

	public void setOwner(String owner) {
		this.owner = owner; //계좌주 수정?
	}

	public int getBalance() {
		return balance; //잔액 가져오기?
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
