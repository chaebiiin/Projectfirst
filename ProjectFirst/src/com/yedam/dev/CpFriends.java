package com.yedam.dev;

public class CpFriends extends Friends {
	String dept;
	CpFriends(String name, String telnumber, String dept){
		super(name, telnumber);
		this.dept = dept;
		
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	void showInfo() {
		System.out.println("이름은   " + name + ", 전화번호는  " + telnumber + ", 부서는  " + dept);

	}
}
