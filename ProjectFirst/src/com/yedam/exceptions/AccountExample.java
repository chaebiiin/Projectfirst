package com.yedam.exceptions;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account(); //예금하기?
		account.deposit(1000); // <-입금?

		try {
			account.withdraw(2000);// 잔액보다 많은 금액 출금?
		} catch (BalanceInsufficientException e) {
			System.out.println(e.getMessage());
//			 e.printStackTrace(); // 예외가 발생한 영역을 추적해서 보여주는 부분임. 보통은 생략함(?)
		} finally {
			System.out.println("실행 할 메뉴를 선책하시요."); //항상 실행되는 메뉴
		}
		System.out.println("end of prog");
	}

}
