package com.yedam.morning.chap14;

import java.util.function.ToIntFunction;

import com.yedam.classes.StudentExample;

public class LamdaExample_06 {
	private static Student[] students = { new Student("홍길동", 90, 60), new Student("신용권", 95, 93) };

	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for (Student student : students) {
			sum += function.applyAsInt(student);
		}
		return (double) sum / students.length;
	}

	public static void main(String[] args) {

		double result = avg(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {

				return value.getEnglishScore();
			}
		});
		System.out.println("영어 평균은 : " + result);

		double result1 = avg(new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {
				return value.getMathScore();
			}

		});
		System.out.println("수학 평균은 : " + result1);
	}
}
