package com.kh.soket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattServer {
	
	// 클라이언트가 보낸 메세지를 받아서 다시 클라이언트에게 받은 메세지를 보낸다.

	public static void main(String[] args) {
		

			try {
				ServerSocket sever = new ServerSocket(60000);
				Socket s = sever.accept();
				BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				
				PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
				
				String line = null;
				while((line = br.readLine())!=null) {
					System.out.println("[" + s.getInetAddress() + "] 가 보낸메세지 : " + line);
					pw.println(line);
				}
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}


