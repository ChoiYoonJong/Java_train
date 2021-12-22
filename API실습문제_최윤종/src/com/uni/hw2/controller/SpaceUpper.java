package com.uni.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {

	public SpaceUpper() {
		
	}
	
	public void spaceToUpper() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영어를 입력하시오(띄어쓰기 포함) : ");
		String en = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(en, " ");
		
		
		for(int i = 0; i < en.length(); i++) {
			while(st.hasMoreTokens()) {
				String nStr = st.nextToken();
				
				String s = nStr.substring(0, 1).toUpperCase();
				String t = nStr.substring(1).toLowerCase(); 
				
				String ad = s+t;
				StringBuffer sbf = new StringBuffer(ad);
				System.out.print(sbf + " ");
			}
			
			
		}
		
	}
}
