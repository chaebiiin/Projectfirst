package com.yedam.classes.inherit;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 0; i < 5; i++) { 
			int problemLocation = car.run();
			
			switch(problemLocation) {
				case 1:
					System.out.println("앞 왼쪽 HankookTire 교체");
					car.frontLeftTire = new HankookTire("앞 왼쪽", 15);
					break;
				case 2:
					System.out.println("앞 오른쪽 KumhoTire 교체");
					car.frontRightTire = new KumhoTire("앞 오른쪽 ", 16);
					break;
				case 3 :	
					System.out.println("뒤 왼쪽 HankookTire 교체");
					car.backLeftTire = new HankookTire("뒤 왼쪽", 17);
					break;
				case 4 :
					System.out.println("뒤 오른쪽 KumhoTire 교체");
					car.backRightTire = new KumhoTire("뒤 오른쪽", 18);
					break;
			}
			System.out.println("==================================");
		}
	}
}
// 주소록만드는 프로그램, 친구목록을 저장하는데... 저장하는 필드는 이름, 전화번호만 저장하게 함 근데 대학친구는 이름 , 전화번호 , "전공정보"도 같이 담아야함
// 회사친구는 이름, 전화번호, "부서"를 저장해야함
//배열선언해서 담아야함... 배열이름은 friends 
//1.주소추가, 2.주소록 리스트, 3.조회 (이름에 해당되는 친구를 불러옴) 4.종료