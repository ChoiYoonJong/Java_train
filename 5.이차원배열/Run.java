package com.kh.dimension.practice;

public class Run {

	public static void main(String[] args) {
		DimensionPractice d = new DimensionPractice();
		d.practice4();

		
		String[] arr = { "������", "������", "������", "��Խ�", "����", "����", "�����", "�輺��", "������", "�κ���", "������", "����ȯ",  "�ձǸ�", "��ȫ��", "������", "������", "����ȯ", "������", "������", "�̰���", "�̽���", "������", "���籤", "������", "������", "�ֿ���", "�ѹ̼�", "�ѹα�", "�Ѽ���" };

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

		System.out.println(answer[0] + "�� ���� : " + arr[index1]);
		System.out.println(answer[1] + "�� ���� : " + arr[index2]);
		System.out.println(answer[2] + "�� ���� : " + arr[index3]);
		
	}

}
