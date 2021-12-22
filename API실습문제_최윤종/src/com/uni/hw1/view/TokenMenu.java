package com.uni.hw1.view;

import java.util.Scanner;

import com.uni.hw1.controller.TokenController;

public class TokenMenu {
	
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			
			System.out.println("메뉴 번호 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : 
				tokenMenu();
				break;
			case 2 : 
				inputMenu();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
		
	}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m";
		
		
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		
		
		String nStr = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : " + nStr);
		System.out.println("토큰 처리 후 개수 : " + nStr.length());
		System.out.println("모두 대문자로 변환 : " + nStr.toUpperCase());
		
		
	}
	
	public void inputMenu() {
		System.out.println("문자열을 입력하세요 : ");
		String wordww = sc.nextLine();

		String wk = tc.firstCap(wordww);
		System.out.println("첫 글자 대문자 : " + wk);
		
		System.out.println("찾을 문자 하나를 입력하세요 : ");
		char a = sc.nextLine().charAt(0);
		
		int c = tc.findChar(wordww, a);
		System.out.println(a + "문자가 들어간 개수 : " + c);
		
	}
	

}
