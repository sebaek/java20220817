package ch18.lecture.p7network;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class C04Client {
	public static void main(String[] args) {
		System.out.println("연결 시도");
		
		try (Socket socket = new Socket("172.30.1.60", 60000);) {
			
			System.out.println("연결됨!");
			
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw);
			
			try (os;osw;bw;pw;) {
				pw.println("클라이언트입니다.");
				pw.println("접속에 성공했네요~");
				
				pw.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}









