package com.kh.day08.oop.homework.q5;

public class Human {
	// 이름
	String name;
	// 커피
	String coffee;
	// 돈
	int money;
	
	public Human() {}
	public Human(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 커피사먹기
	public void buy(Cafe cafe, int money) {
		// 돈을 가지고 커피가 나와야함.
//		this.money = this.money - money;
		this.money -= money;
		cafe.sell(money);
	}
	public void printInfo() {
		System.out.println(this.name + "님의 잔액은 " + this.money + "원 입니다.");
	}
}
