package com.yedam.morning;

import java.util.Random;
import java.util.Scanner;

public class Code20200530 {
	static int strike = 0 ;
	static int ball =0;
	
	public static void main(String[] args) {
		int com[] = new int[3];  // 
		int user[] = new int[3];
		
		Random r = new Random(); //중복 방지를 위한 컴퓨터 번호 설정, 0~9까지의 숫자 생성
		
		//컴퓨터 [0] 숫자가 0이면 랜덤값을 생성.
		while( com[0] == 0) {
			com[0] = r.nextInt(10);
		}
		//컴퓨터 [0]의 숫자와 [1]의 숫자가 같거나 [1]의 숫자가 0이라면 랜덤값 생성
		while(com[0] == com[1] || com[1] == 0) {
			com[1] = r.nextInt(10);
		}
		//컴퓨터[1]의 숫자와 [2]의 숫자가 같거나, [3]의 숫자가 0이라면 랜던값 생성
		while(com[1] == com[2] || com[2] ==0) {
			com[2] = r.nextInt(10);
		}
		//유저가 값을 입력하는 변수.
		Scanner s = new Scanner (System.in);
		int playcount = 1;
	
		while (strike <3) {
			for (int i = 0; i<user.length; i ++) {
				System.out.print ( (i+1) + " 번째 수 :  ");
				user[i] = s.nextInt();
				
				while( user[i] >=10 || user[i] <=0) {
					System.out.println("1~9 사이의 숫자를 입력하세요.");
					System.out.print((i+1) + "번째 수 : " );
					user[i] = s.nextInt();
				} // (for)while
			} //while(for)
			if (com[0] == user[0]) {
				strike++;
			} else if (com[0] == user[1]) {
				ball++;
			}
			if (com[1] == user[1]) {
				strike++;				
			}else if (com[1] == user[0]) {
				ball++;
			}else if (com[1] == user[2]) {
				ball++;
			}
			if (com[2] == user[2]) {
				strike++;
			}else if (com[2] == user[1]) {
				ball++;
			}else if (com[2] == user[0]) {
				ball++;
			}
			if (strike == 0 && ball == 0 ) {
				System.out.println( "    아웃!    ");
			}else if (strike == 3) {
				System.out.println(" 스트라이크!! "+ "총" + " \n " + playcount + "번 시도했습니다.");
			}else {
				System.out.println("\n" + strike + "  스트라이크  " + "/" + ball + "볼\n");
				strike = 0;
				ball = 0;
			}
			playcount++;
		} // while
		System.out.println("----------------------------");
		System.out.println("     프로그램 종료         ");
		 System.out.println("---------------------------");
	}//main
}//calss
