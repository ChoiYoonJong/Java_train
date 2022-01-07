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
