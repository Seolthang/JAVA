package com.kh.day13.swing.basic;

import javax.swing.JFrame;

public class Exam_MyFrame extends JFrame{
	
	public Exam_MyFrame() {
		setTitle("300x300 스윙 프레임 만들기"); // 타이틀 이름 설정
		setSize(300,300); // 팝업창 크기 설정
		setVisible(true); // setVisible 설정을 해주어야 볼 수 있다.
	}

	public static void main(String[] args) {
//		Exam_MyFrame exFrame = new Exam_MyFrame(); //오른쪽이 객체 생성
		new Exam_MyFrame(); // 객체를 생성해야 동작한다.
	}
}
