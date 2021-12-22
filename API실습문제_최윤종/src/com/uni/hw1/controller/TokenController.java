package com.uni.hw1.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		String nStra = "";
		while(st.hasMoreTokens()) {
			 String nStr = st.nextToken();
			nStra += nStr;
		}
		return nStra;
		
	}
	
	public String firstCap(String wordww) {
		String s = wordww.substring(0,1).toUpperCase();
		String t = wordww.substring(1).toLowerCase();
		
		String www = s + t;
		return www;
		
	}
	
	public int findChar(String wordww, char a) {
		int count = 0;
		for(int i =0; i < wordww.length(); i++) {
			if(wordww.charAt(i)== a) {
				count++;
			}
		}
		
		return count;
		
	}

}
