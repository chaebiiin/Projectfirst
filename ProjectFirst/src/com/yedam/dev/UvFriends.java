package com.yedam.dev;

import com.yedam.dev.Friends;

public class UvFriends extends Friends {
	String major;
	UvFriends(String name, String telnumber, String major){
		super(name, telnumber);
		this.major = major;
		
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	void showInfo() {
		System.out.println("이름은  " + name + ", 전화번호는  " + telnumber + ", 전공은 " + major);

	}
}
