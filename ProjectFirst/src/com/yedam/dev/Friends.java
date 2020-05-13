package com.yedam.dev;

public class Friends {
	String name;
	String telnumber;

	public Friends(String name, String telnumber) {
		this.name = name;
		this.telnumber = telnumber;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelnumber() {
		return telnumber;
	}

	public void setTelnumber(String telnumber) {
		this.telnumber = telnumber;
	}

	void showInfo() {
		System.out.println("이름은  " + name + ", 전화번호는  " + telnumber);

	}
}