package com.kh.day16.swing.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exam_OptionPane extends JFrame{
	
	
	public Exam_OptionPane() {
		
		setTitle("옵션 팬 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new Mypane(), BorderLayout.NORTH);
		
		setSize(500,200);
		setVisible(true);
	}
	
	private class Mypane extends Panel{
		private JButton inputBtn;
		private JButton confirmBtn;
		private JButton msgBtn;
		private JTextField tf;
		public Mypane() {
			setBackground(Color.LIGHT_GRAY);
			inputBtn = new JButton("Input Name");
			confirmBtn = new JButton("Confirm");
			msgBtn = new JButton("Message");
			tf = new JTextField(10);
			
			inputBtn.addActionListener(new ActionListener() { // 익명클래스를 이용함.
				@Override
				public void actionPerformed(ActionEvent e) {
//					System.out.println("Clicked"); // inputBtn이 동작하는지 확인하는 작업
					String name = 
					// 사용자가 입력한값이 리턴이 된다.
					JOptionPane.showInputDialog("이름을 입력하세요."); // 자바스크립트에 prompt와 동일하다. 
					if(name != null) {
						tf.setText(name); // 값을 입력 받아서 텍스트 필드에 입력값을 출력한다.
					}
				}
			}); // input버튼이 눌리면 동작하도록 함.
			
			confirmBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int choice = 
					JOptionPane.showConfirmDialog(null, "계속할 것입니까?", "confirm"
							, JOptionPane.YES_NO_OPTION);
					// Yes, No 옵션을 통하여 예 아니오를 눌렀을시에 둘 중 하나에 값이 출력된다.
//					if(choice == JOptionPane.CLOSED_OPTION) // X표시 누르면
					if(choice == JOptionPane.YES_OPTION) {
						tf.setText("Yes");
					}else if(choice == JOptionPane.NO_OPTION) {
						tf.setText("No");
					}
				}
			}); // confirm버튼이 눌리면 동작하도록 함.
			
			msgBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// 클릭시 조심하세요 라는 경고창을 띄워준다
					JOptionPane.showMessageDialog(null, "조심하세요", "message"
							, JOptionPane.ERROR_MESSAGE);
				}
			}); // msg버튼이 눌리면 동작하도록 함.
			
			add(inputBtn);
			add(confirmBtn);
			add(msgBtn);
			add(tf);
			
		}
	}
	
	public static void main(String[] args) {
		new Exam_OptionPane();
	}
}
