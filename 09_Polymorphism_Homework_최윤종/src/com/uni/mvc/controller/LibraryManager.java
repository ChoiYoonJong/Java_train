package com.uni.mvc.controller;

import com.uni.mvc.model.vo.AniBook;
import com.uni.mvc.model.vo.Book;
import com.uni.mvc.model.vo.CookBook;
import com.uni.mvc.model.vo.Member;

public class LibraryManager {
	private Member mem = null; //null로 명시 초기화
	Book[] bList = new Book[5]; //도서 목록 5개

	{ // 초기화 블록을 이용하여 샘플 데이터 초기화
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}

	public Member memberInfo() {
		return mem;
	}

	public Book[] selectAll() {
		return bList;
	}
	

	public Book[] searchBook(String keyword) {
		Book[] search = new Book[5];//도서 목록 5개
		int count = 0;
		for (int i = 0; i < bList.length; i++) {
			if (bList[i].getTitle().contains(keyword)) {
				search[count++] = bList[i];
			}
		}
		return search;
	}

	int count = 0;
	public int rentBook(int index) {
		int result = 0;
		
		if (bList[index] instanceof AniBook) {
			int age = ((AniBook) bList[index]).getAccessAge();
			if (mem.getAge() <= age) {
				return result = 1;
			}
		} else if (bList[index] instanceof CookBook) {
			if (((CookBook) bList[index]).isCoupon()) {
				mem.setCouponCount(++count);
				return result = 2;
			} else {
				return result = 0;
			}
		}
		return result;
	}
}
	
	
	
