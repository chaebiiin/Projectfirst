package com.yedam.classes;

public class StudentExample {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "Hong";
		stu.age = 20;
		stu.height = 178.4;
		stu.weight = 70.5;
		stu.study();
		stu.eat("banana");

		// System.out.println("이름은 : " + stu.name + ", 나이는 : " + stu.age);

		Student stu1 = new Student();
		stu1.name = "Park";
		stu1.age = 30;
		stu1.height = 180.3;
		stu1.weight = 65.5;
		stu1.study();
		stu1.eat("Apple");
		// System.out.println("이름은 : " + stu1.name + ", 나이는 : " + stu1.age);

		Student stu2 = new Student("Choi");
		stu2.age = 40;
		stu2.height = 164.3;
		stu2.weight = 65.5;
		stu2.study();
		stu2.eat("Orange");
		// System.out.println("이름은 : " + stu2.name + ", 나이는 : " + stu2.age);

		Student[] s1 = new Student[3];
		s1[0] = stu;
		s1[1] = stu1;
		s1[2] = stu2;// <생성자...

		int inputStr = 20;

		for (Student stud : s1) {
			if (inputStr == (stud.age)) {
				System.out.println(stud.name + " /  " + stud.age);
			}
		}
	}
}
