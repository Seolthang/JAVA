package com.kh.day08.oop.homework.q5;

public class StarCafe extends Cafe{
	@Override
	public void sell(int money) {
		if(money == Menu.STARMERICANO) {
			System.out.println("아메리카노 준비해드리겠습니다.");
		}else if(money == Menu.STARMLATTE) {
			System.out.println("아이스 라떼 준비해드리겠습니다.");
		}else {
			System.out.println("금액이 더 필요합니다.");
		}
	}
}
