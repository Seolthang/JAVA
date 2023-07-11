package com.kh.day12.sort;

public class Exam_InsertionSort {
	public static void main(String[] args) {
		int [] nums = {5, 7, 2, 1, 4};
		// 5, 7, 2, 1, 4 // 첫번째 결과
		// 7번부터 시작하며 왼쪽 값과 비교
		
		// 5, 2, 7, 1, 4
		// 2, 5, 7, 1, 4 // 두번째 결과
		
		// 2, 5, 1, 7, 4
		// 2, 1, 5, 7, 4
		// 1, 2, 5, 7, 4 // 세번째 결과
		
		// 1, 2, 5, 4, 7
		// 1, 2, 4, 5, 7 
		// 1, 2, 4, 5, 7
		// 1, 2, 4, 5, 7 // 네번째 결과
		// 이미 정렬은 끝이 났지만 자기 기준 왼쪽의 값들과 비교하기때문에 
		// 값은 그대로고 실행만 된다.
		for(int i = 1; i < nums.length; i++) {
			for(int j = i; j > 0; j--) {
				if(nums[j-1] > nums[j]) {
					int temp = nums[j-1];
					nums[j-1] = nums[j];
					nums[j]= temp;
				}
			}
		}
		//출력
		for(int i : nums) {
			System.out.print(i + " ");
		}
	}
}
