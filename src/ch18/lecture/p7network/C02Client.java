package ch18.lecture.p7network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class C02Client {
	public static void main(String[] args) {
		// Client : Socket 생성 후 연결 요청

		System.out.println("연결 시도, 소켓 생성");
		try (
				Socket socket = new Socket("172.30.1.60", 60000);) {
			
			// 입출력 스트림 꺼내서 일함
			
			System.out.println("연결 종료");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
