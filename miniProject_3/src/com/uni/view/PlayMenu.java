package com.uni.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.uni.controller.BookTicketManager;
import com.uni.controller.ConManager;
import com.uni.controller.WorldController;

public class PlayMenu {

	Scanner sc = new Scanner(System.in);
	
	BookTicketManager btm = new BookTicketManager();
	UtilMenu ut = new UtilMenu();
	ConManager cm = new ConManager();
	ReviewMenu rm = new ReviewMenu();
	GuideAmuseMenu gm = new GuideAmuseMenu();
	
	//편의시설 관리 메뉴
	ConMenu cMenu = new ConMenu();
	
	//로그인 확인
	WorldController wc = new WorldController();
	

	public PlayMenu() {

	}

	public void mainMenu() {
		
		while (true) {
			
			try {

				System.out.println("*** Hello Java World! ***");
				System.out.println("1. 이용권 예매");
				System.out.println("2. 놀이기구 이용");
				System.out.println("3. 편의시설 안내");
				System.out.println("4. 놀이기구 이용후기");
				System.out.println("5. 셔틀버스 이용");
				System.out.println("6. 관리자 페이지");
				System.out.println("0. 프로그램 종료");
				System.out.println("메뉴 번호 선택 : ");
				int menu = sc.nextInt();
				sc.nextLine();
	
				switch (menu) {
				case 1:
					btm.bookTicket();
					break;
				case 2:
					ut.util();
					break;
				case 3:
					cm.conInfo();
					break;
				case 4:
					rm.mainMenu();
					break;
				case 5:
					break;
				case 6:
					managerMenu();
					break;
				case 0:
					System.out.println("프로그램 종료");
					System.exit(0);
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
					break;
	
				}
				
			//InputMismatchException 정수로 입력해야 되는데 문자 입력하면 예외 발생
			} catch(InputMismatchException e) {
				
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				System.out.println();
				sc.nextLine();
				continue;
				

			}
		}
		
		
	}

	
	
	// 관리자 메뉴
	public void managerMenu() {

		// System.exit(0); //프로그램 강제 종료 시키기
		// 아이디, 패스워드 입력 받아 일치해야 넘어가도록
		System.out.println();
		System.out.println("*** 관리자 전용 로그인 ***");
		System.out.println("아이디를 입력하세요 : ");
		String id = sc.nextLine();

		System.out.println("비밀번호를 입력하세요 : ");
		String pwd = sc.nextLine();

		// 아이디, 패스워드 Manager의 login으로 전달
		boolean result = wc.login(id, pwd);
		

		// 일치하는 경우

		if(result == true) {
		
			while (true) {
			
				try {
					
					System.out.println();
					System.out.println("*** 관리자 메뉴 ***");
					System.out.println("1. 셔틀버스 시간표 관리");
					System.out.println("2. 놀이기구 이용제한 관리");
					System.out.println("3. 편의시설 관리");
					System.out.println("4. 이용 후기 관리");
					System.out.println("9. 이전 메뉴");
					System.out.println("0. 프로그램 종료");
					System.out.println("메뉴 번호 선택 : ");
					int menu = sc.nextInt();
					sc.nextLine();
		
					switch (menu) {
					case 1:
						break;
					case 2:
						//gm.mainMenu();
						break;
					case 3:
						cMenu.conMenu();
						break;
					case 4:
						rm.mainMenu();
						break;
					case 9:
						System.out.println("이전 메뉴로 이동합니다.");
						mainMenu();
						break;
					case 0:
						System.out.println("프로그램 종료");
						System.exit(0);
					default:
						System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
						break;
		
					}
				
				//InputMismatchException 정수로 입력해야 되는데 문자 입력하면 예외 발생
				} catch(InputMismatchException e) {
					
					System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
					sc.nextLine(); //이전 입력 받은 내용 기록되어서
					continue;
				}
		

			}
		}
		// 둘 중 하나라도 일치하지 않으면 메인메뉴로 돌아가기
		System.out.println("아이디 또는 비밀번호가 일치하지 않아 메뉴로 돌아갑니다.");
		System.out.println();
		mainMenu();

	}
	
	
	
	
	
}
