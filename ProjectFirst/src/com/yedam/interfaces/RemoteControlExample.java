package com.yedam.interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();

		rc = new Telecision();
		rc.turnOn();
		rc.turnOff();
	
	}
}
