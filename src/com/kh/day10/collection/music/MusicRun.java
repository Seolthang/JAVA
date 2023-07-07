package com.kh.day10.collection.music;

public class MusicRun {
	public static void main(String[] args) { // 메인메소드를 포함하여 실행하는 클래스
		MusicFunction mFunc = new MusicFunction();
		end :
		while(true) {
			int choice = mFunc.printMenu();
			
			// 메뉴에 따라 기능 구현
			switch (choice){
			case 1 : mFunc.lastSongAdd(); break;
			case 2 : mFunc.firstSongAdd(); break;
			case 3 : mFunc.printInfo(); break;
			case 4 : mFunc.printOneBySongName(); break;
			case 5 : mFunc.removeMusicBySongName(); break;
			case 6 : mFunc.modifyMusicInfo(); break;
			case 7 : break;
			case 8 : break;
			case 9 : break;
			case 10 : break;
			case 0 : System.out.println("프로그램이 종료되었습니다."); break end;
			default: break;
			}
		}
	}
}
