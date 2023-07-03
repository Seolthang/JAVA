package com.kh.day06.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	static int index = 0;
	public static void main(String[]args) {
//	Student stdOne = new Student();
	Student [] stds = new Student[3]; // 크기가 3인 객체배열 생성
		finish :
		while(true) {
//			====== 메인 메뉴 ======
//			1. 성적입력
//			2. 성적출력
//			3. 종료
//			선택 : 1
			Scanner sc = new Scanner(System.in);
			printMunu();
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : 
//				====== 성적 입력 =======
//				국어 : 100
//				영어 : 90
//				수학 : 80
				inputScore(stds);
				break;
			case 2 :
//				====== 성적 출력 ======
//				국어 : 100
//				영어 : 90
//				수학 : 80
//				총점 : 270
//				평균 : 90.00
				printScore(stds);
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
	
	public static void inputScore(Student [] stds) {
//		====== 성적 입력 =======
//				국어 : 100
//				영어 : 90
//				수학 : 80
				Scanner sc = new Scanner(System.in);
				
					stds[index] = new Student();
					System.out.println("====== 이름 입력 ======");
					System.out.print("이름 : ");
					stds[index].name = sc.next();
 					System.out.println("====== 성적 입력 ======");
					System.out.print("국어 : ");
					stds[index].kor = sc.nextInt();
					System.out.print("영어 : ");
					stds[index].eng = sc.nextInt();
					System.out.print("수학 : ");
					stds[index].math = sc.nextInt();
					if(index < stds.length) index++;
				
				// for문으로 돌려보기 
//				for(int i = 0; i < stds.length; i++) {
//					stds[i] = new Student();
//					System.out.println("====== 이름 입력 ======");
//					System.out.print("이름 : ");
//					stds[i].name = sc.next();
////					stds[i].name = sc.nextLine();
//					// 문자열 입력받는 메소드 next(), nextLing()
//					// next() : 공백없는 문자열 ex) 이름, ...
//					// nextLine() : 공백있는 문자열 ex) 주소, ...
// 					System.out.println("====== 성적 입력 ======");
//					System.out.print("국어 : ");
//					stds[i].kor = sc.nextInt();
//					System.out.print("영어 : ");
//					stds[i].eng = sc.nextInt();
//					System.out.print("수학 : ");
//					stds[i].math = sc.nextInt();
////					sc.nextLine(); // 개행 입력 받아줌
//				}
//				stds[0] = new Student();
//				System.out.println("====== 이름 입력 ======");
//				System.out.print("이름 : ");
//				stds[0].name = sc.next();
//				System.out.println("====== 성적 입력 ======");
//				System.out.print("국어 : ");
//				stds[0].kor = sc.nextInt();
//				System.out.print("영어 : ");
//				stds[0].eng = sc.nextInt();
//				System.out.print("수학 : ");
//				stds[0].math = sc.nextInt();
//				
//				stds[1] = new Student();
//				System.out.println("====== 이름 입력 ======");
//				System.out.print("이름 : ");
//				stds[1].name = sc.next();
//				System.out.println("====== 성적 입력 ======");
//				System.out.print("국어 : ");
//				stds[1].kor = sc.nextInt();
//				System.out.print("영어 : ");
//				stds[1].eng = sc.nextInt();
//				System.out.print("수학 : ");
//				stds[1].math = sc.nextInt();
//				
//				stds[2] = new Student();
//				System.out.println("====== 이름 입력 ======");
//				System.out.print("이름 : ");
//				stds[2].name = sc.next();
//				System.out.println("====== 성적 입력 ======");
//				System.out.print("국어 : ");
//				stds[2].kor = sc.nextInt();
//				System.out.print("영어 : ");
//				stds[2].eng = sc.nextInt();
//				System.out.print("수학 : ");
//				stds[2].math = sc.nextInt();
	}
		
	public static void printScore(Student [] stds) {
//		====== 성적 출력 ======
//		국어 : 100
//		영어 : 90
//		수학 : 80
//		총점 : 270
//		평균 : 90.00
		// for문으로 해보기
		for(int i = 0; i < index; i++) {
			System.out.println("====== 성적 출력 ======");
			System.out.printf("이름 : %s\n", stds[i].name);
			System.out.printf("국어 : %d\n", stds[i].kor);
			System.out.printf("영어 : %d\n", stds[i].eng);
			System.out.printf("수학 : %d\n", stds[i].math);
			System.out.printf("총점 : %d\n", stds[i].getTotal());
			System.out.printf("평균 : %.2f\n", stds[i].getAvg());
		}
//		System.out.println("====== 성적 출력 ======");
//		System.out.printf("이름 : %s\n", stds[0].name);
//		System.out.printf("국어 : %d\n", stds[0].kor);
//		System.out.printf("영어 : %d\n", stds[0].eng);
//		System.out.printf("수학 : %d\n", stds[0].math);
////		System.out.printf("총점 : %d\n", kor+eng+math);
////		System.out.printf("평균 : %.2f\n", (double)(kor+eng+math)/3);
//		System.out.println("====== 성적 출력 ======");
//		System.out.printf("이름 : %s\n", stds[1].name);
//		System.out.printf("국어 : %d\n", stds[1].kor);
//		System.out.printf("영어 : %d\n", stds[1].eng);
//		System.out.printf("수학 : %d\n", stds[1].math);
//		System.out.println("====== 성적 출력 ======");
//		System.out.printf("이름 : %s\n", stds[2].name);
//		System.out.printf("국어 : %d\n", stds[2].kor);
//		System.out.printf("영어 : %d\n", stds[2].eng);
//		System.out.printf("수학 : %d\n", stds[2].math);
	}
	
	public static void showGoodBye() {
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	public static void printException() {
		System.out.println("잘못입력하셨습니다. 메뉴를 선택해주세요.");
	}
}
