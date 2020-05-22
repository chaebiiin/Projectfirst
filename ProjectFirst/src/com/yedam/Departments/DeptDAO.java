package com.yedam.Departments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeptDAO { // DB를 처리하는 클래스
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
	} // DB에 접속하는 과정

	public void insertDept(Departments dept) { // 입력
		conn = getConnect();
		String sql = "INSERT INTO dept VALUES(?, ?, ?)";
		conn = getConnect();
		try {
			pstmt = conn.prepareStatement(sql); // <- 이거 입력하면 try/catch 입력 할 수 있는 팝업 뜸
			pstmt.setInt(1, dept.getDepartmentId());
			pstmt.setString(2, dept.getDepartmentName());
			pstmt.setInt(3, dept.getLocationId());
			int r = pstmt.executeUpdate();
			System.out.println(r + " 건 입력 됐습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Departments[] getDeptList() { // 리스트 조회
		conn = getConnect();
		String sql = "SELECT * FROM dept";
		Departments[] departments = new Departments[100];
		int i = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
<<<<<<< HEAD
				Departments dept = new Departments(rs.getInt("department_id"), rs.getString("department_name"),
						rs.getInt("lacation_id"));
=======
				Departments dept = new Departments(rs.getInt("department_id"), rs.getString("department_name"), rs.getInt("location_id"));
>>>>>>> branch 'master' of https://github.com/cheabiiin/Projectfirst.git
				departments[i++] = dept;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return departments;
	}

	public void updateDept(Departments dept) { // 업데이트
		conn = getConnect();
		String sql = "UPDATE dept SET department_id = ? WHERE department_name = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dept.getDepartmentId());
			pstmt.setString(2, dept.getDepartmentName());
			int r = pstmt.executeUpdate();
<<<<<<< HEAD
			System.out.println(r + "건이 변경 되었습니다.");
		} catch (SQLException e) {
=======
			System.out.println(r + "건 변경됨");
		} catch
		(SQLException e) {
>>>>>>> branch 'master' of https://github.com/cheabiiin/Projectfirst.git
			e.printStackTrace();
		}
	} // 업데이트

	public void deleteDept(int deptId) {// 삭제
		conn = getConnect();
		String sql = " DELETE FROM dept WHERE department_id = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptId);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 삭제 됐습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// 삭제
} // class
