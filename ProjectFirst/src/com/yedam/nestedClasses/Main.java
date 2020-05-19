package com.yedam.nestedClasses;

class A { // <-외부 클래스
	A() {
		System.out.println("A객체가 생성됨.");
	}

	// static이 없어서 인스턴스 멤버 클래스임
	class B { // 인스턴스 멤버 클래스 / 정적멤버들이 올 수 없다. static타입은 올 수 없음
		B() {
			System.out.println("B 객체가 생성됨.");
		}

		int field1;

		void method1() {
			System.out.println("method1() 호출됨.");
		}
//		static void method2() {System.out.println();} //static 타입은 올 수 없음
	}

	static class C { // static이 있으면 정적 멤버 클래스!
		C() {
			System.out.println("C 객체가 생성됨.");
		}

		int field1; //
		static int field2; // static 타입 선언가능

		void method() {
			System.out.println("method1() 호출됨");
		} // 인스턴스 메소드도 쓸 수 있음.

		static void method2() {
			System.out.println("method2() 호출됨.");
		} // 정적멤버
	}

	void method() { // A가 가지고 있는 메소드안에 있는 로컬클래스, 메소드가 호출되는 시점에 생성됐다가 없어지면 사라짐?????
		class D { // A 클래스가 가지고 있는 클래스의 메소드안에 클래스가 생성 가능
			D() {
				System.out.println("D 객체가 생성됨.");
			}

			int field1;// 인스턴스 필드만 생성가능

			void method1() {
				System.out.println();
			}
		}
		D d = new D(); // 메소드클래스가 가지고 있는 매소드를 호출
		d.field1 = 10;
		d.method1();
	}

}

public class Main {
	public static void main(String[] args) {
		A a = new A(); // a클래스의 인스턴스를 만듬
		A.B b = a.new B();// A클래스가 가지고 있는 B클래스를 호출해야함
		b.field1 = 5;
		b.method1();
		A.C c = new A.C();//정적멤버 클래스인 C
		c.field1 = 10; //C클래스가 있는 인스턴스 필드 (메소드) 
		c.method();
		
		A.C.field2 = 10; //정적 멤버 클래스의 정적필드 (메소드)
		A.C.method2();
		
		a.method(); 
	}
}
