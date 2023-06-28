package com.kh.day03.array;

public class Exam_Array {
	public static void main(String[]args) {
		int num; // 변수의 선언
		num = 0; // 변수의 초기화
		// int num = 0;
		int nums []; // 대괄호를 붙여주면 배열의 선언
		// int [] nums; // 배열을 선언하는 방법은 두가지가 있다.
		nums = new int[10]; // 대괄호 안에 값을 써주면 배열의 할당
		
		// nums는 배열의 주소이다. []는 연산이고 숫자가 들어가서 1칸씩 이동하여 값을 가져옴.
		nums[0] = 2; // 값 초기화
		nums[1] = 3;
		nums[2] = 4;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println("배열의 크기 : " + nums.length);
		
		// 배열의 할당 후 값 초기화를 하지 않으면 자료형의 기본값이 들어감
		// int의 기본값 : 0, String의 기본값 : null
		// 0, null은 데이터가 없음을 나타낸다.
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
