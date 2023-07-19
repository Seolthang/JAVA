package com.kh.day18.member.view;

public class bubbleSort {
	public static void main(String[] args) {
		int[] arrs = {5, 17, 25, 3, 1};
		
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 1; j < arrs.length-i; j++) {
				if(arrs[j-1] > arrs[j]) {
					int temp = arrs[j-1];
					arrs[j-1] = arrs[j];
					arrs[j] = temp;
				}
			}
		}
		for(int i : arrs) {
			System.out.print(i + " ");
		}
	}
}
