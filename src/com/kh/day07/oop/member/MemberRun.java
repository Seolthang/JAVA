package com.kh.day07.oop.member; // 구조 실행용

import java.util.Scanner;

public class MemberRun {
	static int index = 0;
	public static void main(String[]args) {
		MemberFunction mFunc = new MemberFunction();
		finish :
		while(true) {
			int choice = mFunc.printMenu();
			switch(choice) { // 스위치 문으로 각각에 메뉴를 출력
			case 1 :
				mFunc.inputInfo();
				break; 
			case 2 :
				mFunc.printInfo();
				break;
			case 3 :
				System.out.println("프로그램이 종료되었습니다.");
				break finish;
			default :
				System.out.println("해당 메뉴는 존재하지 않습니다.");
				break;
    		}
		}
	}
	

	
	
}
