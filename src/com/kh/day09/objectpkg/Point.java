package com.kh.day09.objectpkg;

public class Point{
	private int x, y;
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() { // toString 오버라이딩 : 눈에 보이지 않는것을 찾을때 많이 사용된다.
		return "x: " + this.x + ", y : " + this.y;
	}
	
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x == p.x && y == p.y) {
			return true;
		}else {
			return false;
		}
	}
}