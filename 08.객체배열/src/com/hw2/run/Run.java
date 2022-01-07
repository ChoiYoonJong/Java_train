package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student stu[] = new Student[10];
		
		int count = 0; 
		
		while(true) {
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			System.out.print("반 : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			
			stu[count++] = new Student(grade, classroom, name, kor, eng, math);
			
			
			System.out.print("계속 추가 하시겠습니까? (Y/N) : ");
			String str = sc.nextLine().toUpperCase();
			
			if(str.equals("N")) {
				break;
			}
		}
		
		

		for(int i=0; i<count; i++) { 
			
		
			int sum = stu[i].getKor() + stu[i].getMath() + stu[i].getEng();
			
			System.out.println(stu[i].information() + ", 평균 = " + sum / 3);
			
		}
		
	}

}
