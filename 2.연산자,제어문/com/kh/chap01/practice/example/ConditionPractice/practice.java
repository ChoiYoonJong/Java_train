package com.kh.chap01.practice.example.ConditionPractice;

import java.util.Scanner;

public class practice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("메뉴 번호를 입력하세요:");
		System.out.println("조회 메뉴입니다.");

		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println(" 1.입력 ");
			break;
		case 2:
			System.out.println("2.수정");
			break;
		case 3:
			System.out.println("3.조회");
			break;
		case 4:
			System.out.println("4.삭제");
			break;
		case 9:
			System.out.println("9.종료 " + "프로그램이 종료됩니다.");
			break;

		}

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 한 개 입력하세요. : ");

		int num = sc.nextInt();

		if (num > 0 && num % 2 == 0) {
			System.out.println("짝수다");
		} else if (num > 0 && num % 2 == 1) {
			System.out.println("홀수다");

		} else {
			System.out.println("양수만 입력해주세요.");
		}

	}

	public void practice3() {

		
		Scanner sc = new Scanner(System.in);

		int k = 0, m = 0, e = 0;
		double sum = 0, ave = 0;

		System.out.print("국어점수 : ");
		k = sc.nextInt();

		System.out.print("수학점수 : ");
		m = sc.nextInt();

		System.out.print("영어점수 : ");
		e = sc.nextInt();

		sum = k + m + e;
		ave = sum / 3;

		if (k >= 40 && m >= 40 && e >= 40 && ave >= 60) {
			System.out.println("국어점수 : " + k);
			System.out.println("수학점수 : " + m);
			System.out.println("영어점수 : " + e);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + ave);
			System.out.println("축하합니다. 합격입니다.");
		} else {
			System.out.println("불합격입니다. ");
		}

	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		int month = 0;
		String season = "";
		System.out.println("1~12 사이의 정수 입력 : ");
		month = sc.nextInt();

		switch (month) {
		case 1:
		case 2:
		case 12:
			season = "겨울";
			break;

		case 3:
		case 4:
		case 5:
			season = "봄";
			break;

		case 6:
		case 7:
		case 8:
			season = "여름";
			break;

		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		default:
			System.out.println(month + "월은 잘못 입력된 달입니다. : ");
			return;
		}

		System.out.println(month + "월 " + season + "입니다.");

	}

	public void practice5() {
		
		Scanner sc = new Scanner(System.in);

		String id = "", pw = "";
		System.out.println("아이디 : ");
		id = sc.nextLine();
		
		System.out.println("비밀번호:");
		pw = sc.nextLine();

		if (id.equals("user") && pw.equals("1234")) {

			System.out.println("로그인 성공 ");
		} else if (!(id.equals("user")) && pw.equals("1234")) {
			System.out.println("아이디가 틀렸습니다. ");
		} else if (id.equals("user") && !(pw.equals("1234"))) {
			System.out.println("비밀번호가 틀렸습니다. ");
		} else if (!(id.equals("user")) && !pw.equals("1234")) {
			System.out.println("등록되지 않은 아이디 와 비밀번호입니다.");
		}
	}

	public void practice6() {

		
		Scanner sc = new Scanner(System.in);
		String a = "";
		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
		a = sc.nextLine();
		
		switch(a) {
		case "관리자":
			System.out.printf("회원관리,게시글 관리\n게시글작성,댓글작성\n게시글 조회\n");
				break;		
		case "회원":
			System.out.printf("게시글작성,댓글작성\n게시글 조회\n");
			break;
		case "비회원":
			System.out.printf("게시글 조회\n");
			
			break;
			default:
				System.out.printf("잘못 입력했습니다.");
				
		}
	
		 

			
		}
		
		
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);

		double t=0.0,weight=0.0,bmi=0.0;
		System.out.println("키(m)를 입력해 주세요 : ");
		t = sc.nextDouble();
		System.out.println("몸무게(kg)을 입력해 주세요 : ");
		 weight = sc.nextDouble();
		
	   bmi = weight/(t*t);
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		}else if(bmi <23) {
			System.out.println("정상체중");
		}else if(bmi <25) {
			System.out.println("과체중");
		}else if(bmi <30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		
		
		}	
	}
		
		
  public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.println("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		System.out.println("연산자를 입력(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);
		
		int result = 0;
		
		switch (op) {
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1-num2;
			break;
		case '*':
			result = num1*num2;
			break;
		case '/':
			result = num1/num2;
			break;			
		case '%':
			result = num1%num2;
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		if (num1 <=0 || num2 <= 0) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		} else {
			System.out.printf("%d %c %d = %d", num1, op, num2, result);
		}
	}	
		
	public void practice9() {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("중간고사 점수 : ");
		double num1=sc.nextDouble();
		
		System.out.println("기말고사 점수 : ");
		double num2=sc.nextDouble();
		
		System.out.println("과제점수 : ");
		double num3=sc.nextDouble();
		
		System.out.println("출석회수: ");
		double num4=sc.nextDouble();
		
		double score1=num1*0.2;
		double score2=num2*0.3;
		double score3=num3*0.3;
		double score4=((num4/20)*100)*0.2;
		
		double sum=score1+score2+score3+score4;
		
		System.out.println("=======결과========");
		System.out.println("중간 고사 점수 (20) : " + num1);
		System.out.println("기말 고사 점수 (30) : " + num2);
		System.out.println("과제 점수    (30) : " + num3);
		System.out.println("출석 점수    (20) : " + num4);
		
		if(sum>=70&&num4>=14) {
		
			System.out.println("총점 : " + sum);
			System.out.println("PASS");
		}else if(sum >= 70 && num4 <14) {
			System.out.println("Fail [출석 횟수 부족] (" + (int) num4 + "/20)");
		}else if(sum <70 && num4 >=14) {
			System.out.println("Fail [점수미달] (총점 " + sum + ")");
		}else {
			System.out.println("Fail [출석 횟수 부족] (" + (int) num4 + "/20)");
			System.out.println("Fail [점수미달] (총점 " + sum + ")");
		
		
		
		System.out.println("총점 : ");
		double num5=sc.nextDouble();
		
		
		
		
		}
		
		
		
		}
	public void practice10() {
Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		System.out.println("선택 : ");
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			practice1();
			break;
			
		case 2:
			practice2();
			break;	
			
		case 3:
			practice3();
			break;	
			
		case 4:
			practice4();
			break;	
			
		case 5:
			practice5();
			break;	
		
		case 6:
			practice6();
			break;	
			
		case 7:
			practice7();
			break;
			
		case 8:
			practice8();
			break;
			
		case 9:
			practice9();
			break;
		
			
		}	
	}
		
}