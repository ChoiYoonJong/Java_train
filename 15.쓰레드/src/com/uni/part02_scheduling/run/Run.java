package com.uni.part02_scheduling.run;

import com.uni.part02_scheduling.model.tread.Thread3;

public class Run {

	public static void main(String[] args) {
		
		Thread3 th3 = new Thread3();
		
		for(int i = 1; i <=100; i++) {
			Thread th = new Thread(th3);// 우선순위 기본이 5
			
			if(i % 2 == 0) {
				th.setPriority(Thread.MAX_PRIORITY);//10
				th.setName("thread 짝수 : " + i);
			}else {
				th.setPriority(Thread.MIN_PRIORITY);//10
				th.setName("thread 홀수 : " + i);
			}
			
			th.start();
		}

	}

}
