package com.kh.day17.network.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
	public static void main(String[] args) {
		// 서버 구동중입니다.
		// 클라이언트의 연결을 기다리고 있습니다.
		// 클라이언트와 연결되었습니다.
		// 받은 메시지 : 23
		// 받은 메시지 : 24 + 42
		// 클라이언트가 종료하였습니다.
		ServerSocket serverSocket = null;
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			System.out.println("서버 구동중입니다.");
			for(int i = 1; i <= 50; i++) {
				System.out.print("=");
				Thread.sleep(10);
			}
			System.out.println();
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다...");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			// 받을 준비
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			while(true) {
				//데이터 받기
				String recvMsg = dis.readUTF();
				if(recvMsg.equalsIgnoreCase("exit")) {
					// equalsIgnoreCase : 대소문자를 따지지 않고 문자만 맞다면 비교해준다.
					System.out.println("클라이언트가 종료하였습니다.");
					break;
				}
				System.out.printf("받은 메시지 : %s\n", recvMsg);
				// 24 + 42 -> 띄어쓰기 기준으로 문자열 배열을 만듬
				String [] msgArrs = recvMsg.split(" ");
				if(msgArrs.length != 3) {
					String errMsg = "end";
					dos.writeUTF(errMsg);
					continue;
				}
				// 24 / + / 42
				int num1 = Integer.parseInt(msgArrs[0]);
				// Type mismatch: cannot convert from String to int
				// String에서 int로 변환이 불가하다.
				// Integer.parseInt를 통해 변환 가능
				int num2 = Integer.parseInt(msgArrs[2]);
				String operator = msgArrs[1];
				String result = "";
				switch(operator) {
				case "+" : 
					result = String.valueOf(num1 + num2);
					// Type mismatch: cannot convert from int to String
					// int는 String이 될 수 없다.
					// String.valueOf를 통해 넣어줘도 되고
					// 아래처럼 문자열을 추가해줘도 가능하다.
					break;
				case "-" : 
					result = num1 - num2 + "";
					break;
				case "*" : 
					result = num1 * num2 + "";
					break;
				case "/" : 
					result = num1 / num2 + "";
					break;
				case "%" : 
					result = num1 % num2 + "";
					break;
				}
				// 결과 보내고 끝
				dos.writeUTF(result);
				// The method writeUTF(String) in the type DataOutputStream is not applicable for the arguments (int)
				// writeUTF는 전달값으로 String을 씀
				
				// Null pointer access: The variable dos can only be null at this location
				// dos에 노란줄이 들어오는 이유는 null값을 주고 아무것도 하지 않았기 때문이다.
				// 해결 방법 : os = socket.getOutputStream();
				// 해결 방법 : dos = new DataOutputStream(os);
				// 위 2개를 선언해준다.
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
