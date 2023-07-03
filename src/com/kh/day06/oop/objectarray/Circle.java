package com.kh.day06.oop.objectarray;

public class Circle {
	int radius; // 접근 지정자
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius; // this는 자기 자신을 나타냄
	}
	
	public double getArea() { // 생성자는 반환형이 없고 메소드는 반환형이 있다.
		double area = 3.14*radius*radius;
		return area; // 자료형을 쓸 때에는 return을 써줘야한다.
	}

	
}
