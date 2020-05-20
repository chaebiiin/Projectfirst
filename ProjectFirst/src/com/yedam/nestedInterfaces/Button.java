package com.yedam.nestedInterfaces;

public class Button { 
	OnClickListener listener; //클래스 안의 필드 선언
	
	void setOnClickListener(OnClickListener listener) { //매게값을 받아와서 담음
		this.listener = listener;
	}
	
	void touch() { //필드에 선언 된 인터페이스에 메소드 호출?
		listener.onClick();	
	}
	
	interface OnClickListener { // 이벤트가 발생하면 그걸 캐치함?
		void onClick();
		
	}
}
