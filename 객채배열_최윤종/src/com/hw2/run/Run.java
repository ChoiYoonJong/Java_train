package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student[] std = new Student[10];
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(true) {
			std[count] = new Student();
			System.out.println("학년 : ");
			std[count].setGrade(sc.nextInt());
			System.out.println("반 : ");
			std[count].setClassroom(sc.nextInt());
			sc.nextLine();
			System.out.println("이름 : ");
			std[count].setName(sc.nextLine());
			System.out.println("국어점수 :" );
			std[count].setKor(sc.nextInt());
			System.out.println("영어점수 : ");
			std[count].setEng(sc.nextInt());
			System.out.println("수학점수 : ");
			std[count].setMath(sc.nextInt());
			sc.nextLine();
			count++;
			System.out.println("계속 추가하시겠습니까?(y/n) : ");
			char a = sc.nextLine().charAt(0);
			if (a == 'n') break;
		}
		for(int i = 0; i < count ; i++) {
			System.out.println(std[i].information());
		}
		for(int i = 0; i < count; i++) {
			int sum = std[i].getKor() + std[i].getEng() + std[i].getMath();
			System.out.println(std[i].getName() + " 학생의 평균 점수 : " + sum / 3);
		}
	}
}
