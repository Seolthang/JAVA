package com.kh.day18.member.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.kh.day18.member.model.vo.Member;

public class MemberDAO {

	private List<Member> mList;
	
	public MemberDAO() {
		mList = new ArrayList<Member>();
	}

	/**
	 * 이름으로 인덱스 찾기
	 * 
	 * @param name String으로 입력받은 값
	 * @return int값 없으면 -1
	 */
	public int findIndexByName(String name) {
		for (int i = 0; i < mList.size(); i++) {
			if (mList.get(i).getMemberName().equals(name)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * 이름으로 회원정보 찾기
	 * 
	 * @param name String으로 입력받은 값
	 * @return Member 객체 리턴, 없으면 null 리턴
	 */
	public Member findOneByName(String name) {
		for (int i = 0; i < mList.size(); i++) {
			if (mList.get(i).getMemberName().equals(name)) {
				return mList.get(i);
			}
		}
		return null;
	}

	public List<Member> allMemberList() {
		return mList;
	}

	/**
	 * 회원 정보 등록
	 * 
	 * @param member
	 * @return
	 */

	public void addMember(Member member) {
		mList.add(member);
	}
	/*
	 * 회원 정보 삭제
	 * 
	 */

	public void modifyMember(int index, Member mOne) {
		mList.set(index, mOne);
	}

	public void subMember(int index) {
		mList.remove(index);
	}
}
