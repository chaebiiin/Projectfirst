package com.yedam.classes;

import java.util.Scanner;

public class AccountExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); // 사용자가 입력한 값을 읽어옴 (System.in = 사용자가 입력한 값을 읽어오겠다는 것)
		Account[] accounts = new Account[100];
		while (true) { // 사용자가 정지할 때 까지무한반복시키기..
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성  2.계좌목록  3.예금  4.출금   5.종료  ");
			System.out.println("-----------------------------------");
			System.out.println("선택> ");
			int menu = scn.nextInt();
			scn.nextLine();// menu라는 변수에 사용자가 입력한 값을 받음
			if (menu == 1) {
				System.out.println(" 계좌생성 선택.");
				System.out.println("계좌번호를 입력하세요.");
				String ano = scn.nextLine();// next.Line->문자열로 입력값 받기
				System.out.println("예금주를 입력하세요.");
				String owner = scn.nextLine();
				System.out.println("금액을 입력하세요.");
				int balance = scn.nextInt();
				Account acnt = new Account(ano, owner, balance);
				for (int i = 0; i < accounts.length; i++) {
					if (accounts[i] == null) { // 배열 빈 곳에 새로운 값을 입력하기 위해, 배열의 빈 위치가 null값인지 먼저 확인을 한다.
						accounts[i] = acnt;
						break;
					}
				}
				System.out.println("계좌가 생성 되었습니다.");
			} else if (menu == 2) {
				System.out.println("계좌 목록 선택."); //전체 배열중에 값이 있는 경우에만 출력
				for (Account acc : accounts) { // 배열 목록(accounts)을 돌면서 acc에 넣음.
					if (acc != null) { // null값은 출력하지 않기
						System.out.println("계좌번호 : " + acc.getAno() + ", 예금주 :  " + acc.getOwner() + ", 잔액은 : "
								+ acc.getBalance());
					}
				}
			} else if (menu == 3) {
				System.out.println("예금 선택.");
				System.out.println("계좌번호를 입력하세요.");
				String ano = scn.nextLine(); // 사용자가 입력한 계좌번호(String타입)
				System.out.println("예금액을 입력하세요.");
				int balance = scn.nextInt(); // 사용자가 입력한 금액
				for (Account acc : accounts) { //
					if (acc != null && acc.getAno().equals(ano)) { //  null값이 아닐때, 계좌번호와 사용자가 입력한 계좌번호가 같은지 확인
						int result = acc.getBalance(); // 계좌의 잔액
						acc.setBalance(result + balance); // 입력 금액과 잔액을 더한 잔액
					}
				}
				System.out.println("예금 처리가 되었습니다. ");
			} else if (menu == 4) {
				System.out.println("출금 선택.");
				System.out.println("계좌번호를 입력하세요.");
				String ano = scn.nextLine(); // 사용자가 입력한 계좌번호 (String 타입)
				System.out.println("출금액을 입력하세요.");
				int balance = scn.nextInt(); // 사용자가 입력한 금액
				for (Account acc : accounts) { //
					if (acc != null && acc.getAno().equals(ano)) { // null 값이 아닐때, 계좌번호와 사용자가 입력한 계좌번호가 같은지 확인
						int result = acc.getBalance(); // 계좌의 잔액
						acc.setBalance(result - balance); // 입력 금액과 잔액을 뺀 잔액
					}
				}
				System.out.println("출금 처리가 되었습니다. ");
			} else if (menu == 5) {
				System.out.println("종료선택.");
				break;
			} // if 의 끝
		} // while
		System.out.println("프로그램 종료.");
	}// main
}// class
