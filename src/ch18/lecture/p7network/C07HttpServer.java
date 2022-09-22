package ch18.lecture.p7network;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class C07HttpServer {
	public static void main(String[] args) {

		try (
				ServerSocket server = new ServerSocket(8000);
				Socket socket = server.accept();

				OutputStream os = socket.getOutputStream();
				BufferedOutputStream bos = new BufferedOutputStream(os);
				PrintWriter pw = new PrintWriter(bos);) {
			
			String data = "<h1>내일부터 jsp 책 가져오세요 </h1>";

			pw.println("HTTP/1.1 200 OK");
			pw.println("Content-Type: text/html; charset=utf-8");
			pw.println("Content-Length: " + data.getBytes().length);
			pw.println();
			pw.println(data);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}





