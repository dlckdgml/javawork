package com.kh.soket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChattClient {

	// 키보드로 입력받은 데이터를 읽어서 서버로 보낸다.
	// 다시 서버가 보낸 메세지를 받아서 클라이언트 자신의 콘솔창에 출력한다.
	
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress ip = null;
		try {
			ip = InetAddress.getLocalHost();
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		}
		
		Socket s = new Socket();
		try {
			s = new Socket(ip.getHostAddress(), 60000);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(s.getOutputStream(),true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		BufferedReader br2 = null;
		try {
			br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			String line = null;
			try {
				line = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			pw.println(line);
			
			try {
				System.out.println("내가 보낸 메세지 : " + br2.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
			

	}
	}
	

