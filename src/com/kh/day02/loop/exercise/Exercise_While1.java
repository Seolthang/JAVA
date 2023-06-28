package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_While1 {
	public static void main(String[]args)
	{
		// while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 -1이 입력되면 
		// 입력한 수의 합을 출력하시오.
		// 정수 하나 입력 : 3
		// 정수 하나 입력 : 4
		// 정수 하나 입력 : 7
		// 정수 하나 입력 : -1
		// 입력하신 수의 합은 14 입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = 0;
		int sum = 0;
		
		while(true) // 무한반복 : while문은 (true), for문은 (;;)
		{
			input = sc.nextInt();
			if (input == -1) {
				break;
			}
			System.out.print("정수 하나 입력 : ");
			sum += input;
		}
		System.out.println("입력하신 수의 합은 " + sum + " 입니다.");
	}
}
