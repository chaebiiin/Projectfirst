package com.yedam.interfaces;

import java.util.Calendar;

public class Mycalendar {
	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal);
//		cal.set(2020,03,1);
//		System.out.println("년 : " + cal.get(Calendar.YEAR));
//		System.out.println("월 : " +  cal.get(Calendar.MONTH));
//		System.out.println("일 : " + cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println("요일 : " +cal.get(Calendar.DAY_OF_WEEK));
		showCal(2020, 7);
	}

	public static void showCal(int year, int month) { // year, month 출력
		int today = 1;
		int lastDay = getLastDay(year, month);
		int dayofWeek = getDayofWeek(year,month);
		System.out.println(" [" +2020 + "년" + month + "월]");
		String[] week = {"Sun", "Mon", "Tue", "Wed","Thr", "Fri", "Sat" };
				for (int i =0; i <week.length; i++) {
					System.out.print(week[i]);
		}
				System.out.println();
		for(int i =1; i<dayofWeek; i++) {
			System.out.printf("%3s", ""); // s는 공란을 의미
		}
		for (int i = 0; i < lastDay; i++) {
			System.out.printf("%3d", today); // printf -> 앞에서 선언한 값의 타입을 정해 줄 수 있음/ "%3"는 공란을 3개로 하겠다는 뜻임
			if ((today +dayofWeek - 1) % 7 == 0) // i를 7로 나누었을때(한 주는 7일 이니까, 7일씩 끊어서 보여주기 위함), 0으로 나누어 떨어지는지.
				System.out.println();
			today++;
		}
	}

	public static int getDayofWeek(int year, int month) {
		int dayofWeek = 0;
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		dayofWeek =cal.get(Calendar.DAY_OF_WEEK);
		return dayofWeek;
		
//		if (month == 5) { // 일(1), 월(2), 화(3),수(4),목(5),금(6), 토(7)
//			dayofWeek = 6; //금
//		}else if (month==6) {
//			dayofWeek = 2; //월
//		}
//		return dayofWeek;
	}

	public static int getLastDay(int year, int month) { // month를 기준으로 일수를 계산

		int lastDay = 0;
		if ((month <= 7 && month % 2 == 1) || (month >= 8 && month % 2 == 0)) {
			lastDay = 31;
		} else if (month == 2) {
			// 윤년 규칙 : 년도가 4로 나누어 지면서 100으로 안 나누어 지는해, 400으로 나눠지는 해.
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				lastDay = 29;
			else
				lastDay = 28;
		} else {
			lastDay = 30;
		}
		return lastDay;
	}

}
