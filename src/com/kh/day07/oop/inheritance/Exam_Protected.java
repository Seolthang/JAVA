package com.kh.day07.oop.inheritance;

import com.kh.day07.oop.point.Point;

// 같은 패키지안에 Parent 와 Child가 있다.

class Parent{
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	public Parent() {}
	
}

class Child extends Parent{
	private int childMoney;
	public Child() {}
	void set() {
		super.pub = 1;
		super.def = 2;
		super.pro = 3;
		//super.pri = 4; // The field Parent.pri is not visible //쓸 수 없다.
	}
}

class ShapePoint extends Point{
	private String shape;
	public ShapePoint() {}
	void set() {
		super.pub = 1;
		//super.def = 2; // Point 클래스가 다른 패키지에 있어서 쓸 수 없다.
		super.pro = 3; // protected는 상속관계에 있기 때문에 가져 올 수 있다.
		//super.pri = 4; // The field Point.pri is not visible
	}
}

public class Exam_Protected {
	public static void main(String[]args) {
		
	}
}
