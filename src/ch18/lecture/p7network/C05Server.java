package ch18.lecture.p7network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C05Server {
	public static void main(String[] args) {
		System.out.println("연결 기다리는 중...");
		try (
				ServerSocket serverSocket = new ServerSocket(55000);
				Socket socket = serverSocket.accept();
				InputStream is = socket.getInputStream();
				BufferedInputStream bis = new BufferedInputStream(is);) {
			String remoteAddress = socket.getRemoteSocketAddress().toString();
			String clientIpAddress = remoteAddress.substring(0, remoteAddress.indexOf(':'));
			String folder = "C:\\Users\\user\\Desktop\\output\\";
			String fileName = folder + clientIpAddress.replace('.', '_') + ".dat";

			try (
					FileOutputStream fos = new FileOutputStream(fileName);
					BufferedOutputStream bos = new BufferedOutputStream(fos);) {
				byte[] buf = new byte[1000];
				int len = 0;
				int fileSize = 0;
				while ((len = bis.read(buf)) != -1) {
					fileSize += len;
					bos.write(buf, 0, len);
				}
				bos.flush();
				System.out.println(clientIpAddress + "로 부터");
				System.out.println(fileSize + "bytes 크기의 파일을 받았습니다.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
