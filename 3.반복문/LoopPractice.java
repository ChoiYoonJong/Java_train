package com.kh.chap02.practice;

public class GroupPractice {
	
	
	public void teacher_1() {
		
		for(int i=-4; i<=4; i++) {		 
			
			int k = i < 0 ? -i : i;		
			
			for(int j=k; j>0; j--) {	
				System.out.print(" ");
			}
			
			for(int j=1; j<=9-2*k; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		
	}
	
	public void teacher_2() {
		
		for(int i=-2; i<=2; i++) {		
			
			int k = i < 0 ? -i : i;		
			
			for(int j=k; j>0; j--) {	
				System.out.print(" ");
			}
			
			for(int j=1; j<=5-2*k; j++) { 
				
				if(j==1 || j==5-2*k) {		
					System.out.print("*");
				}else {						
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	public void teacher_3() {
		
		for(int i=1; i<=5; i++) {		
			
			for(int j=1; j<=10; j++) {	
				
				if(i==1 || i==5) {			
					System.out.print("*");	
					
				}else {						
					if(j==1 || j==10) {		
						System.out.print("*");
					}else {					
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}


public class LoopPractice {
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int user = sc.nextInt();

		if (user >= 1) { 	
			
			for (int i = 1; i <= user; i++) {
				System.out.print(i + " ");
			}
			
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			
		}
	}

	public void practice5() {
		
		Scanner sc = new Scanner(System.in);

		
		while (true) {
			
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int user = sc.nextInt();
			
			if (user >= 1) { 
				
				for (int i = 1; i <= user; i++) {
					System.out.print(i + " ");
				}
				break;
				
			} else { 
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
				
			}
		}
	}

	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int user = sc.nextInt();

		if (user >= 1) {
			
			for (int i = user; i >= 1; i--) {
				System.out.print(i + " ");
			}
			
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		
		while (true) {
			
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int user = sc.nextInt();
			
			if (user >= 1) { 
				
				for (int i = user; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
				
			} else { 
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
				
			}
		}
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			
			
			sum += i; 
			
			
			if(i < num) { 
				System.out.print(i + " + ");
			}else {
				System.out.print(i + " = ");
			}
		}
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) { 
			
			int min = Math.min(num1, num2);	
			int max = Math.max(num1, num2);
			
			for(int i = min; i <= max; i++) { 
				System.out.print(i + " ");
			}	
			
		} else { 
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.print("ù ��° ���� : ");
			int num1 = sc.nextInt();
			
			System.out.print("�� ��° ���� : ");
			int num2 = sc.nextInt();
			
			if(num1 >= 1 && num2 >= 1) { 
				
				int min = Math.min(num1, num2);	
				int max = Math.max(num1, num2); 
				
				for(int i = min; i <= max; i++) {
					System.out.print(i + " ");
				}	
				
				break; 
				
			} else {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
				
				
			}
		}
	}
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		System.out.println("===== " + num + "�� =====");
		
		for(int i = 1; i < 10; i++) {			
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
		
	}
	
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num >= 2 && num <= 9) { 
			
			
			for(int i = num; i < 10; i++) {						
				System.out.printf("===== %d�� =====\n", i);
				
				for(int j = 1; j <= 9; j++) {						
					System.out.printf("%d * %d = %d\n", i, j, (i * j));
				}
				
				System.out.println();
			}		
			
			
		} else { 
			System.out.println("2~9������ ���ڸ� �Է����ּ���:");
			
		}
	}
	
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {			
			
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			if(num >= 2 && num <= 9) { /
				
				for(int i = num; i <= 9; i++) {					
					System.out.printf("=== %d�� ===\n", i);
					
					for(int j = 1; j <= 9; j++) {				
						System.out.printf("%d * %d = %d%n", i, j, (i * j));
					}
					
					System.out.println();
				}	
				break;
				
			} else { 
				System.out.println("2~9 ������ ���ڸ� �Է����ּ���:");
			}
		}
	}
	
	public void practice14() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int start = sc.nextInt();
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=10; i++) { 
			
			System.out.print(start + " "); 
			
			start += num; 
			
		}
	}
	
	
	
	
	public void practice15() {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			
			System.out.print("������(+, -, *, /, %) : ");
			String op = sc.nextLine();		
			
			
			if(op.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break; // �ݺ����� ��������
			}
			
			
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("����2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();	
			
			
			if(op.equals("/") && num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.\n");
				continue; 
			}
			
			
			int result = 0;
			
			switch(op) {
			case "+": result = num1 + num2; break;
			case "-": result = num1 - num2; break;
			case "*": result = num1 * num2; break;
			case "/": result = num1 / num2; break;
			case "%": result = num1 % num2; break;
			default: System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.\n"); continue; 
			}
			
			System.out.printf("%d %s %d = %d\n", num1, op, num2, result);
			System.out.println();
		}
	}
	
	
	


