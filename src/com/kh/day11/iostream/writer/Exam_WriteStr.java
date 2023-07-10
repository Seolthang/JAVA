package com.kh.day11.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteStr {
	public static void main(String[] args) {
		Writer writer = null;
		// 문자열을 넣어버리는 방식
		try {
			writer = new FileWriter("src/com/kh/day11/iostream/writing3.txt");
//			char [] cBuf = "IO/Stream/Bad".toCharArray();
			writer.write("IO/Stream/Bad");
			writer.flush();
			System.out.println("쓰기 완료!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
