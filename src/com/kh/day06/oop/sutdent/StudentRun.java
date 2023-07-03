package com.kh.day06.oop.sutdent;

import java.util.Scanner;

public class StudentRun {
	public static void main(String[]args) {
		Student[] stdArr = new Student[2];
		finish :
		while(true) {
			int choice = printMenu();
			switch(choice) {
			case 1 :
				inputScore(stdArr);
				break; 
			case 2 :
				printScore(stdArr);
				break;
			case 3 :
				checkPass(stdArr);
				break;
			case 4 :
				System.out.println("프로그램이 종료되었습니다.");
				break finish;
    		}
		}
	}
	
	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 학생 성적 확인 프로그램 ======");
		System.out.println("");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 재평가 여부 확인");
		System.out.println("4. 프로그램 종료");
		System.out.println("메뉴 입력 : ");
		int choice = sc.nextInt();
		System.out.println(1);
		System.out.println("A");
		System.out.println("Hello Java"); // 이름이 같은 메소드들 끼리는 오버로딩이 되어있다.
		System.out.println(true); //단, 매개변수의 개수나 타입이 서로 달라야 한다.
		return choice;
	}
	public void println(int i) {}
	public void println(char c) {}
	public void println(String str) {}
	
	public static void inputScore(Student [] stdArr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < stdArr.length; i++) {
			System.out.println((i+1) + "번째 학생 정보 입력");
			System.out.println("학생 이름 입력 : ");
			String name = sc.next();
			System.out.println("1차 점수 입력 : ");
			int firstScore = sc.nextInt();
			System.out.println("2차 점수 입력 : ");
			int secondScore = sc.nextInt();
			stdArr[i] = new Student();
			stdArr[i].setName(name);
			stdArr[i].setFirstScore(firstScore);
			stdArr[i].setSecondScore(secondScore);
		}
	}
	public static void printScore(Student [] stdArr) {
		for(int i = 0; i < stdArr.length; i++) {
			System.out.println((i+1) + "번째 학생 정보 출력");
			System.out.println(stdArr[i].getName() + " 학생의 점수는 1차 점수 : " + stdArr[i].getFirstScore() + "점, 2차 점수 : "+ stdArr[i].getSecondScore() + "점입니다.");
		}
	}
	
	public static void checkPass(Student [] stdArr) {
		for(int i = 0; i < stdArr.length; i++) {
			double avg = stdArr[i].getAvg();
			int num1 = stdArr[i].getFirstScore();
			int num2 = stdArr[i].getSecondScore();
			System.out.println((i+1) + "번째 " + stdArr[i].getName() + " 학생의 확인결과");
			if(avg >= 60) {
				if(num1 < 40) {
					System.out.println("1차 시험 재평가 대상자입니다.");
				}else if(num2 < 40) {
					System.out.println("2차 시험 재평가 대상자입니다.");
				}else {
					System.out.println("통과했습니다.");
				}
			}else {
				if(num1 < 60) {
					System.out.println("1차 시험 재평가 대상자입니다.");
				}
				if(num2 < 60) {
					System.out.println("2차 시험 재평가 대상자입니다.");
				}
			}
		}
	}
}
