package com.kh.day13.swing.event;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_KeyListener extends JFrame {

	Exam_KeyListener() {
		setTitle("KeyListener 예제"); // 제목설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 배열과 반복문을 사용하여 코드를 간소화 해보기
		JLabel [] laArrs = new JLabel[3];
		laArrs[0] = new JLabel("getKeyCode()");
		laArrs[1] = new JLabel("getKeyChar()");
		laArrs[2] = new JLabel("getKeyText()"); // 컴포넌트 Label 초기값 설정
//		JLabel la1 = new JLabel("getKeyCode()");
//		JLabel la2 = new JLabel("getKeyChar()");
//		JLabel la3 = new JLabel("getKeyText()");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new KeyAdapter() { // Adapter 클래스 사용
			@Override
			public void keyPressed(KeyEvent e) {
				char keyChar = e.getKeyChar(); // 유니코드 키 값
				int keyCode = e.getKeyCode(); // 가상키 값
				laArrs[0].setText(Integer.toString(keyChar));
				laArrs[1].setText(Character.toString(keyChar)); // F5, F10 등 매핑 안되어있는건 나오지 않음
				laArrs[2].setText(e.getKeyText(keyCode));
			}
		});
		for(JLabel la : laArrs) {
			la.setOpaque(true); // 바탕색 보이게 하기 위해서 컴포넌트를 불투명하게 함.
			la.setBackground(Color.YELLOW); // 바탕색 노란색으로 설정
			c.add(la); // 컴포넌트 콘테이너에 추가
		}
//		la1.setOpaque(true); // 바탕색 보이게 하기 위해서 컴포넌트를 불투명하게 함.
//		la2.setOpaque(true); // 바탕색 보이게 하기 위해서 컴포넌트를 불투명하게 함.
//		la3.setOpaque(true); // 바탕색 보이게 하기 위해서 컴포넌트를 불투명하게 함.
//		la1.setBackground(Color.YELLOW);
//		la2.setBackground(Color.YELLOW);
//		la3.setBackground(Color.YELLOW);
//		c.add(la1);
//		c.add(la2);
//		c.add(la3);

		setSize(300, 150);
		setVisible(true);
		// 스윙 프레임이 만들어질 포커스를 주고자 하는 경우 setVisible 이후에
		// 포커스를 주어야 함.
		// 키 입력을 받을 수 있도록 포커스를 주는것
		c.setFocusable(true); // component가 포커스를 받을 수 있도록 설정
		c.requestFocus(); // component가 포커스 강제 지정

	}

	public static void main(String[] args) {
		new Exam_KeyListener();
	}
}