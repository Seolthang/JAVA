package com.kh.day06.oop.sutdent;

public class Student {
	// 이름
	// 첫번째 성적
	// 두번째 입력
	// 평균 출력
	private String name;
	private int firstScore;
	private int secondScore;
		
	public Student() {}
		
	public Student(String name, int firstscore, int secondscore) {
		this.name = name;
		this.firstScore = firstscore;
		this.secondScore = secondscore;
	}
	public double getAvg() {
		double avg = (double)(this.firstScore + this.secondScore)/2;
		return avg;
	}
	// gettet 메소드
	public String getName() {
		return this.name;
	}
	public int getFirstScore() {
		return this.firstScore;
	}
	public int getSecondScore() {
		return this.secondScore;
	}
	// setter 메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
}