package com.yedam.Departments;

import java.util.Scanner;

public class DeptMain {
	public static void main(String[] args) {
		DeptService service = new DeptServiceLmpl();
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("┌─────────────────────────────────┐");
			System.out.println("│ 1.입력 2.전체리스트 3.수정   4.삭제  5.종 료  │");
			System.out.println("└─────────────────────────────────┘");
			System.out.println(" 선택 ▶");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("부서번호를 입력하세요. ");
				System.out.println(" ▶");
				int deptId = scn.nextInt();
				scn.nextLine();
				System.out.println("부서명을 입력하세요.");
				System.out.println(" ▶");
				String departmentName = scn.nextLine();
				System.out.println("지역번호를 입력하세요.");
				System.out.println(" ▶");
				int locationId = scn.nextInt();

				Departments dept = new Departments(deptId, departmentName, locationId);
				service.createDept(dept);

			} else if (menu == 2) {
				service.getDeptList();
				
			} else if (menu == 3) {
				System.out.println("변경 할 부서번호를 입력하세요.");
				int deptId = scn.nextInt();
				System.out.println("부서이름을 입력하세요.");
				String departmentName = scn.nextLine();
//				오류!!!!!
//				Departments dept = new Departments(DepartmentId, " ", departmentName, " ");
//				service.changeDept(dept);

			} else if (menu == 4) {
				System.out.println("삭제 할 부서번로를 입력하세요.");
				System.out.println(" ▶");
			} else if (menu == 5) {
				break;
			}
		} 
		System.out.println("프로그램 종료");
	}
}