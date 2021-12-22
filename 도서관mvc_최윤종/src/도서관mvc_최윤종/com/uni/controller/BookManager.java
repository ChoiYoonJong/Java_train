package 도서관mvc_최윤종.com.uni.controller;

import java.util.ArrayList;

import 도서관mvc_최윤종.com.uni.model.vo.Book;

public class BookManager {
	ArrayList<Book> bookList = new ArrayList<Book>();

	public BookManager() {
		
	}

	public void insertBook(도서관mvc_최윤종.com.uni.model.vo.Book book) {
		int lastNo = 0;

		try {
			lastNo = bookList.get(bookList.size() - 1).getbNo() + 1;
		} catch (IndexOutOfBoundsException e) {
			lastNo = 1;
		}
		
		book.setbNo(lastNo);
		
		bookList.add(book);
	}

	public int deleteBook(int num) {
		
		for(int i = 0; i < bookList.size(); i++) {
			if(num == bookList.get(i).getbNo()) {
				bookList.remove(i);
				return 1;
			}
		}
		return 0;
	}

	public ArrayList<Book> searchBook(String name) {
		
		ArrayList<Book> searchList= new ArrayList<Book>();
		
		for(int i = 0; i < bookList.size(); i++) {
			if(name.equals(bookList.get(i).getTitle())) {
				searchList.add(bookList.get(i));
			}
		}
		
		
		return searchList;
		
	}

	public ArrayList<도서관mvc_최윤종.com.uni.model.vo.Book> selectList() {
		
		
		return bookList;
	}
}
