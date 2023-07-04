package com.kh.day07.oop.member;

public class Member {
	// 입력받을거 4개 정도 만들고
	// 캡슐화의 원칙 적용해서 구성
	private String memberId;
	private String memberPw;
	private String memberEmail;
	private String memberAddress;
	
	public Member() {} // 생성자 : 객체를 초기화하는 역할을 한다.
	// 오버로딩 : 메소드에 이름이 같고 개수와 타입이 다르다.
	public Member(String memberId, String memberPw, String memberEmail, String memberAddress) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
	}
	
	// getter 메소드 // 필드가 가지고 있는 값을 가지고 올 수 있게 해준다.(return값을 줘야함)
	public String getMemberId() {
		return this.memberId;
	}
	public String getMemberPw() {
		return this.memberPw;
	}
	public String getMemberEmail() {
		return this.memberEmail;
	}
	public String getMemberAddress() {
		return this.memberAddress;
	}
	// setter 메소드 // 전달값을 받아서 메소드 안에서 쓸 수 있게 해주는게 매개변수이다.
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	
}
