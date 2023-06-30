package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram2 {
	Student student = new Student();
	public static void main(String[]args) {
		finish :
		while(true) {
			Scanner sc = new Scanner(System.in);
			printMunu();
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				Student.inputScore();
				break;
			case 2 :
				Student.printScore();
				break;
			case 3 : showGoodBye();
			break finish;
			default : printException();
			}
		}
	}
	
	public static void printMunu() {
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
	}
	
	public static void inputScore() {}
	public static void printScore() {}
	public static void showGoodBye() {
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	public static void printException() {
		System.out.println("잘못입력하셨습니다. 메뉴를 선택해주세요.");
	}
}
