package com.uni.chap01_before_vs_after.after.model.vo;

public class Desktop extends Product {
	
	
	private boolean allInOne;//일체여부
	
	public Desktop() {
	}

	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		super(brand,pCode, pName,price);// super() 생생자는 자식 생성자에서 부모생성자를 호출 할 수 있다.반드시 첫줄에 작성해줘야한다.
		/*super.brand = brand;// 직접 접근 일때는 부모필드의 접속제어자가 protected 여야한다.
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;*/
		this.allInOne = allInOne;
		
		/* super. 의 super는 해당객채의 부모주소를 담고있다.
		 * 따라서 super. 으로 부모에 접근가능하다.
		 * 단 접근하조가 하는 필드가 private 일때는 접근 불가.
		 * -> 부모필드를 자식까지만 접근 가능하게 하기위해서 protected 로 부모필드를 변경해야한다.
		 * */
	}

	

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	@Override
	public String toString() {
		return super.toString() + " ,allInOne : "+ allInOne+"]";

	}
	
	
	

}
