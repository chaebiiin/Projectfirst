package com.yedam;
//기본값 비교????
public class ValueCompareExample {
	public static void main(String[] args) {
		System.out.println(" [ -128 ~ 127 초과값일 경우 ] "); //-128 ~ 127사이의 값이 아닌 초과값일 경우 혹은 적은 값일 경우. 
		Integer obj1 = 300; //위의 범위를 초과함 //자동 박싱이 됨. 
		Integer obj2 = 300; // 새로운 객체에 300 값이 들어감. 
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(" ==결과 " + (obj1 == obj2)); //번지수를 참조해서 비교하기 때문에 다르다고 나옴.
		
		System.out.println(" [ -128 ~ 127 범위의 값일 경우 ] "); //-128 ~ 127사이의 값이 아닌 초과값일 경우 혹은 적은 값일 경우. 
		Integer obj3 = 10; //
		Integer obj4 = 10; // 
		System.out.println(obj3);
		System.out.println(obj4);
		System.out.println(" ==결과 " + (obj3 == obj4)); 
		System.out.println("\u0000");
		System.out.println("\u007f");
	}
}
