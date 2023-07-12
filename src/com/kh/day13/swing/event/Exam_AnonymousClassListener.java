package com.kh.day13.swing.event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_AnonymousClassListener extends JFrame{
	// 익명 클래스 방식
	public Exam_AnonymousClassListener() {
		
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new ActionListener() { 
			// 클래스 없이 익명으로 하는 방법
			// 액션리스너라는 인터페이스로 오버라이딩 한다.
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				if(btn.getText().equals("Action")) {
					btn.setText("액션");
				}else {
					btn.setText("Action");
				}
				setTitle(btn.getText() + " 이벤트 리스너 예제");
			}
		});
		// 클래스 객체
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new Exam_AnonymousClassListener();
	}
}
