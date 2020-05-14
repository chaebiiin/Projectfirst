package com.yedam.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	// emp 테이블에 사원등록
	public void insertEmp(Emp emp) {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String sql = "INSERT INTO emp values(" + emp.getEmployeeId() + ", '" + emp.getLastName() + "', "
				+ emp.getSalary() + ", '" + emp.getHireDate() + "'" + ")";
		try {
			System.out.println(sql);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // insertEmp 테이블 입력결과

	// employees 테이블 조회 결과
	public Employee[] getEmpList() {
		Employee[] emps = new Employee[100];
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String sql = "SELECT * FROM employees";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql); // sql 구문을 실행하기 위한
			ResultSet rs = pstmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emps[i++] = emp; // employee 인스턴스를 받는 작업을 해 줘야함

//				System.out.println(rs.getInt("employee_id") + "  " +
//						rs.getString("first_name") + "  " +  rs.getString("last_name") + "  " + 
//						rs.getString("email")+ "  " + rs.getString("phone_number")
//						);
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		System.out.println("조회 완료");
		return emps;

	} // getEmpList
}
