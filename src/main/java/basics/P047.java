package basics;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class P047 {
	public static void main(String[] args) throws InterruptedException {

		Thread sender = new Thread(() -> sender());
		Thread reciever = new Thread(() -> reciever());
		
		sender.start();
		reciever.start();
		sender.join();
		reciever.join();
		

	}

	public static void sender() {
		DatagramSocket ds;
		try {
			ds = new DatagramSocket();

			String s = "this is the message";

			InetAddress inet = InetAddress.getByName("127.0.01");

			DatagramPacket p = new DatagramPacket(s.getBytes(), s.length(), inet, 3000);
			ds.send(p);
			System.out.println("message send");
			ds.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void reciever() {
		try {
			DatagramSocket ds = new DatagramSocket(3000);
			byte[] b = new byte[1024];

			DatagramPacket p = new DatagramPacket(b, 1024);

			ds.receive(p);
			System.out.println("message recieve");

			String s = new String(p.getData(), 0, p.getLength());
			System.out.println(s);

			ds.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
