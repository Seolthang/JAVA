package com.kh.day08.oop.interfacepkg;

// 1. The type PhoneInterface cannot be the superclass of SamsungPhone; 
// a superclass must be a class => extends는 사용 할 수 없다.
// 2. The type SamsungPhone must implement 
// the inherited abstract method PhoneInterface.receiveCall() 
// => abstract를 쓰거나 오버라이딩 해야 사용 가능
public class SamsungPhone implements PhoneInterface {

	@Override
	public void receiveCall() {
		System.out.println("여보세요 나야~");
	}

	@Override
	public void sendCall() {
		System.out.println("뚜루루루루");
	}

	@Override
	public void printLogo() {
		System.out.println("===== SAMSUNG =====");
	}
}
