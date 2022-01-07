package com.uni.hw3.view;

import java.util.Scanner;

import com.uni.hw3.model.vo.Employee;

public class EmpMenu {
	private Scanner sc =new Scanner(System.in);
	
	public EmpMenu() {}
	
	public void mainMenu() {
		
		Employee emp = null;
		while(true) {
			System.out.println("==== 사원 정보 관리 프로그램 ====");
			System.out.println("1. 새 사원 정보 입력"); 
			System.out.println("2. 사원 정보 수정"); 
			System.out.println("3. 사원 정보 삭제"); 
			System.out.println("4. 사원 정보 출력"); 
			System.out.println("9. 프로그램 종료"); 
			System.out.println("메뉴 번호 선택 : "); 
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				emp = inputEmployee();
				break;
			case 2:
				modifyEmployee(emp);
				break;
			case 3:
				emp = null;
				break;
			case 4:
				System.out.println(emp.information());
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
	
	public Employee inputEmployee() {
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("부서 : ");
		String dept = sc.nextLine();
		System.out.println("직급 : ");
		String job = sc.nextLine();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별(F/M) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.println("급여 : ");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.println("보너스포인트 : ");
		double bonusPoint = sc.nextDouble();
		sc.nextLine();
		System.out.println("전화번호(-포함) : ");
		String phone = sc.nextLine();
		System.out.println("주소 : ");
		String address = sc.nextLine();
		Employee emp = new Employee(name, dept, job, gender, salary, bonusPoint, phone, address);
		
		return emp;
	}
	
	public void modifyEmployee(Employee emp) {
		
		while(true) {
		System.out.println("==== 사원 정보 수정 메뉴 ====");
		System.out.println("1. 이름 변경");
		System.out.println("2. 급여 변경");
		System.out.println("3. 부서 변경");
		System.out.println("4. 직급 변경");
		System.out.println("9. 이전 메뉴로");
		int menu = sc.nextInt(); 
		sc.nextLine();
		
		switch(menu) {
		case 1 :
			System.out.println("변경할 이름 : ");
			String name = sc.nextLine();
			emp.setEmpNAme(name);
			break;
		case 2 :
			System.out.println("변경할 급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			emp.setSalary(salary);
			break;
		case 3 :
			System.out.println("변경할 부서 : ");
			String dapt = sc.nextLine();
			emp.setDept(dapt);
			break;
		case 4 :
			System.out.println("변경할 직급 : ");
			String job = sc.nextLine();
			emp.setJob(job);
			break;
		case 9 :
			return;
		}
		}
	}
}
