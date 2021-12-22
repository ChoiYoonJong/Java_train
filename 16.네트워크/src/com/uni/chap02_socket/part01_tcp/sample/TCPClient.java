package com.uni.chap02_socket.part01_tcp.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public void ClientStart() {
		//1.서버의 ip주소와 서버가 정한 포트번호를 먼저 알아야함
		int port = 8500;
		String serverIp = null;
		
		try {
			//2. 서버의 ip 주소와 서버가 정한 포트번호흫 매개변수로 하여 클라이언트 소켓객체 생성
			serverIp = InetAddress.getLocalHost().getHostAddress();
		
		
			Socket server = new Socket(serverIp, port);
			
			System.out.println("서버와 연결이 되었습니다. ");
			
			//3.서버와의 입출력 스트링 오픈
			if(server !=null) {
				BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
				
				PrintWriter pw = new PrintWriter(server.getOutputStream());
				
				//4. 스트링을 통해 읽고 쓰기
				pw.println("반가워요");
				pw.flush();
				
				//서버 -> 클라이언트 메세지 읽어 들임
				String message = br.readLine();
				System.out.println("서버가 보낸 메세지"+message);
				
				pw.close();
				br.close();
				
			}
			server.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void serverStart() {
		// TODO Auto-generated method stub
		
	}
}
