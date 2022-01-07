package com.kh.dimension.practice;

public class Run {

	public static void main(String[] args) {
		DimensionPractice d = new DimensionPractice();
		d.practice4();

		
		String[] arr = { "강연재", "강정학", "구명지", "김규식", "김사랑", "김상민", "김상윤", "김성은", "김은기", "민병현", "서영수", "설용환",  "손권모", "송홍연", "신진혁", "안지연", "양정환", "원영주", "유현규", "이경준", "이승은", "임종민", "전재광", "정신훈", "조용준", "최영근", "한미선", "한민규", "한수진" };

		int[] answer = new int[3];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = (int) (Math.random() * 9 + 1);

			for (int j = 0; j < i; j++) {
				if (answer[i] == answer[j]) {
					i--;
					break;
				}
			}
		}

		int index1 = (int) (Math.random() * 26 + 0);
		int index2 = (int) (Math.random() * 26 + 0);
		int index3 = (int) (Math.random() * 26 + 0);

		System.out.println(answer[0] + "번 문제 : " + arr[index1]);
		System.out.println(answer[1] + "번 문제 : " + arr[index2]);
		System.out.println(answer[2] + "번 문제 : " + arr[index3]);
		
	}

}
