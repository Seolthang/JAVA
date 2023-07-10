package com.kh.day11.iostream.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Exam_MemoPad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 입력 스트림
		System.out.print("저장할 파일명 입력 : ");
		String fileName = sc.nextLine();
		
		// 경로 입력 및 파일명으로 파일 생성
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/com/kh/day11/iostream/" + fileName + ".txt");
			// 무한반복하여 입력을 받고 exit를 입력하면 
			// 무한반복을 빠져나오는 코드 부터 작성해보기
			System.out.println("종료는 exit");
			for(int i = 1;;i++) {
				System.out.print(i + " : ");
				String input = sc.nextLine();
				writer.write(input + "\n");
				// exit을 입력하면 무한반복문 빠져나오기
				if(input.equals("exit")) break;
			}
			writer.flush();
			System.out.println("파일 저장이 완료되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
