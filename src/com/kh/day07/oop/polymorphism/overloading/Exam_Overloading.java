package com.kh.day07.oop.polymorphism.overloading;

class Weapon{
	public Weapon() {}
	public Weapon(int value) {
		System.out.println(value);
	}
	public Weapon(int value, String name) {
		System.out.println(value + " : " + name);
	}
}

public class Exam_Overloading {
	
	public static void main(String[] args) {
		System.out.println(1); // 정수
		System.out.println(1.1); // 실수
		System.out.println('A'); // 문자
		System.out.println("Hello Java"); // 문자열
		System.out.println(true); // boolean
	}
}
