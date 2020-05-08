package com.yedam.dev;

import java.util.Scanner;

public class Example09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);
		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1.학생수   2.점수입력  3.점수리스트   4.분석    5.종료");
			System.out.println("---------------------------------------");
			System.out.println(" 선택 > ");
			int selectNO = scn.nextInt();
			scn.nextLine();

			if (selectNO == 1) {
				System.out.println("학생 수를 입력하세요.");
				studentNum = scn.nextInt();
				scores = new int[studentNum]; // new int[5]랑 같은 것. []안에 변수가 들어 갈 수도 있다..
				System.out.println("배열이 생성 되었습니다.");
			} else if (selectNO == 2) {
				int i = 0;
				for (int score : scores) {
					System.out.println("점수를 입력하세요.");
					score = scn.nextInt();
					scores[i++] = score;

				}
			} else if (selectNO == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
			} else if (selectNO == 4) { // 합계, 평균
				int sum = 0;
				int maxValue = Integer.MIN_VALUE;
				// int cnt = 0 ;
				for (int score : scores) {
					if (score >= maxValue) {
						maxValue = score;
					} 
					System.out.println(maxValue);
					sum += score;
					// cnt++;
				}
				double avg = (double) sum / scores.length; // (cnt)
				System.out.println("합계는  : " + sum);
				System.out.println("평균은 : " + avg);
				System.out.println("최고 점수는 : " + maxValue);
			} else if (selectNO == 5) {
				run = false;
			} // if
		} // while
		System.out.println("프로그램 종료...");
	} // main
} // class
