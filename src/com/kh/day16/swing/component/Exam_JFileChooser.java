package com.kh.day16.swing.component;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Exam_JFileChooser extends JFrame {

	private JLabel imgLabel;

	public Exam_JFileChooser() {
		imgLabel = new JLabel();
		setTitle("메뉴와 파일 Chooser 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.add(imgLabel);
		createMenu();

		setSize(350, 250);
		setVisible(true);
	}

	private void createMenu() {
		JMenuBar bar = new JMenuBar(); // 메뉴바 생성
		JMenu screenMenu = new JMenu("File"); // 메뉴(screen)
		JMenuItem item = new JMenuItem("Open"); // 메뉴아이템
		// File
		// -> Open
		item.addActionListener(new ActionListener() { // 익명클래스를 이용함.
			// Open버튼이 클릭되면 동작함.
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				int chosen = 
				chooser.showOpenDialog(null); // 파일 선택창을 띄우는 방식
				// Dialog는 팝업창이라고 생각하면 된다.
				
				// FileChooser 동작시 비정상적인 선택
				if(chosen != JFileChooser.APPROVE_OPTION) {
					// 메시지 출력, 파일 선택 안했음.
					JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다."
							, "경고", JOptionPane.WARNING_MESSAGE);
					return; // 밑에 있는 코드를 실행하면 NullPointException이 발생하기 때문에 
							// 콘솔에 오류가 발생하지 않게 하기 위해서 return을 주어서 종료시켜줌.
				}
				
				String filePath = chooser.getSelectedFile().getPath();
				imgLabel.setIcon(new ImageIcon(filePath));
				// JLabel에 이미지 표시하기
			}
		});
		screenMenu.add(item); // 메뉴 아이템
		bar.add(screenMenu);
		setJMenuBar(bar);
	}

	public static void main(String[] args) {
		new Exam_JFileChooser();
	}
}
