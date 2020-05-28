package com.yedam.exam;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);
		while (run) {
			int[] scores1 = null;
			System.out.println("---------------------------------------");
			System.out.println("1.학생수   2.점수입력  3.점수리스트   4.분석    5.종료");
			System.out.println("---------------------------------------");
			System.out.println(" 선택 > ");
			int selectNO = scn.nextInt();
			scn.nextLine();

			if (selectNO == 1) {

				System.out.println("학생 수를 입력하세요.");
				studentNum = scn.nextInt();
				scores = new int[studentNum]; 
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
			} else if (selectNO == 4) { 
				int sum = 0;
				int maxValue = Integer.MIN_VALUE;
				for (int score : scores) {
					if (score >= maxValue) {
						maxValue = score;
					} 
					System.out.println(maxValue);
					sum += score;
				}
				double avg = (double) sum / scores.length; 
				System.out.println("최고 점수는 : " + maxValue);
				System.out.println("평균은 : " + avg);
				
			} else if (selectNO == 5) {
				run = false;
			} 
		} // while
		System.out.println("프로그램 종료...");
	} // main
} // class