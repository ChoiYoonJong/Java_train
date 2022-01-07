package com.kh.dimension.practice;

import java.util.Scanner;

public class DimensionPractice {

	public void practice1() {
		int[][] arr = new int[4][4];
		
		int value = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				//System.out.print(arr[i][j] + " ");
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int[][] arr = new int[4][4];
		
		int value = 16;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value--;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				//System.out.print(arr[i][j] + " ");
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		String[][] arr = new String[3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		int[][] arr = new int[4][4];
		
		
		for(int i=0; i<arr.length-1; i++) {
			
			for(int j=0; j<arr[i].length-1; j++) {
				arr[i][j] = (int)(Math.random() * 10 + 1);
				
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
				
				arr[3][3] += arr[i][j];
				
			}
			
			
		}
		
		for(int i=0; i<arr.length-1; i++) {
		//	arr[3][3] += arr[i][3] + arr[3][i];
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("�� ũ�� : ");
			int row = sc.nextInt();
			System.out.print("�� ũ�� : ");
			int col = sc.nextInt();
			
			if((row >= 1 && row <= 10) && (col >= 1 && col <= 10)){
				char[][] arr = new char[row][col];
				
				for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr[i].length; j++) {
						arr[i][j] = (char)((int)(Math.random() * 26 + 65));
					}
				}
				
				for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr[i].length; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
				
				break;
				
			}else {
				System.out.println("�ٽ��Է��ϼ���.");
			}
			
			
		}
		
	}
	
	public void practice6() {
		String[][] arr = {{"��", "��", "��", "��", "��"}, 
						  {"��", "��", "��", "��", "��"}, 
						  {"��", "��", "��", "��", "��"}, 
						  {"��", "��", "��", "��", "��"},
						  {"��", "��", "!", "��", "!!"}};
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
			
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ũ�� : ");
		int row = sc.nextInt();
		
		char[][] arr = new char[row][];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i + "���� ũ�� : ");
			int col = sc.nextInt();
			
			arr[i] = new char[col];
		}
		
		char value = 'a';
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	public void practice8() {
		String[] students = {"���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����"};
		
		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];
		
		int count = 0;
		
		for(int i=0; i<seat1.length; i++) {
			for(int j=0; j<seat1[i].length; j++) {
				seat1[i][j] = students[count++];
			}
		}
		
		for(int i=0; i<seat2.length; i++) {
			for(int j=0; j<seat2[i].length; j++) {
				seat2[i][j] = students[count++];
			}
		}
		
		System.out.println("== 1�д� ==");
		for(int i=0; i<seat1.length; i++) {
			for(int j=0; j<seat1[i].length; j++) {
				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("== 2�д� ==");
		for(int i=0; i<seat2.length; i++) {
			for(int j=0; j<seat2[i].length; j++) {
				System.out.print(seat2[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}
	
	public void practice9() {
		String[] students = { "���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����" };

		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];

		int count = 0;
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				seat1[i][j] = students[count++];
			}
		}

		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				seat2[i][j] = students[count++];
			}
		}
		System.out.println("== 1�д� ==");
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2�д� ==");
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				System.out.print(seat2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("======================");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�˻��� �л� �̸��� �Է��ϼ���: ");
		String name = sc.nextLine();
		
		String part = ""; 
		int row = 0; 
		String col = "";  
		
		for(int i = 0; i < seat1.length; i++){
			
			for(int j = 0; j < seat1[i].length; j++){
				
				if(seat1[i][j].equals(name)) {
					
					part = "1�д�";
					row = i+1;
					
					if(j == 0){
						col = "����";
					}else{
						col = "������";
					}
				}
			}
		}
		
		for(int i = 0; i < seat2.length; i++){
			
			for (int j = 0; j < seat2[i].length; j++){
				
				if(seat2[i][j].equals(name)){
					
					part = "2�д�";
					row = i+1;
					
					if(j == 0){
						col = "����";
					}else{
						col = "������";
					}
				}
			}
		}
		
		if(part.equals("")) {
			System.out.println("�˻��Ͻ� �л��� �����ϴ�.");
		}else {
			System.out.println("�˻��Ͻ� " + name + " �л��� " + part + " " + row + "��° �� " + col + "�� �ֽ��ϴ�.");			
		}
		
		
	}
	
	
}
