package com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		/*
		int num = ch;
		System.out.println(ch + " unicode : " + num);*/
		
		System.out.println(ch + " unicode : " + (int)ch);
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수학 : ");	
		double math = sc.nextDouble();
		
		int sum = (int)(kor + eng + math);
		int avg = sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}
	
	public void method3() {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2); 
		System.out.println((int)dNum); 
		
		System.out.println((double)iNum1);
		System.out.println(iNum2 * dNum); 

		System.out.println(dNum); 
		System.out.println((double)iNum1/iNum2); 
		
		System.out.println((int)fNum); 
		System.out.println(iNum1/(int)fNum);
		
		System.out.println(iNum1/fNum); 
		System.out.println(iNum1/(double)fNum); 
		System.out.println(ch); 
		System.out.println((int)ch); 
		System.out.println(ch + iNum1); 
		System.out.println((char)(ch + iNum1)); 
	}

}
