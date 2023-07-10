package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_Read {
	public static void main(String[] args) {
		Reader reader = null;
		// Cannot instantiate the type Reader
		
		try {
			// 이런것들을 Checked Exception이라고 함
			reader = new FileReader("src\\com\\kh\\day11\\iostream\\reading.txt");
			// Unhandled exception type FileNotFoundException
			// 로직에 대한 예외 처리가 필요하다.
			
			while(true) {
				// 데이터들이 숫자로 되어있기 때문에 int를 쓴다.
				int readData = reader.read();
				// Unhandled exception type IOException
				if(readData == -1)break;
				System.out.print((char)readData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// Unhandled exception type IOException
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
