package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		// for(;;) {}
		// while(true) {}
		int count = 0;
		for(;;) { //무한반복으로 for문이 돌아가게 해준다.
			System.out.print("정수 하나 입력 : ");
			int input1 = sc.nextInt();
			System.out.print("정수 하나 더 입력 : ");
			int input2 = sc.nextInt();
			System.out.print("연산자 입력(+,-,*,/,%) : ");
			char operator = sc.next().charAt(0);
			int result = 0;
			switch(operator) {
			case '+' : 
				result = input1 + input2;
				break;
			case '-' :
				result = input1 - input2;
				break;
			case '*' :
				result = input1 * input2;
				break;
			case '/' :
				result = input1 / input2;
				break;
			case '%' :
				result = input1 % input2;
				break;
			}
			System.out.println(input1 + " " + operator + " " + input2 + " = " + result);
			count++;
			if(count == 3)break; // 무한반복을 특정 횟수만 반복하고 끝나게끔 도와준다.
		}
	}
}
