package com.uni.mvc.model.vo;

public class CookBook extends Book {
	private boolean coupon;//요리학원쿠폰유무
	
	public CookBook() {
	}

	public CookBook(String title, String author, String publisher,boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}

	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return "요리책 ( coupon =" + coupon + super.toString() + ")";
	}	
}