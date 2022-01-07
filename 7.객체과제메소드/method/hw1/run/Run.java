package com.method.hw1.run;

import com.method.hw1.sample.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		
		NonStaticSample ns = new NonStaticSample();
		
		System.out.print("1. 랜덤 값 : ");
		ns.printLottoNumbers();
		
		System.out.print("2. a문자 5개 출력 : ");
		ns.outputChar(5, 'a');
		
		System.out.println("3. 랜덤 영문자 출력 : " + ns.alphabette());
		
		System.out.println("4. apple의 2번 4번 인덱스 사이의 값 출력 : " + ns.mySubstring("apple", 2, 4));
	}

}
