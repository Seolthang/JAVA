package com.kh.day06.oop.objectarray;

import java.util.Scanner;

public class Exam_ObjectArray2 {
	public static void main(String[] args) {
		Book [] books = new Book[2]; // 참조형 : String
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("제목 >> " );
//		String title = sc.nextLine();
//		System.out.print("저자 >> " );
//		String author = sc.nextLine();
//		books[0] = new Book(title, author);
//		// The constructor Book() is undefined (기본 생성자가 없음)
////		books[0].title = title;
////		books[0].title = author;
//		
//		System.out.println("(" + books[0].title + "," + books[0].author + ")");
//		
//		System.out.print("제목 >> " );
//		title = sc.nextLine();
//		System.out.print("저자 >> " );
//		author = sc.nextLine();
//		books[1] = new Book(title, author);
//		// The constructor Book() is undefined (기본 생성자가 없음)
////		books[0].title = title;
////		books[0].title = author;
//		
//		System.out.println("(" + books[1].title + "," + books[1].author + ")");
		
		// for문으로 돌려보기
		for(int i = 0; i < books.length; i++) {
			System.out.print("제목 >> " );
			String title = sc.nextLine();
			System.out.print("저자 >> " );
			String author = sc.nextLine();
			books[i] = new Book(title, author);
			
			System.out.println("(" + books[i].title + "," + books[i].author + ")");
		}
	}
}
