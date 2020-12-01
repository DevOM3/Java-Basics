import java.net.*;
import java.io.*;

class ClientTest1 {
	public static void main(String ar[]) throws IOException  {
		Socket s = new Socket("localhost", 100);

		DataInputStream is = new DataInputStream(s.getInputStream());
		DataOutputStream os = new DataOutputStream(s.getOutputStream());

		os.writeUTF("5");

		String ans = (String)is.readUTF();
		System.out.println("Square is " + ans);
		
		s.close();
	}
}
