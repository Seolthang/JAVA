package com.kh.day08.oop.abstractpkg;

class Line extends Shape {
	// 4. The type Line must implement the inherited abstract method Shape.draw()
	// 추상 클래스를 상속받겠다고 해놓고 정의를 해주지 않았다.
	// 추상메소드 오버라이딩 하지 않을거면 class 앞에 abstract를 붙여줘야 한다.
	@Override
	public void draw() {
		
	}
}

public abstract class Shape {
	
	public Shape() {}
	
	public void paint() {}
	abstract public void draw();
	// 1. Abstract methods do not specify a body
	// 몸체({})가 있으면 추상메소드를 사용할 수 없다.
	// 2. The abstract method draw in type Shape can only be defined by an abstract class
	// 추상메소드를 사용하려면 추상클래스를 만들어주어야한다.
	// 3. The type Shape must be an abstract class to define abstract methods
	
}
