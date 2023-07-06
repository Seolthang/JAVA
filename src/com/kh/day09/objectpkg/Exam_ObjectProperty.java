package com.kh.day09.objectpkg;

public class Exam_ObjectProperty {
	
	public static void print(Object obj) {
		System.out.println("클래스 이름 : " + obj.getClass().getName());
		System.out.println("해시 코드 값 : " + obj.hashCode()); // 고유한 값을 가지고 있다. (객체 생성시 부여됨)
		System.out.println("객체를 문자열로 만들어 출력 : " + obj.toString());
		System.out.println("객체 출력 : " + obj);
	}
	
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		Point p2 = new Point(4, 5);
		print(p);
		print(p2);
		
		// Object 클래스의 equals() 메소드 : 내용비교
		
		String javaStr = "Java";
		String javaStr2 = "Java";
		String javaStr3 = new String("Java");
		String [] strArrs = new String[10];
		strArrs[0] = "Java";
		strArrs[1] = "Java";
		
//		if(javaStr == "Java") { // 같습니다.
//		if(javaStr == javaStr2) { // 같습니다.
//		if(javaStr == javaStr3) { // 다릅니다. // 해시 코드 값이 다르다.
//		if(strArrs[0] == strArrs[1]) { // 문자열 비교 // 같습니다.
		if(javaStr.equals(javaStr3)) { // 해시코드값이 달라도 문자열만 비교 하기 때문에 true가 된다. // 같습니다.
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
	}
}
