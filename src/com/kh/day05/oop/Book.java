package com.kh.day05.oop;

public class Book {
	// 제목과 저자를 나타내는 필드를 가진 Book클래스를 작성하고,
	// 생성자를 작성하여 필드를 초기화 하여라
	// 클래스 바로 밑에 선언하는 변수 = 필드 = 멤버 또는 멤버변수
	// =========================================> 필드
	// 						변수 = 필드 = 멤버변수
	public String title; // title 멤버변수를 선언
	public String author; // author 멤버변수를 선언
	// =========================================> 생성자
	public Book() { // 생성자 작성
		
		title = ""; // 필드 초기화
		author = ""; // 필드 초기화
	}
	public Book(String title) {
		this.title = title;
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	// =========================================> 메소드
	
	
}
