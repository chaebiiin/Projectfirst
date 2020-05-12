package com.yedam.classes;

import com.yedam.classes.inherit.parent;

public class parentEx {
	public static void main(String[] args) {
		parent parent = new parent ("", "", "");
		parent.getLastName(); //디폴트
		parent.getFirstName(); // protected 
		parent.getTelNumber(); // public
	}
}
