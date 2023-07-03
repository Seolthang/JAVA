package com.kh.day06.oop.objectarray;

public class Exam_ObjectArray {
	public static void main(String[]args) {
//		Circle c = new Circle();
//		c.radius = 10;
//		double result = c.getArea();
//		System.out.println(result);
		Circle [] cArray;
		cArray = new Circle[5]; // 써클 5개를 담을 수 있는 공간을 만들었다.
		Circle c = cArray[0]; // 객체가 아닌 공간만 있기 때문에 null이 출력된다.
		System.out.println(c);
		//c.radius = 10; // null인 상태인데 필드에 접근을 하려고 해서 오류가 난다.
		cArray[0] = new Circle(); 
		System.out.println(cArray[0]);
		cArray[0].radius = 10;
		
		for(int i = 0; i < cArray.length; i++) {
			cArray[i] = new Circle(); // 이때 화살표가 생기는 것
		}
		cArray[0].radius = 1; // cArray[0]은 위에 new Circle();을 해줘서 오류가 안났음 
		cArray[1].radius = 2; // Cannot assign field "radius" because "cArray[1]" is null
		cArray[2].radius = 3;
		cArray[3].radius = 4;
		cArray[4].radius = 5;
		
		System.out.println(cArray[0].getArea());
		System.out.println(cArray[1].getArea());
		System.out.println(cArray[2].getArea());
		System.out.println(cArray[3].getArea());
		System.out.println(cArray[4].getArea());
		
	}
}
