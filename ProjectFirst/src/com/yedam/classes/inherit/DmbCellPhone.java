package com.yedam.classes.inherit;

public class DmbCellPhone extends cellPhone { // <-자식클래스 (자식클래스를 부모클래스로 상속할 때, extends를 입력 후 뒤에 부모클래스 입력해 줌)
	int channel;

	public DmbCellPhone(String model, String color) {
		super(model, color); // super는 cellPhone(부모클래스)를 가르킴

	}

	public DmbCellPhone(String model, String color, int channel) {
		super(model, color); // super는 cellPhone(부모클래스)를 가르킴
		this.channel = channel;
	}
	
	@Override //부모클래스에서 정의된 메소드를 자식클래스에서 재 정의해서 씀
	void powerOn() {
		System.out.println("DMB 폰의 전원을 켭니다.");
	}

	@Override // 부모 클래스에서 정의된 메소드를 자식클래스에서 재 정의해서 씀 
	void powerOff() {
		System.out.println("DMB 폰의 전원을 끕니다.");
	}

	void turnOnDmb() {
		System.out.println("채널 : " + channel + "번 방송을 수신.");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 : " + channel + "번으로 변경.");
	}
	void turnOffDmb() {
		System.out.println("DMB 수신을 종료.");
	}
}
