package com.uni.chap03_set.part02_treeset.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import com.uni.chap03_set.part02_treeset.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add(new String("하하하"));
		ts.add(new String("나나나"));
		ts.add(new String("가가가"));
		ts.add(new String("다다다"));
		ts.add(new String("하하하"));
		
		System.out.println(ts); //정렬기준이 되어있는 상태이기 때문에 객체에 컨퍼러블 대로 정렬이 되어서 나온다
		
		TreeSet<Student> ts1 = new TreeSet<>();
		
		ts1.add(new Student("공유",30,100));
		ts1.add(new Student("이효리",20,90));
		ts1.add(new Student("유재석",40,60));
		ts1.add(new Student("공유",10,100));
		
		System.out.println(ts1);
		
		//TreeSet 의 경우 hashCode , equals 로 중복판단을 하지 않고
		//CompareTo 에 제시되어있는 필드로 중복 처리를 해준다.(동일객체 판단)
		
		
		//1. for each문
		for(Student s : ts1) {
			System.out.println(s);
		}
		//2. list 문
		ArrayList<Student> list = new ArrayList<>(ts1);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//3. iterator문
		System.out.println("=========Iterator문=========");
		Iterator it = ts1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
