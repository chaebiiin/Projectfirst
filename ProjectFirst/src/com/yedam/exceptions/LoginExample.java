package com.yedam.exceptions;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("write", "12345");
		} catch (NotExistIDException e) {
			System.out.println(e.getMessage());

		} catch (WrongPasswordException e) {
			System.out.println(e.getMessage());
		}
		try {
			login("blue", "12345");
		} catch (NotExistIDException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		if (!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다");

		}
		if (!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");

		} 
		System.out.println("정상적으로 로그인이 되었습니다.");
	}
}
