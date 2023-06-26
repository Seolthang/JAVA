package com.kh.day01.TypeTrans;

public class Exam_TypeTrans2 {
	public static void main(String[] args)
	{
		byte bNum = 127;
		int iNum = 100;
		int iNum2 = 10;
		double dNum = 4.0;
		
		// 자동 형변환
		System.out.println(bNum + iNum); // byte -> int
		System.out.println(iNum2 / dNum); // int -> double
		// 계산이 안되어야 하지만 형변환이 이루어지면서 계산이 됨
		
		// 강제 형변환
		System.out.println((byte)(bNum + iNum));
		// 강제로 형변환을 하면 데이터 손실이 일어난다.
		System.out.println((int)2.9 + 1.8);
		// 자동 형변환 : int -> double, 강제 형변환 : double -> int
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)(2.9 + (int)1.8));
		
	}
}
