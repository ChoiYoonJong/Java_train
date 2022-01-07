package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {
public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		System.out.println((num > 0) ? "양수다" : "양수가 아니다");
	
}

public void practice2() {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("정수: ");
	int num = sc.nextInt();
	
	System.out.println((num > 0) ? "양수다" : (num == 0) ? "0이다" : "음수다");
}

public void practice3() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("정수 입력 : ");
	int num = sc.nextInt();
	
	System.out.println(num % 2 == 0 ? "짝수다" : "홀수다");
}

public void practice4() {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("인원 수 : ");
	int m = sc.nextInt();

	System.out.println("사탕 개수 : ");
	int candy = sc.nextInt();
	
	System.out.println("1인당 사탕 개수 : " + candy / m);
	System.out.println("남는 사탕 개수 : " + candy % m);
}

public void practice5() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("이름");
	String name = sc.nextLine();
	
	System.out.println("학년(숫자만)");
	int grade = sc.nextInt();
	
	System.out.println("반(숫자만)");
	int classNum = sc.nextInt();
	
	System.out.println("번호(숫자만)");
	int num = sc.nextInt();
	sc.nextLine();
	
	System.out.println("성별(M/F)");
	char gender = sc.nextLine().charAt(0);
	
	System.out.println("성적(소수점 둘째 자리까지)");
	double score = sc.nextDouble();
	
	String student = "";
	student = (gender == 'M' ? "남학생" : "여학생");
	
	System.out.println(grade + "학년 " + classNum + "반 " + num + "번 " + name + " " + student + "의 성적은 " + score + "입니다.");
}

public void practice6() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("나이 입력");
	int age = sc.nextInt();
	
	System.out.println(age <=13 ? "어린이" :age <=19 ? "청소년" : "성인");
}

public void practice7() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("국어 : ");
	int k = sc.nextInt();
	
	System.out.println("영어 : ");
	int e = sc.nextInt();
	
	System.out.println("수학 : ");
	int m = sc.nextInt();
	
	int total = k + e  + m;
	double ave = total/3.0;
	
	System.out.println("합계 : " + total);
	System.out.println("평균 : " + ave);
	
	System.out.println((k >= 40 && e>= 40 && m >= 40 && ave >= 60 ? "합격" : "불합격"));
}

public void practice8() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("주민번호를 입력하세요(- 포함) : ");
	char gender = sc.nextLine().charAt(7);
	
	System.out.println(gender == '1' || gender == '2' ? "남자" : "여자");
}

public void practice9() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("정수1 : ");
	int num1 = sc.nextInt();

	System.out.println("정수2 : ");
	int num2 = sc.nextInt();

	System.out.println("입력 : ");
	int enter = sc.nextInt();
	
	System.out.println( enter <= num1 || enter > num2 ? "true" : "false");
}

public void practice10() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("정수1 : ");
	int num1 = sc.nextInt();

	System.out.println("정수2 : ");
	int num2 = sc.nextInt();

	System.out.println("정수3 : ");
	int num3 = sc.nextInt();
	
	System.out.println(num1 == num2 && num2 == num3 ? "true" : "false");
}

public void practice11() {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("A사원의 연봉 : ");
	double num1 = sc.nextInt();
	num1 *= 1.4;

	System.out.println("B사원의 연봉 : ");
	double num2 = sc.nextInt();

	System.out.println("C사원의 연봉 : ");
	double num3 = sc.nextInt();
	num3 *= 1.15;
	
	System.out.println("A사원의 인센티브 포함 연봉 : " + num1);
	System.out.println(num1 >= 3000 ? "3000 이상" : "3000 미만");
	System.out.println("B사원의 인센티브 포함 연봉 : " + num2);
	System.out.println(num2 >= 3000 ? "3000 이상" : "3000 미만");
	System.out.println("C사원의 인센티브 포함 연봉 : " + num3);
	System.out.println(num3 >= 3000 ? "3000 이상" : "3000 미만");
}

}