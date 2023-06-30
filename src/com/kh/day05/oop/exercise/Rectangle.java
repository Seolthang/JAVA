package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Rectangle {
	//	너비와 높이를 입력 받아 사각형의 넓이를 출력하는 프로그램을 작성하라. 
	//	너비(width)와 높이(height) 필드, 그리고 면적 값을 제공하는 getArea() 메소드를 가진 
	//	Rectangle 클래스를 만들어라.
	
	// ==================================> 필드
	public int width;
	public int height;
//	public int width = 0; // 이렇게도 쓸 수는 있지만, 원칙은 생성자에 적어주는것이다.
//	public int height = 0;
	
	// ==================================> 생성자
	public Rectangle() { 
		// 초기화
		 width = 0;
		 height = 0;
		 // 1. 생성자는 반환형이 없다.
		 // 2. 생성자의 이름은 클래스와 같아야한다.
		 // 3. 기본생성자는 생략이 가능하다.
		 
	}
	// ==================================> 메소드
	public int getArea() {
		return width * height;
	}
}
