package 추상클래스_최윤종.com.uni.practice3.controller;

import 추상클래스_최윤종.com.uni.practice3.model.vo.Animal;
import 추상클래스_최윤종.com.uni.practice3.model.vo.Cat;
import 추상클래스_최윤종.com.uni.practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		Animal[] an = new Animal[5];
		
		an[0] = new Dog("왕왕이", "치와와", 3);
		an[1] = new Cat("예민이", "시암고양이", "타이", "회색");
		an[2] = new Dog("멍청", "골든리트리버", 17);
		an[3] = new Dog("지순이", "푸들", 7);
		an[4] = new Cat("롱이", "벵골", "이집트와 아시아 잡종", "점박이");
		
		for(int i = 0; i < an.length; i++) {
			an[i].speak();
		}
	}

}