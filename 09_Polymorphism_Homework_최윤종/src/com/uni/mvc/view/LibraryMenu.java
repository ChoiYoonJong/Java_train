package com.uni.mvc.view;

import java.util.Scanner;

import com.uni.mvc.controller.LibraryManager;
import com.uni.mvc.model.vo.AniBook;
import com.uni.mvc.model.vo.Book;
import com.uni.mvc.model.vo.CookBook;
import com.uni.mvc.model.vo.Member;

public class LibraryMenu {
	private Scanner sc = new Scanner(System.in);
	private LibraryManager lm = new LibraryManager();
	
	public void mainMenu() {
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		Member mem = new Member(name, age, gender);
		lm.insertMember(mem);
		
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지 ");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 ");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료하기");
			System.out.println("메뉴 번호를 입력해주세요 :");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 :
				System.out.println(lm.memberInfo());
				break;
			case 2 :
				selectAll();
				break;
			case 3 :
				searchBook();
				break;
			case 4 :
				rentBook();
				break;
			case 0 :
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}


	public void selectAll() {
		Book[] bList = lm.selectAll();
		
		for(int i = 0; i < bList.length; i++) {
			System.out.println(i+"번도서 : "+bList[i]);
		}
	}
	
	public void searchBook() {
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		Book[] list = lm.searchBook(keyword);
		
		for(Book b : list) {
			if(b == null) {
				break;
			} else {
				if(b instanceof AniBook) {
					System.out.println(((AniBook)b).toString());
				} else if(b instanceof CookBook) {
					System.out.println(((CookBook)b).toString());
				}
			}
		}
	}
	
	public void rentBook() {
		selectAll();
		System.out.println("대여할 도서 번호 선택 : ");
		int num = sc.nextInt();
		
		int result = lm.rentBook(num);
		
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		} else if(result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		} else {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요");

		}
		
	}
	
}
