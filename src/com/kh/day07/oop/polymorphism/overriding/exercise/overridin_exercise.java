package com.kh.day07.oop.polymorphism.overriding.exercise;

class SuperClass {
	void paint() { // 3번 실행
		draw(); // 4번 실행
	}
	void draw() { // 7번 실행
		System.out.println("Super Object"); // 8번 실행
	}
}

class SubClass extends SuperClass{ // SuperClass를 참조하는 SubClass
	void paint() { // 1번 실행
		super.paint(); // 2번 실행
		super.draw(); // 6번 실행
	}
	void draw() { // 5번 실행
		System.out.println("Sub Object");
	}
}

public class overridin_exercise {
	public static void main(String[] args) {
		SuperClass ex = new SubClass();
		ex.paint();
	}
}

