package com.yedam.interfaces;

public class EmpServiceImpl implements EmpService {
	EmpDAO dao = new EmpDAO();

	@Override
	public void createEmp(Employee emp) {
		dao.insertEmp(emp);
	}

	@Override
	public void getEmpList() {
		for (Employee emp : dao.getEmpList()) { // 배열에 담져져 있는 값을 가져옴
			if(emp != null)
			System.out.println(emp.toString());
		}
	}

	@Override
	public void changeEmp(Employee emp) {
		dao.updateEmp(emp);
	}

	@Override
	public void removeEmp(int empId) {
		dao.deleteEmp(empId);
	}

}
