package com.kh.day16.network.exercise1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientServer { // 클라이언트 부터 실행한뒤에 서버 실행시키기
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		InputStream is = null;
		OutputStream os = null;
		Scanner sc = new Scanner(System.in);

		try {
			serverSocket = new ServerSocket(7777); // 포트번호 설정 후 연결 대기
			System.out.println("서버 소켓 생성");
			System.out.println("클라이언트 접속 대기중...");
			Socket socket = serverSocket.accept(); // 연결된 후에는 소켓 객체 생성
			System.out.println("클라이언트 접속 완료");

			is = socket.getInputStream(); // 프로그램 기준 들어오니까 InputStream
			os = socket.getOutputStream(); // 프로그램 기준 나가니까 OutputStream

			while (true) {
				// 2. 데이터 받기
				byte[] bytes = new byte[1024];
				int readByteNo = is.read(bytes); // 읽을 때에는 read() 메소드 사용
				String message = new String(bytes, 0, readByteNo); // bytes에는 읽은 데이터, readByteNo는 읽은 갯수 / byte로 출력할 수
																	// 없어서 문자열로 만들어줌.
				System.out.printf("클라이언트(상대) : %s\n", message);
				// 받기 완료
				// 3. 데이터 보내기
				System.out.println("서버(나) : ");
				message = sc.nextLine();
				bytes = message.getBytes();
				os.write(bytes);
				os.flush();
				// 보내기 완료
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}