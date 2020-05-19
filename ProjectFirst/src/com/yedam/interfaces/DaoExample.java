package com.yedam.interfaces;

interface DataAccessObject { // DataAccessObject라는 인터페이스 생성 추상메소드(구현부분이 없음)을 설정해줘야 함
	void select();

	void insert();

	void update();

	void delete();
}

class OracleDao implements DataAccessObject { // DataAccessObject에 정의 된 메소드들을 oracleDao에서 구현 하는 클래스를 만들어 줌
	String dbType = "OracleDB";

	@Override
	public void select() {
		System.out.println(dbType + "에서 검색");
	}

	@Override
	public void insert() {
		System.out.println(dbType + "에 삽입");
	}

	@Override
	public void update() {
		System.out.println(dbType + "를 수정");
	}

	@Override
	public void delete() {
		System.out.println(dbType + "에서 삭제");
	}

}

class MySqlDao implements DataAccessObject { // DataAccessObject에 정의 되어진 메소드들을 MySqlDao class에서 구현함 (인터페이스를 구현하는 클래스?)
	String dbType = "MySql DB";

	@Override
	public void select() {
		System.out.println(dbType + "에서 검색");

	}

	@Override
	public void insert() {
		System.out.println(dbType + "에 삽입");

	}

	@Override
	public void update() {
		System.out.println(dbType + "를 수정");

	}

	@Override
	public void delete() {
		System.out.println(dbType + "에서 삭제");

	}

}

public class DaoExample {
	public static void main(String[] args) { 
		dbwork(new OracleDao()); // dbwork를 호출하는 매게값으로 DataAccessObject인 인터페이스 타입을 호출해옴(?), 그래서 인터페이스를 구현하는 클래스가 와야함(?)
		dbwork(new MySqlDao()); //자식 클래스? 
	}

	public static void dbwork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();

	}
}
