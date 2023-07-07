package com.kh.day10.collection.music;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicFunction {
	
	List<Music> msList; // 인터페이스
	
	public MusicFunction() {
		msList = new ArrayList<Music>();
	}
	
	public int printMenu() { // 프린트메뉴를 만듬
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === 메인 메뉴 === ===");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.println("메뉴 선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}
	// 1. 마지막 위치에 곡 추가
	public void lastSongAdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("마지막 위치에 곡 추가");
		System.out.print("곡명 : ");
		String songName = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		Music music = new Music(songName, singer);
		msList.add(music); //add메소드를 통해서 누적되어 추가된다.
	}
	// 2. 첫 위치에 곡 추가
	public void firstSongAdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 위치에 곡 추가");
		System.out.print("곡명 : ");
		String songName = sc.next();
		System.out.print("가수명 : ");
		String singer = sc.next();
		Music music = new Music(songName, singer);
		msList.add(0, music);
		
	}
	// 3. 전체 곡 목록 출력
	public void printInfo() {
		System.out.println("====== 전체 곡 목록 출력 ======");
		for(int i = 0; i < msList.size(); i++) {
			Music music = msList.get(i);
			System.out.printf("%d번째 노래 -> 곡명 : %s, 가수명 : %s\n"
					, (i+1)
					, music.getsongName()
					, music.getSinger());
		}
	}
	// 4. 특정 곡 검색
	public void printOneBySongName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 입력 : ");
		String songName = sc.nextLine();
		for(Music music : msList) {
			if(music.getsongName().equals(songName)) {
				System.out.printf("검색 결과 >> 곡명 : %s, 가수명 : %s\n"
						, music.getsongName()
						, music.getSinger());
				break;  // 검색한 곡을 찾고 나오게 한다.
			}
		}
	}
	// 5. 특정 곡 삭제
	public void removeMusicBySongName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 곡 입력 : ");
		String songName = sc.nextLine();
		for(int i = 0; i < msList.size(); i++) {
			Music music = msList.get(i);
			if(music.getsongName().equals(songName)) {
				// msList에서 삭제
				msList.remove(i);
				break;  // 검색한 곡을 삭제했으면 나오게 한다.
			}
		}
	}
	// 6. 특정 곡 정보수정
	public void modifyMusicInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 곡 입력 : ");
		String songName = sc.nextLine();
		System.out.print("수정할 정보 입력(곡명) : ");
		String modSongName = sc.nextLine();
		System.out.print("수정할 정보 입력(가수명) : ");
		String modSinger = sc.nextLine();
		Music modMusic = new Music(modSongName, modSinger);
		for(int i = 0; i < msList.size(); i++) {
			Music music = msList.get(i);
			if(music.getsongName().equals(songName)) {
				msList.set(i, modMusic);
			}
		}
	}
}
