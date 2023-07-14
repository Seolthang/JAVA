package com.kh.day14.swing.event;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Exam_DblclickChangeColor extends JFrame {

	public Exam_DblclickChangeColor() {
		setTitle("더블 클릭시 컬러변경 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setBackground(Color.BLACK);
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);

		setSize(300, 300);
		setVisible(true);
	}

//	private class MyMouseListener implements MouseListener{
//
//		@Override
//		public void mouseClicked(MouseEvent e) {
//			// TODO Auto-generated method stub
//			Component c = (Component)e.getSource();
//			c.setBackground(Color.BLUE);
//		}
//
//		@Override
//		public void mousePressed(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void mouseReleased(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void mouseEntered(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void mouseExited(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//	}

	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			// 더블 클릭 구현, 클릭 카운트 수가 2면 더블클릭으로 본다.
			if (e.getClickCount() == 2) {
				// (int)Math.random() * (최댓값 - 최솟값 + 1) + 최소값
				// 0 ~ 255 범위의 랜덤한 수를 출력하는 방법
				int red = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				int blue = (int) (Math.random() * 256);
				Component c = (Component) e.getSource();
				c.setBackground(new Color(red, green, blue));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exam_DblclickChangeColor();
	}

}
