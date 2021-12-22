package com.uni.chap03_override.model.vo;

import java.util.Objects;

public class Book {
	
	private String title; //제목
	private String author; //작가
	private int price; // 가격
	
	
	public void book() {
		
	}
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		
	}

	
	public Book() {
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	public String information() {
	
		return "제목 : " + title + ", 저자 : " + author + ", 가격 : " + price ;
	}
	public String toString() {
		return "Book [title=" + title +",author=" + author + ",price=" + price + "]";
	}
	
	//2.equals 메소드의 내용을 주소값 비교가 아닌 실제 필드 값들이 모두 같을경우 true 반환되고 
	//하나라도 틀릴경우 false 가 반환되도록 재정의 하자.
	public boolean equals(Object obj) {
//              bk1.equals(bk2)
				
		//        this(현재객체)           vs        obj(전달 받은 비교대상 )
		//        자료형 : Book                     Object
			
			if(!(obj instanceof Book)) {
				return false;
			}
			
			Book other = (Book)obj;
			
			if(this.title.equals(other.title) && this.author.equals(other.author) && this.price == other.price) {
				return true;
				
			}else {
				return false;
			}
		}
		
		public int hashCode() {
			//1번 : 해당객체의 필드값을 하나의 문자열로 합쳐서 그 해당 문자열의 해쉬코드를 리턴 
			//	  title + author + price ---> 문자열 (String) 이된다. 
			// 즉, 같은 문자열일 경우 해당 문자열의 hashCode 는 같도록 String에서 이미 재정의

			//return (title + author + price).hashCode();
			
			//2번
			return Objects.hash(title, author, price);
			// Objects.hash 는 주어진 값들을 이용해서 코드를 생성하는 역할, 
			//주어진 매개값들로 배열을 생성하고 arrays.hashcode(Object[])를
			//호출해서 해쉬코드를 얻고 이값을 리턴해줌

		}

}	


