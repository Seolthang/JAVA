package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Exam_JRadioButton extends JFrame{

	public Exam_JRadioButton() {
		setTitle("JRadioButton 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectcherry = new ImageIcon("images/selectcherry.jpg");
		
		JRadioButton apple = new JRadioButton("사과", true);
		JRadioButton pear = new JRadioButton("배");
		JRadioButton cherry = new JRadioButton("체리", cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectcherry);
		// 라디오 버튼을 1가지만 선택되도록 해주는 버튼 그룹, 
		// input[type=radio] 태그의 name을 맞춰주는것과 같음
		ButtonGroup g = new ButtonGroup(); // 전부 선택이 아닌 클릭한것만 선택하게 해준다.
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_JRadioButton();
	}
}
