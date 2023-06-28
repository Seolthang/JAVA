package com.kh.day02.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String[]args)
	{
		// 구구단 출력
		for(int k = 1; k < 10; k++) {
			for(int h = 2; h < 10; h++) {
				System.out.print(h + " * " + k + " = " + (h*k) + "\t");
			}
			System.out.println();
		}
		
//		for(int h=1; h <= 9; h++) {
//			for(int i=2; i <=9; i++) {
//				System.out.printf("%d * %d = %2d   ", i, h, i*h);
//			}
//			System.out.println();
//		}
		
//		System.out.println("3단");
//		for(int h = 1; h < 10; h++) {
//			System.out.println("3 * " + h + " = " + 3*h);
//		}
//		System.out.println("4단");
//		for(int h = 1; h < 10; h++) {
//			System.out.println("4 * " + h + " = " + 4*h);
//		}
//		System.out.println("5단");
//		for(int h = 1; h < 10; h++) {
//			System.out.println("5 * " + h + " = " + 5*h);
//		}
	}
}
