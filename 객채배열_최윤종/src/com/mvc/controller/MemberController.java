package com.mvc.controller;

import com.mvc.model.vo.Member;

public class MemberController {
	public static final int Size = 10;
	private Member[] mem = new Member[Size];
	private int memberCount;
	{
		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
		memberCount = 5;
	}
	public int getMemberCount() {
		return memberCount;
	}
	public Member[] getMem() {
		return mem;
	}
	public Member checkId(String userId) {
		Member m = null;
		for(int i = 0; i < memberCount; i++) {
			if(mem[i].getUserId().equals(userId)) return mem[i];
		}
		return null;
	}
	public void insertMember(Member m) {
		mem[memberCount++] = m;
	}
	public Member searchMember(int menu, String search) {
		if(menu == 1) {
			for(int i = 0; i < memberCount; i++) {
				if(mem[i].getUserId().equals(search)) return mem[i];
			}
		}else if(menu == 2) {
			for(int i = 0; i < memberCount; i++) {
				if(mem[i].getName().equals(search)) return mem[i];
			}
		}else {
			for(int i = 0; i < memberCount; i++) {
				if(mem[i].getEmail().equals(search)) return mem[i];
			}
		}
		return null;
	}
	public void updateMember(Member m, int menu, String update) {
		if(menu == 1) {
			m.setUserPwd(update);
		}else if(menu == 2) {
			m.setName(update);
		}else {
			m.setEmail(update);
		}
	}
	public void deleteMember(String userId) {
		for(int i = 0; i < memberCount; i++) {
			if(mem[i].getUserId().equals(userId)) {
				for(int j = i+1; j <memberCount; j++) {
					mem[j-1] = mem[j];
				}
				break;
			}
		}
		mem[memberCount -1] = null;
		memberCount--;
	}
	public Member[] sortIdAsc() {
		Member [] copy = mem.clone();
		for(int i = 0; i < memberCount - 1; i++) {
			for(int j = 0; j < memberCount - 1 - i; j++) {
				if(copy[j].getUserId().compareTo(copy[j+1].getUserId()) > 0) {
					Member tmp = copy[j];
					copy[j] = copy[j+1];
					copy[j+1] = tmp;
				}
			}
		}
		return copy;
	}
	public Member[] sortIdDesc() {
		Member [] copy = mem.clone();
		for(int i = 0; i < memberCount - 1; i++) {
			for(int j = 0; j < memberCount - 1 - i; j++) {
				if(copy[j].getUserId().compareTo(copy[j+1].getUserId()) < 0) {
					Member tmp = copy[j];
					copy[j] = copy[j+1];
					copy[j+1] = tmp;
				}
			}
		}
		return copy;
	}
	public Member[] sortAgeAsc() {
		Member [] copy = mem.clone();
		for(int i = 0; i < memberCount - 1; i++) {
			for(int j = 0; j < memberCount - 1 - i; j++) {
				if(copy[j].getAge() - copy[j+1].getAge() > 0) {
					Member tmp = copy[j];
					copy[j] = copy[j+1];
					copy[j+1] = tmp;
				}
			}
		}
		return copy;
	}
	public Member[] sortAgeDesc() {
		Member [] copy = mem.clone();
		for(int i = 0; i < memberCount - 1; i++) {
			for(int j = 0; j < memberCount - 1 - i; j++) {
				if(copy[j].getAge() - copy[j+1].getAge() < 0) {
					Member tmp = copy[j];
					copy[j] = copy[j+1];
					copy[j+1] = tmp;
				}
			}
		}
		return copy;
	}
	public Member[] sortGenderDesc() {
		Member [] copy = mem.clone();
		for(int i = 0; i < memberCount - 1; i++) {
			for(int j = 0; j < memberCount - 1 - i; j++) {
				if(copy[j].getGender() - copy[j+1].getGender() < 0) {
					Member tmp = copy[j];
					copy[j] = copy[j+1];
					copy[j+1] = tmp;
				}
			}
		}
		return copy;
	}
}
