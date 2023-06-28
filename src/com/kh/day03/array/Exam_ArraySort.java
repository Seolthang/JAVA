package com.kh.day03.array;

public class Exam_ArraySort {
	public static void main(String[]args) {
		// {1, 3, 6, 10, 4, 7, 5, 2, 9, 8}
		// -> {1, 2, 3, 4, ... // 우리는 눈으로 보고 하나하나 찾아서 순서대로 적는다.
		// 정렬 알고리즘의 종류
		// 1. 삽입정렬
		// 2. 선택정렬
		// 3. 버블정렬
		// 4. 퀵정렬
		// 5. ....
		
		int num1 = 5;
		int num2 = 15;
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);
		int temp = num1; // temp : 5
		num1 = num2; // num1 : 15
		num2 = temp; // num2 : 15 // 두개의 자리를 바꿀때에는 임시변수를 선언해서 사용하도록 한다.
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);
		
		int [] nums = {2, 1, 3};
		// 3 2 1이 되도록 바꿔보세요.
		temp = nums[0]; // temp라는 임시변수에 2를 저장해놓는다.
		nums[0] = nums[2]; // 첫번째 배열에 3을 넣어주니 3이 첫번째로 간다.
		nums[2] = temp; // 세번째 배열에 temp에 임시저장한 2값을 세번째 배열로 넣어준다.
		// 그럼 현재 배열의 상태는 {3, 1, 2} 가 된다.
		temp = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
