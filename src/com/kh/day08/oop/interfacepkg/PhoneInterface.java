package com.kh.day08.oop.interfacepkg;

public interface PhoneInterface {
	// Illegal modifier for the interface field PhoneInterface.name; 
	// only public, static & final are permitted
	// private String NAME; // private 사용 불가능
	
	// The blank final field NAME may not have been initialized
	public String NAME = ""; // public 뒤에는 static final이 생략되어있다.
	public static final int TIME_OUT = 10000;
	
	// Abstract methods do not specify a body
	// 몸체가 들어가면 이런 오류가 나온다.
	public abstract void receiveCall();
	void sendCall(); // public abstract 생략가능
	abstract void printLogo();
	public default void showLogo() {
		// 디폴트 메소드
		// 하위 호환성을 위해서 작성함.
		// 하위 호환성을 유지하고 인터페이스의 보완을 위해 작성
		System.out.println("** LG **");
	}
}
