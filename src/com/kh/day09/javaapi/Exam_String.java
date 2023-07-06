package com.kh.day09.javaapi;

public class Exam_String {
	public static void main(String[] args) {
		String msg = "Hello Java";
		msg = new String("Hello Java"); // 내용은 같지만 해시코드(주소)가 달라짐
		// 내용비교 equals를 이용하여 값을 비교해야 한다.
		
		String data1 = new String(" C#");
		String data2 = new String(",C++ ");
		
		// 배열과 다르게 여기에서의 length에는 뒤에 소괄호를 붙여줘야한다.
		System.out.println(data1 + "의 길이는 " + data1.length()); 
		System.out.println(data2 + "의 길이는 " + data2.length());
		
		// 문자열 포함
		System.out.println("#이 있는가? : " + data1.contains("")); 
		
		// 문자열 연결
		data1 = data1.concat(data2); // C#,C++
		System.out.println("연결된 문자열 : " + data1); // 공백도 문자열로 치기 때문에 공백도 포함된다.
		System.out.println(data1.length()); // 8
		
		// 공백제거
		data1 = data1.trim();
		System.out.println("공백 제거 확인 : " + data1);
		
		// 문자열 교체
		data1 = data1.replace("C#", "JAVA");
		System.out.println("문자열 교체 : " + data1);
		
		// 문자열 분리
		System.out.println("문자열 분리");
		String[]words = data1.split(",");
		for(int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " / ");
		}
//		System.out.println(words[0]);
//		System.out.println(words[1]);
		
		// 문자열 자르기
		// JAVA,C++
		System.out.println();
//		data1 = data1.substring(5);
//		System.out.println("문자열 자르기 : " + data1);
		data1 = data1.substring(0, 4);
		System.out.println("범위 자르기 : " + data1);
		
		// 문자 자르기(from String)
		char word = data1.charAt(0);
		System.out.println("문자 자르기 : " + word);
	}
}
