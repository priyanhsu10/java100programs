package basics;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


//tcp protocal Socket program
public class P049 {
}

class Client {

    public static void main(String[] args) {
        try {
            Socket sc = new Socket("localhost", 6666);
            DataOutputStream ds = new DataOutputStream(sc.getOutputStream());
            ds.writeUTF("hi server i am sending the message");
            ds.flush();

            sc.close();
            ds.close();
            ;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Server {

    public static void main(String[] args) {
        try {
            ServerSocket sc = new ServerSocket(6666);
            Socket s = sc.accept();
            DataInputStream ds = new DataInputStream(s.getInputStream());
            byte[] b = new byte[1024];
            while (ds.read(b) != -1) {

                String str = new String(b, 0, b.length);
                System.out.println(str);
            }

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

