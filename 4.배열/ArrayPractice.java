package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) { 
			arr[i] = i+1; 
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice2() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr.length - i;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice4() {
		String[] arr = new String[5];
		
		
		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";
		
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.println("문자 : ");
		char ch = sc.nextLine().charAt(0);
		char[] arr = new char[str.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		
		
		int count = 0; 	
		System.out.print(str + "에 " + ch + " 가 존재하는 위치(인덱스) : ");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ch) { 
				System.out.print(i + " ");
				
				count++;	
			}
		}
		
		System.out.println();	
		
		System.out.println(ch + "개수 : " + count);
		
		
		
	}
	
	public void practice6() {
		
		String[] arr = {"월", "화", "수", "목", "금", "토", "일"};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num >= 0 && num <= 6) {
			
			System.out.println(arr[num] + "요일");
			
		}else {
			System.out.println("잘못 입력하셨습니다");
		}
	}
	
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("총 합 : " + sum);
		
		
	}
	
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num >= 3 && num % 2 == 1) { 
				
				int[] arr = new int[num];
				
				
				int count = 1;
				
				for(int i=0; i<arr.length; i++) {

					arr[i] = count;
					
					if(i < arr.length / 2) { 
						count++; 
					}else 
						count--; 
					}
				}
				for(int i=0; i<arr.length; i++) {
					
					if(i < arr.length-1) {
						System.out.print(arr[i] + ", ");
					}else {
						System.out.println(arr[i]);
					}
				}
				
				break; 
				
			}else { 
				System.out.println("다시 입력하세요.");
			}
		}
		
		
	}
	
	public void practice9() {
		String[] chickens = {"후라이드", "양념"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.nextLine();
		
		
		boolean flag = false; 
		
		for(int i=0; i<chickens.length; i++) {
			
			if(chickens[i].equals(menu)) { 
				flag = true; 
				break;       
			}
		}
		
		if(flag) { 
			System.out.println(menu + "치킨 배달 가능");
		}else {
			System.out.println(menu + "치킨은 없는 메뉴입니다.");
		}
	}
	
	public void practice10() {
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice11() {
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(); 
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("최대값 : " + arr[9]);
		System.out.println("최소값 : " + arr[0]);
				
	}
	
	public void practice12() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		
		
		char[] origin = new char[str.length()];
		
		for(int i=0; i<origin.length; i++) {
			origin[i] = str.charAt(i);
		}
		
		
		char[] copy = new char[origin.length];
		
		for(int i=0; i<copy.length; i++) {
			
			if(i <= 7) { 
				copy[i] = origin[i]; 
			}else { 
				copy[i] = '*';
			}
			System.out.print(copy[i]);
		}
		
		
	}
	
	
	public void practice14() {
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}

		for(int i=0; i<lotto.length; i++) { 
			for(int j=i+1; j<lotto.length; j++) { 
				if(lotto[i] > lotto[j]) {
					
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
