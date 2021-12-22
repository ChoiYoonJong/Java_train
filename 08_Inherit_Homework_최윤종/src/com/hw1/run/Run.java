package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student[] p = new Student[3];
		
		
		p[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		p[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		p[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		
		for(int i = 0; i < p.length; i++) {
			System.out.println(p[i].information());
		}
		
		
		Employee[] e = new Employee[10];
		int count = 0; 
		Scanner sc = new Scanner(System.in);

		
		while(true) {
			
			
			
			System.out.println("이름을 입력하세요 :");
			String name = sc.nextLine();
			
			System.out.println("나이를 입력하세요 :");
			int age = sc.nextInt();
			
			System.out.println("키를 입력하세요(cm)");
			double height = sc.nextDouble();
			
			System.out.println("몸무게를 입력하세요(kg) :");
			double weight = sc.nextDouble();
			
			System.out.println("급여를 입력하세요 :");
			int salary = sc.nextInt();
			sc.nextLine();
			
			System.out.println("부서를 입력하세요 :");
			String dept = sc.nextLine();
			
			e[count++] = new Employee(name, age, height, weight, salary, dept);
			
			System.out.println("계속 추가하시겠습니까?(y/n)");
			char num = sc.nextLine().charAt(0);
			if(num == 'Y' ||num == 'y') {
				continue;
			}else  if(num == 'N' || num == 'n'){
			
				break;
				
			}else {
				break;
				
			}	
		}
		
		for(int i= 0; i < count ; i++) {
			System.out.println("============ 직원정보 ==============");
			System.out.println(e[i].information());
	}
	}

}