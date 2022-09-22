package ch18.lecture.p7network;

import java.net.ServerSocket;
import java.net.Socket;

public class C01Server {
	public static void main(String[] args) {
		// 서버: 연결을 기다림
		// 연결 요청을 수락함
		// Socket 만들기 위해
		// ServerSocket 사용

		System.out.println("연결 기다림");
		try (
				// ServerSocket 만듦
				ServerSocket serverSocket = new ServerSocket(60000);
				
				// 연결 기다림
				Socket socket = serverSocket.accept();) {

			System.out.println(socket.getRemoteSocketAddress());
			
			System.out.println("연결 종료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}












