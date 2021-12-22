package com.uni.chap01_poly.part02_electronic.run;

import com.uni.chap01_poly.part02_electronic.controller.ElectronicController2;
import com.uni.chap01_poly.part01_basic.model.vo.Child1;
import com.uni.chap01_poly.part01_basic.model.vo.Child2;
import com.uni.chap01_poly.part01_basic.model.vo.Parent;
import com.uni.chap01_poly.part02_electronic.controller.ElectronicController;
import com.uni.chap01_poly.part02_electronic.model.vo.Desktop;
import com.uni.chap01_poly.part02_electronic.model.vo.Electronic;
import com.uni.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.uni.chap01_poly.part02_electronic.model.vo.Tablet;

public class Run {

	public static void main(String[] args) {
		
		
		
		/*//1. 다향성을 적용안했을 경우
		
		ElectronicController ec = new ElectronicController();
		ec.insert(new Desktop("삼성","데스크탑",10000,"Geforce 1070"));
		ec.insert(new NoteBook("LG","그램",200000,3));
		ec.insert(new Tablet("Apple","아이패드",300000,false));
		
		Desktop d = ec.selectDesktop();
		NoteBook n = ec.selectNoteBook();
		Tablet t = ec.selectTablet();
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t); */
		
		//2. 다형성을 적용한 경우
		
		ElectronicController2 ec = new ElectronicController2();
		
		ec.insert(new Desktop("삼성","데스크탑",10000,"Geforce 1070"));
		ec.insert(new NoteBook("LG","그램",200000,3));
		ec.insert(new Tablet("Apple","아이패드",300000,false));
		
		Electronic d = ec.select(0);
		Electronic n = ec.select(0);
		Electronic t = ec.select(0);
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		
		Electronic[] el = ec.selectAll();
		
		for(int i = 0; i< el.length;i++) {
			if(el[i] instanceof Desktop) {
				((Desktop)el[i]).setGraphic("Geforce 1080");
				
				System.out.println(((Desktop)el[i]).getGraphic());
			}else if(el[i] instanceof NoteBook) {
				System.out.println(((NoteBook)el[i]).getUsbPort());
			}else {
				System.out.println(((Tablet)el[i]).isPenFlag());
			}
			
		}
		
		//for each문
		for(Electronic e: el){
			System.out.println(e);
			if(e instanceof Desktop) {
				((Desktop)e).setGraphic("geforce 1080");
				System.out.println(((Desktop)e).getGraphic());
			}else if(e instanceof Desktop) { 
		}else if(e instanceof NoteBook) {
			System.out.println(((NoteBook)e).getUsbPort());
		}else {
			System.out.println(((Tablet)e).isPenFlag());
			
		}
	}
		
		
	}
	/* 다형성을 사용하는 이유 
	 * 1. 부모타입의 객체배열로 다양한 자식들을 받아 올수 있다. 
	 * --> 부모타입 하나로 다양한 자식을 다룰수 있다. 
	 * 
	 * 2. 매개변수에 다형성을 적용하는 경우 메소드갯수가 줄어든다. 
	 */


}