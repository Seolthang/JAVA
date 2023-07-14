package com.kh.day15.swing.exercise;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyModalDialog extends JDialog{ // 외부 클래스 방식 JDialog를 상속받음
	private JTextField field;
	private JButton btn;
	public MyModalDialog() {}
	public MyModalDialog(JFrame frame, String title, JButton jBtn) {
		super(frame, title);
		setLayout(new FlowLayout());
		field = new JTextField(10);
		add(field);
		btn = new JButton("OK");
		btn.addActionListener(new ActionListener() { // OK버튼 누르면 사라지게 하는 코드
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if(field.getText().length() == 0) return;
				else jBtn.setText(field.getText());
				field.setText("");		// 다이얼로그 호출될 때 필드를 비워줌
			}
		});
		add(btn);
		setSize(200,100);
		
	}
	
//	public String getInput() {
//		if(field.getText().length() == 0) return null;
//		else return field.getText();
//	}
}

public class Exercise_DialogSetText extends JFrame{
	private MyModalDialog dialog;
	public Exercise_DialogSetText() {
		super("다이얼로그 텍스트 셋팅 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Modal Dialog"); // 버튼 생성
		btn.setSize(200,50); 		// 버튼 사이즈
		btn.setLocation(15, 50);	// 버튼의 위치
		dialog = new MyModalDialog(this, "Show Modal Dialog", btn);
		btn.addActionListener(new ActionListener() { // 익명 클래스 타입으로 구현
			
			@Override // 오버라이딩 한다.
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
//				String text = dialog.getInput();
//				if(text == null) return;
//				JButton btn = (JButton)e.getSource();
//				btn.setText(text);
			}
		});
		
		Container c = getContentPane();
		c.setLayout(null);
		c.add(btn);
		
		setSize(250,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exercise_DialogSetText(); // 객체 생성을 해주어야 실행이 가능하다.
	}
}
