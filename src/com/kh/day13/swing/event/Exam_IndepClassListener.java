package com.kh.day13.swing.event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_IndepClassListener extends JFrame{
	
	public Exam_IndepClassListener() {
		
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		// 클래스 객체
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_IndepClassListener();
	}
}

//외부 클래스를 이용한 이벤트 리스너
class MyActionListener implements ActionListener{ // 인터페이스(상수와 추상메소드로만 이루어져있다.)
	// 추상메소드를 들으면 오버로딩, 오버라이딩이 떠올라야한다.
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		if(btn.getText().equals("Action")) {
			btn.setText("액션");
		}else {
			btn.setText("Action");
		}
	} 
}