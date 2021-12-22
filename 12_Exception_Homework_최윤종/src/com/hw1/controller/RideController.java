package com.hw1.controller;

import com.hw1.model.vo.Guests;
import com.hw1.model.vo.RollerCoaster;

public class RideController{
	
	public void cutGuests() {
		Guests[] guest = new Guests[4];
		
		guest[0] = new Guests("홍길동", 17, 'M', 120.2);
		guest[1] = new Guests("유관순", 20, 'F', 102.3);
		guest[2] = new Guests("김유신", 23, 'M', 110.4);
		guest[3] = new Guests("김흥부", 21, 'M', 112.5);
		
		Guests[] onBoard = new Guests[RollerCoaster.PERMITNUMBER];
		
		try {
			int count = 0;
			for(int i = 0; i < guest.length; i++) {
				if(guest[i].getHeight() > RollerCoaster.CUTHEIGHT) {
					onBoard[count++] = guest[i];
				}
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			String str = e.getMessage();
			char ch = str.charAt(6);
			System.out.println("문제가 발생한 해당 배열의 인덱스 번호 : "+ ch);
		} finally {
			System.out.println("인원이 가득 찼습니다. 다음 차례를 기다리세요");
			System.out.println("이번차례 탑승 명단");
			for(Guests a : onBoard) {
				System.out.println(a.toString());
			}
			System.out.println("탑승자 요금 : " +(RollerCoaster.PRICE*2));
		}
	}
}