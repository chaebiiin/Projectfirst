package com.yedam.Departments;

public class DeptServiceLmpl implements DeptService {
	DeptDAO dao = new DeptDAO();

	@Override
	public void createDept(Departments dept) {
		dao.insertDept(dept);
	}

	@Override
	public void getDeptList() {
		for (Departments dept : dao.getDeptList()) {
			if (dept != null)
				System.out.println(dept.toString());
		}
	}

	@Override
	public void changeDept(Departments dept) {
		dao.updateDept(dept);
	}

	@Override
	public void removeDept(int deptId) {
		dao.deleteDept(deptId);
	}
}
