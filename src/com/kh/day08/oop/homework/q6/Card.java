package com.kh.day08.oop.homework.q6;

public class Card {
	// 소유자 이름
	// 카드번호
	// 유효기간
	// cvc
	// 비밀번호
	int cardNumber;
	//int serialNumber = 10000;
	static int serialNumber = 10000; // static을 넣음으로써 독자적인 새로운공간에 10000을 집어넣어서 초기화로 돌아가지 않게 한다.
	
	public Card() {
		cardNumber = serialNumber;
		serialNumber++;
	}
	
	public void printCardInfo() {
		System.out.println(this.cardNumber+"입니다.");
	}
}
