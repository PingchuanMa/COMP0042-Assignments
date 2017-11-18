﻿package exam;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(1010);
		while (true) {
			Socket s = ss.accept();
			ObjectInputStream is = new ObjectInputStream(s.getInputStream());
			//ObjectInputStream is = new ObjectInputStream(new BufferedInputStream(s.getInputStream()));
			Point p1 = (Point) is.readObject();
			Point p2 = (Point) is.readObject();
			PrintStream ps = new PrintStream(s.getOutputStream());
			ps.println(p1.distance(p2));
			ps.flush();
			ps.close();
			is.close();
			s.close();
		}
	}
	
}
