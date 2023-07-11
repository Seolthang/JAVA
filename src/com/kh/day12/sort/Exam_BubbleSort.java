package com.kh.day12.sort;

public class Exam_BubbleSort {
	public static void main(String[] args) {
		
		int [] nums = {5, 7, 2, 1, 4};
		
		// {5, 7, 2, 1, 4} 첫번째 비교
		// {5, 2, 7, 1, 4}
		// {5, 2, 1, 7, 4}
		// {5, 2, 1, 4, 7} 4번 비교
		
		// {5, 2, 1, 4, 7} 첫번째 결과값
		
		// {2, 5, 1, 4, 7} 두번째 비교
		// {2, 1, 5, 4, 7}
		// {2, 1, 4, 5, 7} 3번 비교
		
		// {2, 1, 4, 5, 7} 두번째 결과값
		
		// {1, 2, 4, 5, 7} 세번째 비교
		// {1, 2, 4, 5, 7} 2번 비교
		
		// {1, 2, 4, 5, 7} 결과값
		
		// 버블정렬
		for(int i = 0; i < nums.length-1; i++) {
			for(int j = 0; j <(nums.length-1)-i; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		for(int i : nums) {
			System.out.print(i + " ");
		}
	}
}
