package com.java2.net;

<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9958);
			Socket socket = server.accept();
			System.out.println("connect");
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader in = new BufferedReader(isr);
			String line = in.readLine();
			System.out.println(line);
			String token[]= line.split(":");
			String command = token[0];
			String option = token[1];
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
=======
public class MyServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
>>>>>>> 148c01786eefd7ee0971451f4463326a93f16eb4