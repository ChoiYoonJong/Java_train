package com.uni.mvc.model.vo;

public class Book {//부모 역활
	private String title; //도서명
	private String author; //저자명
	private String publisher; //출판사명
	
	public Book() {
	}

	
	public Book(String title, String author, String publisher) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return ", 책 제목 =" + title + ", 작가 =" + author + ", 출판사 =" + publisher;
	}
	
	
	
	

}
