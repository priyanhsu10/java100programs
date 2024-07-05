package basics;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class P046 {
	public static void main(String[] args) throws IOException {

		URL url = new URL("https://www.openssh.com/txt/socks4.protocol");
		System.out.println(url.getHost());
		System.out.println(url.getProtocol());
		System.out.println(url.getFile());
		System.out.println(url.getPort());
		
		var con=url.openConnection();
		InputStream io= con.getInputStream();
		
		int b=0;
		while((b=io.read())!=-1){
			
			System.out.print((char)b);
			
		}
		
		

	}
}
