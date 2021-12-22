package com.uni.chap02_abstractAndInterface.model.vo;

public abstract class Sports { //추상 - 메소드가 있으면 무조건 추상적인것이기 때문에...
	
	private int people;
	
	public Sports() {
	}

	public Sports(int people) {
		super();
		this.people = people;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	@Override
	public String toString() {
		return "Sports [people=" + people + "]";
	}
	
	//추상메소드 (미완성된 메소드로 내용이 구현되어 있지않은 메소드) -> {}몽통부가 아직 구현 되어있지 않은상태
	//--> 미완성된 추상메소드가 있다는것은 이 클래스또한 추상 클래스(미완성 클래스) 라는 것 
	//--> 추상클래스로 명시를 해줘야함 (public abstract class Sports { } )
	
	public abstract void rule();

	public void howToPlay() {
		
	} 
	
	
}
