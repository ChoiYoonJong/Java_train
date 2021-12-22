package com.uni.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SetDate {

	public SetDate() {
		
	}
	
	public String todayPrint() {
		Date today = new Date();
		int y = today.getYear() +1900;
		int m = today.getMonth() +1;
		int d = today.getDate();
		int h = today.getHours();
		int mt = today.getMinutes();
		int sc = today.getSeconds();
		
		String td = "";
		td = y + "년 " + m + "월 " + d + "일 " + h + "시 " + mt + "분 " + sc + "초";
		return td;
		
	}
	
	public String setDay() {
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(2011, 3-1, 21);
		int s = calendar.get(GregorianCalendar.DAY_OF_WEEK);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd E요일");
		String k = sdf1.format(calendar.getTime());
		return k;
		
	}
}
