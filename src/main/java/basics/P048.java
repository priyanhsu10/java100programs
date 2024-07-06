package basics;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;


//UDP protocol chat server
public class P048 {

}

class ChatHelper {

	public static void sender(int port) {
		try {

			DatagramSocket ds = new DatagramSocket();
			InetAddress addr = InetAddress.getByName("127.0.0.1");
			Scanner sc = new Scanner(System.in);
			boolean t = true;
			while (t) {
				String msg = sc.next();

				DatagramPacket p = new DatagramPacket(msg.getBytes(), msg.length(), addr, port);
				if (msg.equals("quit")) {
					t = false;

				} else {
					ds.send(p);
				}

			}
			sc.close();
			ds.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void reciever(int port ) {

		try {
			DatagramSocket ds = new DatagramSocket(port);
			boolean t = true;
			while (t) {
				byte[] data = new byte[1024];


				DatagramPacket p = new DatagramPacket(data, 1024);
				ds.receive(p);

				String s = new String(p.getData(), 0, p.getLength());
				System.out.println(s);
			}
			ds.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class server {
public static void main(String[] args) throws Exception {
	Thread sender=new Thread(()->ChatHelper.sender(3000));
	Thread reciever= new Thread(()->ChatHelper.reciever(3001));
	
	sender.start();
	reciever.start();
	sender.join();
	reciever.join();
	
}
}
class client{
	
	public static void main(String[] args) throws Exception {
		Thread sender=new Thread(()->ChatHelper.sender(3001));
		Thread reciever= new Thread(()->ChatHelper.reciever(3000));
		
		sender.start();
		reciever.start();
		sender.join();
		reciever.join();
		
	}
}
