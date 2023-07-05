package com.kh.day08.oop.homework.q5;

import com.kh.day08.oop.homework.q5.Human;

public abstract class Cafe{ // 추상 클래스
	// 카페 이름
	String cafeName;
	
	public Cafe() {}
	public Cafe(String cafeName) {
		this.cafeName = cafeName;
	}
	
//	// 커피
//	String coffee;
//	// 커피팔기
//	public void sell(int money) {
//		if(money == 4000) {
//			System.out.println("주문하신 아이스 아메리카노 한잔 나왔습니다.");
//		}else if(money == 4500) {
//			System.out.println("주문하신 아이스 라떼 한잔 나왔습니다.");
//		}
//	}
	abstract public void sell(int money); // 추상 메소드
}
