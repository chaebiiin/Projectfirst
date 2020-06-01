package com.yedam.morning;

import java.util.Scanner;

public class Code20200531 {
	public static void main(String[] args) { // 컴퓨터가 주사위 두개를 굴렸을 때, 두개의 합이 짝인지 홀인지 맞추는 게임. 사용자에게 3번의 기회가 주어짐.
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("_________人人人 人人 人人 人 人人________");
			System.out.println("         >   짝 / 홀 맞추기 게임    <         ");
			System.out.println("￣￣￣￣￣￣Y^Y^Y^Y^Y^Y^Y^Y^Y￣￣￣￣￣");
			System.out.println(" ☞ Enter 키를 입력하여 게임을 실행하세요.");
			String select = scn.nextLine();

			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;		

			System.out.println(" 짝 / 홀 중 하나를 선택하세요.");
			String userNum = scn.nextLine();

			if ((num1 + num2) % 2 == 0) {
				if (userNum.equals("짝")) {
					System.out.println((num1 + num2) + "/  " + "맞췄습니다.");
				}
			} else {
				if (userNum.equals("홀"))
					System.out.println((num1 + num2) + "/  " + "틀렸습니다.");
			}
			break;
		}
	}
}