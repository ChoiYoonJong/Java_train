package com.uni.chap01_list.part02_list.run;

import java.util.ArrayList;
import java.util.List;

import com.uni.chap01_list.part02_list.model.vo.Music;

public class Run {

	public static void main(String[] args) {
		
		//E -> Elements : 리스트에 담길 요소 (객체)
		ArrayList<Music> list = new ArrayList<Music>();
		
		//1.add (E e) : 리스트의 끝에 인스턴스 데이터를 추가하는 메소드 (내부적으로 사이즈 검사한후 수용가능한 범위이면 추가되 넘어가도 알아서 사이즈 늘려준 다음 추가함)
		list.add(new Music("Good Bye", "박효신"));
		list.add(new Music("가을아침", "아이유"));
		list.add(new Music("달링", "양다일"));
		
		//list.add("끝"); //스트링 타입으로 들어갈 수 없다.
		
		System.out.println(list.toString());
		
		//2.add(int index, E e ) : 인덱스를 지정해서 해당 인덱스에 인스터스 추가하는 메소드 (내부적으로 기존에 있는것은 뒤로 땡기고 해당인덱스에 값추가)
		list.add(1,new Music("연인", "박효신"));
		
		System.out.println(list);
		
		//3.set(int index, E e ) : 해당하는 인덱스의 값을 E로 변경
		list.set(0, new Music("엔젤베이비", "트로이시반"));
		System.out.println(list);
		
		//4.size() : 리스트안에 몇개의 데이터가 있는지 크기변환
		System.out.println(list.size());
		
		//5.remove(int index) : 해당하는 인덱스의 인스터스를 삭제 (알아서 앞으로 땡겨주고, 크기줄어들고)
		
		list.remove(new Music("연인", "박효신"));
		System.out.println(list);
		System.out.println(list.size());
		
		//6.get(int index) : 행당하는 인덱스의 인스터스 가져오기
		System.out.println(list.get(0));
		System.out.println(list.get(0).getTitle());
		
		//7.subList(int index1, int index2) : index1에서 index2 앞까지 추출해서 새로운 list 로 반환
		List sub = list.subList(0,2);
		System.out.println(sub);
		
		//8. allAll(collection c) : 컬랙션은 통채로 뒤에 추가하는 메소드
		list.addAll(sub);
		System.out.println(list);
		System.out.println(list.size());
		
		//9. isEmpty(): 컬렉션이 비어있는지 묻는메소드
		System.out.println(list.isEmpty());
		
		//10. clear() : 비우기
		//list.clear();
		//System.out.println(list.isEmpty());
		
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(Object m : list) {
			System.out.println(m);
		}
	}
	
	

}
