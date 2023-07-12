package com.kh.day13.swing.event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_InnerClassListener extends JFrame{
	
	public Exam_InnerClassListener() {
		
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
	// 내부 클래스를 이용한 이벤트 리스너
	private class MyActionListener implements ActionListener{ // 인터페이스(상수와 추상메소드로만 이루어져있다.)
		// 추상메소드를 들으면 오버로딩, 오버라이딩이 떠올라야한다.
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			if(btn.getText().equals("Action")) {
				btn.setText("액션");
			}else {
				btn.setText("Action");
			}
			// 버튼에 이름을 바꾸면서 타이틀도 같이 바꿔보는 방법
			// 외부에서는 설정이 되지 않기 때문에 내부클래스로 이동시켜서 해야한다.
			Exam_InnerClassListener.this.setTitle(btn.getText()+" 이벤트 리스너 예제");
		} 
	}
	
	public static void main(String[] args) {
		new Exam_InnerClassListener();
	}
}
