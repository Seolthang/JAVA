package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class Exam_JList extends JFrame{
	
	private String [] fruits = {"apple", "banana", "kiwi", "mango"
							, "pear", "berry", "strawberry", "blackberry"};
	
	private ImageIcon [] images = {
			new ImageIcon("images/house.png"),
			new ImageIcon("images/readingGlasses.png"),
			new ImageIcon("images/wifi.png"),
			new ImageIcon("images/key.png"),
	};
	private JScrollPane scrollPane;
	
	public Exam_JList() {
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JList<String> strList = new JList<String>(fruits);
		c.add(strList);
		
		JList<ImageIcon> imgList = new JList<ImageIcon>();
		imgList.setListData(images);
		c.add(imgList);
		
		JList<String> scrollList = new JList<String>(fruits);
		scrollPane = new JScrollPane(scrollList);
		c.add(scrollPane);
//		c.add(new JScrollPane(scrollList));
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_JList();
	}
}
