package com.yedam.interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO { // DB처리하는 클래스
	Connection conn = null;
	PreparedStatement pstmt = null;

	public Connection getConnect() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	} //CONNECT

	public void insertEmp(Employee emp) {
		conn = getConnect();
		String sql = "insert into emp values(?,?,?,?)";
		conn = getConnect(); // DB 접속정보(url)를 가지고 conn에 담을 예정
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId()); // 위의 ?값 중 첫번째에 employeeId를 넣어줌
			pstmt.setString(2, emp.getLastName()); // 위의 ?값 중 두번째에 lastName를 넣어줌
			pstmt.setInt(3, emp.getSalary()); // 위의 ?값 중 세번째에 Salary를 넣어줌
			pstmt.setString(4, emp.getHireDate()); // 위의 ?값 중 네번째에 HireDate를 넣어줌
			int r = pstmt.executeUpdate(); // 최종적으로 실행함
			System.out.println(r + ":건 입력됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} //INSERT

	public Employee[] getEmpList() {
		conn = getConnect();
		String sql = "SELECT * FROM emp";
		Employee[] employees = new Employee[100]; // 배열선언
		int i = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) { // 들어 있는 건수 만큼 배열에 담는 작업
				Employee emp = new Employee(rs.getInt("employee_id"), rs.getString("last_name"), rs.getInt("salary"),
						rs.getString("hire_date"));
				employees[i++] = emp; // 값이 있는지 없는지 여부를 확인하고 데이터가 들어 있는 건수 만큼 배열에 담아서 출력

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;
	} //LIST

	public void updateEmp(Employee emp) { // 전체조건 : 급여만 변경.. ㅎㅎ
		conn = getConnect(); // DB에 연결
		String sql = "UPDATE emp SET salary = ? WHERE employee_id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getSalary()); // emp중 salary값을 받아오겠다는 것
			pstmt.setInt(2, emp.getEmployeeId());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 변경됨");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	} //UPDATE

	public void deleteEmp(int empId) {
		conn = getConnect();
		String sql = "DELETE FROM emp WHERE employee_id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 삭제됨");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} //DELETE
} //CLASS
