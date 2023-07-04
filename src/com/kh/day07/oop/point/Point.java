package com.kh.day07.oop.point;

public class Point {
	 // Point라는 클래스에는 set과 showPoint가 있다.
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	private int x, y;
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.printf("%d, %d\n", x, y);
	}
}

