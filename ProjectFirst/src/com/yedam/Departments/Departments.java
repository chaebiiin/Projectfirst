package com.yedam.Departments;

public class Departments { //필드
	
	private int departmentId;
	private String departmentName;
	private int locationId;
	//생성자 -> source->Generate Constructor using Fields... 
	
	public Departments(int departmentId, String departmentName, int locationId) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.locationId = locationId;
	}
//	public Departments(int deptId, String string, String departmentName2, String string2) {
//	}
	//get&set 메소드 -> source-> Generate getters & setters
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	@Override // source-> Generate toString()
	public String toString() {
		return "Departments▷ [departmentId= " + departmentId + ", departmentName= " + departmentName + ", locationId= "
				+ locationId + "]";
	}
	
}
