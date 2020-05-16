package com.yedam.Departments;

public interface DeptService {
	//생성
	public void createDept(Departments dept);
	// 전체조회
	public void getDeptList();
	// 수정
	public void changeDept(Departments dept);
	// 삭제
	public void removeDept(int deptId);
}
