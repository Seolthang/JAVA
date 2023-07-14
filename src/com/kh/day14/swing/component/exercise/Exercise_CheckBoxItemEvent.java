package com.kh.day14.swing.component.exercise;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise_CheckBoxItemEvent extends JFrame{
	
	private JCheckBox [] fruits; // 체크박스 버튼 객체 배열
	private String [] names = {"사과", "배", "체리"}; // 체크박스 이름 배열 
	private JLabel sumLabel;	// 합계 레이블
	private int sum;
	
	public Exercise_CheckBoxItemEvent() {
		setTitle("JCheckBox 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); // FlowLayout 사용
		sum = 0;
		sumLabel = new JLabel("사과 100원, 배 500원, 체리 200원"); // 처음 텍스트
		fruits = new JCheckBox[3];
//		fruits[0] = new JCheckBox("사과");
//		fruits[1] = new JCheckBox("배");
//		fruits[2] = new JCheckBox("체리");
//		JCheckBox apple = new JCheckBox("사과");
//		JCheckBox pear = new JCheckBox("배");
//		JCheckBox cherry = new JCheckBox("체리");
		c.add(sumLabel); // 추가하는 순서에 따라 보이는 이미지가 달라진다.
		for(int i = 0; i < fruits.length; i++) { // 반복문을 이용하여
			fruits[i] = new JCheckBox(names[i]); // 배열에 체크박스 생성해서 넣어줌
			fruits[i].setBorderPainted(true); 	 // 테두리 나오게 함
			c.add(fruits[i]);					 // 컨테츠 팬에 체크박스 추가해주기
			fruits[i].addItemListener(new ItemListener() { // 아이템리스너 핸들러 등록
				@Override
				public void itemStateChanged(ItemEvent e) { // 아이템 선택될때
					if(e.getStateChange() == ItemEvent.SELECTED) { // 선택이 됐으면
						if(e.getItem().equals(fruits[0])) { // 아이템 == 사과
							sum = sum + 100;				// 100을 더해줌
						}else if(e.getItem().equals(fruits[1])) { // 아이템 == 배
							sum = sum + 500;					  // 500을 더해줌
						}else if(e.getItem().equals(fruits[2])) { // 아이템 == 체리
							sum = sum + 200;					  // 200을 더해줌
						}
					}else { // 체크가 해제되면
						if(e.getItem().equals(fruits[0])) { // 사과는 100을 뺌
							sum = sum - 100;
						}else if(e.getItem().equals(fruits[1])) { // 배는 500을 뺌
							sum = sum - 500;
						}else if(e.getItem().equals(fruits[2])) { // 체리는 200을 뺌
							sum = sum - 200;
						}
					}
					sumLabel.setText("현재 " + sum +"원 입니다."); // 더한 값을 출력
				}
			});
		}
//		c.add(apple);
//		c.add(pear);
//		c.add(cherry);
//		apple.addItemListener(new ItemListener() {
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				if(e.getStateChange() == ItemEvent.SELECTED) {
////				sum += 100;
//					sum = sum + 100;
//				}else {
////					sum -= 100;
//					sum = sum - 100;
//				}
//				sumLabel.setText("현재 " + sum +"원 입니다.");
//			}
//		});
//		pear.addItemListener(new ItemListener() {
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				if(e.getStateChange() == ItemEvent.SELECTED) {
////					sum += 500;
//						sum = sum + 500;
//					}else {
////						sum -= 100;
//						sum = sum - 500;
//					}
//					sumLabel.setText("현재 " + sum +"원 입니다.");
//			}
//		});
//		cherry.addItemListener(new ItemListener() {
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				if(e.getStateChange() == ItemEvent.SELECTED) {
////				sum += 200;
//					sum = sum + 200;
//				}else {
////					sum -= 100;
//					sum = sum - 200;
//				}
//				sumLabel.setText("현재 " + sum +"원 입니다.");
//			}
//		});
		sumLabel = new JLabel("현재 0원 입니다.");
		c.add(sumLabel);
		
		setSize(250,150);
		setVisible(true);
	}
	
	
	public static void main(String[]args) {
		new Exercise_CheckBoxItemEvent();
	}
}
