package com.kh.day07.oop.point;

	// ColorPoint라는 클래스를 Point라는 클래스에 상속시킨다.
public class ColorPoint extends Point{ // ColorPoint 라는 클래스에는 setColor와 showColorPoint가 있다.
	private String color;
	
	public ColorPoint() {
		super();
	}
	
	public ColorPoint(int x, int y, String color) {
//		super.x = x; // 부모클래스인 Point에 x, y가
//		super.y = y; // private로 만들어졌기 때문에 직접 접근이 불가능해서 가져올 수 없다.
		super(x, y);
		this.color = color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		super.showPoint(); // 부모클래스에서 옴 // super 키워드가 생략되어있다.
	}
}
