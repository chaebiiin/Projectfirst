package com.yedam.morning.chap04;

public class exam01_IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if(score >=90) { 
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		if(score<90) { //점수가 93점 이기 때문에 아래의 문장은 실행이 안 됨.		
			System.out.println(" 점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}
	}

}
