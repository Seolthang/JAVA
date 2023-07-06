package com.kh.day09.wrapperpkg;

public class Exam_Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Integer su = Integer.valueOf(0);
//		su = new Integer(0);
		// The constructor Integer(int) has been deprecated since version 9 and marked for removal
		// 곧 없어질것이니 이렇게 쓰지 마시오.
//		su = null; // null 체크가 가능하다
		
		// 박싱과 언박싱
		su = Integer.valueOf(1026);
		su = 1026; // 오토-박싱
		
		int suNum = su.intValue();
		suNum = su; // 오토-언박싱
		
		String openDay = "20230515";
		int openDate = Integer.parseInt(openDay);
		
		System.out.println(Character.toLowerCase('A')); // 대문자를 입력했지만 소문자로 바꿔준다
		System.out.println(Character.toUpperCase('a')); // 소문자를 입력했지만 대문자로 바꿔준다
		
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1)) {
			System.out.println(c1 + "은 숫자");
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2 + "는 영문자");
		}
	}
}
