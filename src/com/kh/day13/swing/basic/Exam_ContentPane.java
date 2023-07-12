package com.kh.day13.swing.basic;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_ContentPane extends JFrame{
	
	public Exam_ContentPane() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 실제로 종료하게 해주는 코드 기본옵션이라고 보면된다.
														// 그전까지는 안보이게만 했음.
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.DARK_GRAY); // public static final Color ORANGE = orange;
		contentPane.setLayout(new FlowLayout()); // 버튼을 순서대로 나타내기 위해 쓰인다.
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel")); // 그냥 버튼만 추가하면 차례로 위로 쌓이게 된다.
		contentPane.add(new JButton("Ignore")); // setLayout을 통해 순서대로 나오게 할 수 있음.
		
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_ContentPane();
	}
}
