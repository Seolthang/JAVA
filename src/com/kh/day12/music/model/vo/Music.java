package com.kh.day12.music.model.vo;

public class Music {
	// 필드
	// 캡슐화 원칙
	private String title;
	private String singer;
	
	// 생성자, getter/setter, toString(), ... 자동완성 가능
	public Music() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	
	
}
