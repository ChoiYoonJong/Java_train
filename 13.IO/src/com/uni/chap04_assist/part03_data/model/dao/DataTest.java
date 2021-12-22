package com.uni.chap04_assist.part03_data.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataTest {
	
	public void fileSaveOpen() {
		
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("d_data.txt"));
				DataInputStream dis = new DataInputStream(new FileInputStream("d_data.txt"))){
			
				//먼저 파일로 출력하기
				dos.writeUTF("박효신");
				dos.writeInt(94);
				dos.writeChar('A');
				dos.writeBoolean(true);
				dos.writeDouble(15.21);
				
				while(true) {
					System.out.println(dis.readUTF() + ","+dis.readInt() + ","+dis.readChar() + ","+dis.readBoolean() + ","+dis.readDouble());
				}
			
		} catch (EOFException e) {
			System.out.println("파일읽기완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
