package com.yedam.dev;

import java.util.Scanner;

public class AdressBook {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); //
		Friends[] friends = new Friends[10];
		while (true) {
			System.out.println("-------------------------------");
			System.out.println("1.주소추가  2.주소목록  3.이름조회  4.종료  ");
			System.out.println("-------------------------------");
			System.out.print("선택> ");
			int menu = scn.nextInt();

			scn.nextLine();
			if (menu == 1) {
				System.out.println(" 주소추가 선택.");
				System.out.println("1.친구 추가  2.대학친구 추가  3.회사친구 추가  ");
				int submenu = scn.nextInt();
				scn.nextLine();
				System.out.println("이름입력 : ");
				String name = scn.nextLine();
				System.out.println("전화번호 : ");
				String telnumber = scn.nextLine();
				Friends frds = null;
				if (submenu == 1) {
					frds = new Friends(name, telnumber);
				} else if (submenu == 2) {

					System.out.println("전공은 : ");
					String major = scn.nextLine();
					frds = new UvFriends(name, telnumber, major);
				} else if (submenu == 3) {

					System.out.println("부서는 : ");
					String dept = scn.nextLine();
					frds = new CpFriends(name, telnumber, dept);
				}
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = frds;
						break;
					}
				}
				System.out.println("주소가 생성 되었습니다.");
			} else if (menu == 2) {
				System.out.println("주소 목록 선택.");
				for (Friends fri : friends) {
					if (fri != null) {
						fri.showInfo();
					}
				}
			} else if (menu == 3) {
				System.out.println("이름 찾기 선택");
				System.out.println("이름을 입력하세요.");
				String name = scn.nextLine();
				int a = 0;
				for (Friends frn : friends) {
					if (frn != null && frn.getName().equals(name)) {
						frn.showInfo();
						a = 1;
					}
				}
				if (a == 0) {
					System.out.println("해당 이름이 없습니다.");
				}
			} else if (menu == 4) {
				System.out.println("종료선택.");
				break;
			} // if 의 끝
		} // while
		System.out.println("프로그램 종료.");
	}
}
