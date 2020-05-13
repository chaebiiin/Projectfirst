package com.yedam.classes.inherit;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(); // 인스턴스(?)를 변수에다가 담음... 'ㅁ'...ㅎ.....
		vehicle.run();

		vehicle = new Bus(); // 부모클래스 변수 = (자동 형변환 되어서)자식클래스 인스턴스가 할당이 가능함?!
		vehicle.run(); //

		vehicle = new Taxi();
		vehicle.run();

//		Taxi taxi = vehicle; //자식은 부모클래스로 자동 형 변환을 못해줌
		Taxi taxi = (Taxi) vehicle; // 부모클래스의 형 변환을 직접 해줘야 함..
		taxi.run();
	}
}
