package com.kh.day08.oop.interfacepkg;

public class Exam_Interface {
	public static void main(String[] args) {
//		PhoneInterface phone = new PhoneInterface();
		// 1. Cannot instantiate the type PhoneInterface
		// => 인터페이스로는 객체 생성이 불가능하다.
		
		PhoneInterface phone = new SamsungPhone();
		// 업캐스팅을 이용하여 객체 생성가능
		phone.sendCall();
		phone.receiveCall();
		phone.printLogo();
	}
}
