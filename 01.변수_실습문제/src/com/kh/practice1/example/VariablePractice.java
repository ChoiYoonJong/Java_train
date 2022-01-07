package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {

	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine(); // string 글자 입력시
		System.out.println(	"나이를 입력하세요 :");
		int age = sc.nextInt(); // 숫자 입력시 int로
		sc.nextLine();
		
		System.out.println("성별을 입력하세요(남/여)");
		char gender = sc.nextLine().charAt(0);  //글짜가 한개이기 때문에 charAt 
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble(); //double 숫자
		
		System.out.println(" 키 " + height + "cm 인 " + age + " 살 " + gender + "자 " + name + "님 반갑습니다.");
	}


public void method2() {
	Scanner sc = new Scanner(System.in);
	System.out.println("첫번째 정수를 입력하세요 : ");
	int num1 = sc.nextInt();
	System.out.println("두번째 정수를 입력하세요 : ");
	int num2 = sc.nextInt();
	
	System.out.println("더하기 결과" + (num1+num2));
	System.out.println("빼기 결과" + (num1-num2));
	System.out.println("곱하기 결과"+ (num1*num2));
	System.out.println("나누기 결과"+(num1/num2));
}

/* 
 * 문자열
 *string = 여러 문자를 사용할때 사용이 가능하다. 보통 글자 할때 string 으로 만든다. 
 *char = 한글자만 입력이 가능하다. char = '기'  데이터 점유율을 줄이기 위해서 한글자할때 사용이 된다. 한글자의 한글 혹은 영문 
 *
 *정수형
 *int = 정수에서 통용적으로 많이 사용되는 단어이다.-21억 ~ 21억 까지 가능하다. 보통 int 를 사용하지만 데이터 형태에 따라서 다르것을 쓰기도 한다.
 *byte = 1 byte는 -128~127 까지 범위 숫자가 가능하다.
 *short = -32768 ~  32767 까지 숫자 범위가 가능하다.
 *long = 많은 정수의 입력을 가능하다.약간 string 하고 비슷한 느낌이다. 여러 숫자 입력이 가능하다.
 *
 *
 
 *Scanner sc = new Scanner(System.in); = 화면으로부터 데이터를 입력받는 기능을 제공한느 클래스이다. 예를 들면 카톡 메세지에서 입력후 전송버튼을 누르면 상대방에게 전송되듯 메세지 대신 값을 입력받는 역활을 한다.
 *import java.util.Scanner; java.util 내에는 int(정수),double(실수)등의 기본적인 데이터 타입을 입력받기 위한 클래스로 존재한다.
 *print() 메소드와같은것은 객체를 생성하지 않고도 사용가능하지만 Scanner클래스는 객체를 생성해야만 사용할 수 있다.
 *
*/



/*산술연산 순선 
 *  (*,/,% > +,-)
 *  (**,//,%) 
 * 
 *  ** = 제곱 
 *  ex) 3 ** 2 3의2제곱 해서 결과는 9가 나온다.
 *  
 *  // = 몫
 *  / = 나누가
 *  
 *  ex) 7 // 3 = 2    (7/3 = 2.3333333333..... 7나누기3을 하면 2.3333...으로 나뉘어지는게 //을 하면 거기에 몫값만 뽑는다.)
 *  
 *  % = 나머지를 구하는 연산자이다... 
 *  ex) 7 % 3 = 1 ( 7/3 일시 3*2 는 6 거기에 1이 남는다. 그럼 그게 나머지 수로 출력이된다.)
 *  
 *  */

public void method3() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("가로 : ");
	double width = sc.nextDouble();
	System.out.print("세로 : ");
	double height = sc.nextDouble();
	
	System.out.println("면적 : " + width * height);
	System.out.println("둘레 : " + (width + height) * 2);
	
}

public void method4() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("문자열을 입력하세요 : ");
	String str = sc.nextLine();
	
	System.out.println("첫 번째 문자 : " + str.charAt(0));
	System.out.println("두 번째 문자 : " + str.charAt(1));
	System.out.println("세 번째 문자 : " + str.charAt(2));
}


}

		





