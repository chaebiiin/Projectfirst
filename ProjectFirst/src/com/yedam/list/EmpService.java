package com.yedam.list;

public interface EmpService { // 기능정의

	//생성, 
	public void createEmp(Employee emp); // public abstract void createEmp();
	//	전체조회, 
	public void getEmpList();
	//		수정
	public void changeEmp(Employee emp);
	//	삭제
	public void removeEmp(int empId);	
		
}
