package com.uni.chap04_assist.part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {
	
	
	public void fileSave() {
		//1. 기반스트림 생성 (어떤 외부매체와 데이터를 주고받을 것이냐를 선택해주는 메인(기반) 스트림이 반드시 필요.
		
		/*
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			bw.write("안녕하세요. \n");
			bw.write("반갑습니다");
			bw.newLine();
			bw.write("감사합니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			
			try{
				if(bw != null)bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
	
	public void fileOpen() {
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {
				
			//System.out.println(bw.readLine());
			
			String temp = null;
			while((temp= br.readLine()) !=null) {
				System.out.println(temp);
			}
		
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

