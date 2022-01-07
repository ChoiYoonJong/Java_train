package mvc.view;

import java.util.Scanner;

import mvc.controller.MemberController;

//mvc 패턴 중 view 패키지 : 사용자가 보게될 화면을 담당하는 부분
//따라서 사용자가 보게되는 출력문 (print구문)은 반드시 view 패키지 안에만 작성!! 그외는 놉!
//뿐만아니라 사용자가 키보드로 입력하는 부분(scanner사용)도 view 패키지 안에만 작성!! 그외는 놉!
public class MemberView {

	// 화면이기 때문에 사용자가 키보드로 값을 입력할수 있도록 Scanner객체생성
	private Scanner sc = new Scanner(System.in);
	// 화면에서 사용자가 요청 처리를 할 때마다 controller의 메소드를 실행할거기 때문에 memberController 객체 생성
	private MemberController mc = new MemberController();
	

	public MemberView() {

	}

	// 프로그램 실행과 동시에 보여질 화면
	public void mainMenu() {
		// 1_1. 로그인을 위해 아이디와 비밀번호를 입력받는다.  
		System.out.print("아이디를 입력하시오 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력하시오 : ");
		String pwd = sc.nextLine();

		// 1_2. 사용자가 입력한 아이디와 비밀번호를 controller로 보내서 처리한 후 결과값을 받는다.
		int result = mc.login(id, pwd); // 사용자가 입력한 아이디와 비밀번호 controller에 전달

		// 1_2_1. 결과 값이 1인 경우 즉, 로그인에 성공한 경우
		if (result == 1) {
			System.out.println("축 로그인!!!");
			while (true) {
				System.out.println("===== 메뉴 출력 =====");
				System.out.println("1. 내 정보 보기");
				System.out.println("2. 내 나이 조회");
				System.out.println("3. 키 수정하기");
				System.out.println("9. 종료하기");
				System.out.print("메뉴 선택 : ");
				int num = sc.nextInt();

				switch (num) {
				case 1:
					System.out.println(mc.readInfo().information());
					break;
				case 2:
					System.out.println(mc.readAge());
					break;
				case 3:
					updateHeight();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("메뉴를 다시 선택해주세요.");
					break;
				}
			}
		}else { // 1_2_2. 아닐 경우 즉, 로그인에 실패한경우 
			System.out.println("아이디와 비밀번호가 틀렸습니다.");
			System.out.println("프로그램을 종료합니다. 빠이");
		}
	}

	public void updateHeight() {
		System.out.print("수정 할 키 입력 : ");
		double height = sc.nextDouble();

		mc.updateHeight(height);
	}

}

