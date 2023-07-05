package com.kh.day08.oop.homework.q5;

public class Run {
	public static void main(String[]args) {
		Human Kim = new Human("김씨", 10000);
		Kim.buy(new StarCafe(),5500);
		Kim.printInfo();
		Human Lee = new Human("이씨", 20000);
		Lee.buy(new CongCafe(), 4500);
		Lee.printInfo();
	}
}
