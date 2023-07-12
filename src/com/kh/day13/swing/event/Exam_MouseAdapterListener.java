package com.kh.day13.swing.event;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_MouseAdapterListener extends JFrame{
	
	public Exam_MouseAdapterListener() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel la = new JLabel("Hello");
		la.setSize(50,20);
		la.setLocation(30,30);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.add(la);
		c.addMouseListener(new MouseAdapter() {
			// 추상 클래스로 만들면 MouseAdapter에 사용으로
			// 내가 사용 하고 싶은 메소드만 사용할 수 있다.
			// 그 이유는 추상클래스 추상메소드 말고도 다른 메소드를 가질 수 있기 때문이다.
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x, y);
			}
		});
		
		setSize(250,250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_MouseAdapterListener();
	}
}
