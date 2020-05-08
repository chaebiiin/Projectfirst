package com.yedam.classes;

public class PeopleExample {
	public static void main(String[] args) {
		People peo = new People();
		peo.name = "A";
		peo.phoneNum = 1234;
		peo.job = "Student";
		peo.work("학원");
		peo.eat("Coffee");
		//System.out.println("이름은 : " + peo.name + ", 전화번호는 : " + peo.phoneNum);

		People peo1 = new People();
		peo1.name = "B";
		peo1.phoneNum = 5678;
		peo1.job = " none";
		peo1.eat("Melon");
		// System.out.println("이름은 : " + peo1.name + ", 전화번호는 : " + peo1.phoneNum);

		People[] p1 = new People[2];
		p1[0] = peo;
		p1[1] = peo1;

		for(People peod : p1) {
			peod.showInfo();
	}
}
}