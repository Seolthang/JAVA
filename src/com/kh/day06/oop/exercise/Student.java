package com.kh.day06.oop.exercise;

public class Student {
	String name;
	int kor, eng, math;
	
	public Student() {
		name = "";
		kor = 0;
		eng = 0;
		math = 0;
	}
	public Student(String name) { // 1번
		this.name = name;
	}
	public Student(int kor, int eng, int math) { // 2번
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public Student(String name, int kor, int eng, int math) { // 1번 + 2번 : 따로쓰든 붙여서 쓰든 내 마음대로 하면 된다.
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}// 합계 메소드
	public int getTotal() {
		int total = this.kor + this.eng + this.math;
		return total;
	}// 평균 메소드
	public double getAvg() {
		double avg = (double)this.getTotal() / 3;
		return avg;
	}
}
