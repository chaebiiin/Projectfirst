package com.yedam.interfaces;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpMain {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) { //
		EmpService service = new EmpServiceImpl();

		while (true) {
			System.out.println("---------------------------------------");
			System.out.println("1.입력 2.전체리스트 3.수정 4.삭제 5.종료");
			System.out.println("----------------------------------------");
			System.out.println(" ▶▶");
			int menu = scn.nextInt();
			if (menu == 1) { // 1. 입력
				System.out.print("사원번호 입력 : ");
				int empId = 0;
				try {
					 empId = scn.nextInt();
				
				} catch (InputMismatchException e) {
					System.out.println("숫자를 입력하세요.");
					scn.nextLine();
					empId=execute("사원번호 입력 : ");
				}
				scn.nextLine();
				
				System.out.println("성 입력 : ");
				String lastName = "";
				try {
					lastName = scn.nextLine();
				
				} catch(InputMismatchException e) {
					System.out.println("문자를 입력하세요.");
					scn.nextLine();
				 lastName = execute1("성 입력 : ");
				}
				scn.nextLine();
				
				System.out.println("급여 입력 : ");
				int salary = 0;
				try { 
					salary = scn.nextInt();
					
				} catch (InputMismatchException e) {
					System.out.println("숫자를 입력하세요.");
					scn.nextLine();
					salary=execute("급여 입력 : ");
				}
				scn.nextLine();
				System.out.println("입사일 입력(2020/05/05) : ");
				String hireDate = "";
				try {
				hireDate = scn.nextLine();
				}catch (InputMismatchException e) {
					System.out.println("문자를 입력하세요.");
					scn.nextInt();
					hireDate =execute1("입사일 입력(2020/05/05) : ");
				}

				Employee emp = new Employee(empId, lastName, salary, hireDate);
				service.createEmp(emp); // Empservice에 있는 내용을 호출해서 받음

			} else if (menu == 2) { // 2.전체 리스트
				service.getEmpList();

			} else if (menu == 3) { // 3.수정
				System.out.println("변경 사원번호 입력");
				int empId = scn.nextInt();
				System.out.println("급여입력");
				int salary = scn.nextInt();

				Employee emp = new Employee(empId, " ", salary, "");
				service.changeEmp(emp);

			} else if (menu == 4) { // 4.삭제
				System.out.println("삭제 할 사원번호");
				int empId = scn.nextInt();
				service.removeEmp(empId);
			} else if (menu == 5) { // 5.종료
				break;
			}

		} // while
		System.out.println("프로그램 종료");
	} // main
	
	public static int execute(String str) {
		int menu = 0;
		while(true) {
			System.out.print(str);
			try {

				menu = scn.nextInt();
				break;
			}catch(Exception e) {
				System.out.println("숫자를 입력하세요.");
				scn.nextLine();
			}
			
		}
		return menu;
	}
	public static String execute1(String str) {
		String menu1= "";
		while(true) {
			System.out.print(str);
			try {
				menu1 = scn.nextLine();
				break;
			}catch(Exception e) {
				System.out.println("숫자를 입력하세요.");
				scn.nextInt();
			}
			
		}
		return menu1;
	}
} // class
