import java.net.*;
import java.io.*;

class ServerTest1 {
	public static void main(String ar[])  throws IOException {
		ServerSocket ss = new ServerSocket(100);
		while(true){
			Socket client_copy = ss.accept();
	
			DataInputStream is = new DataInputStream(client_copy.getInputStream());
			DataOutputStream os = new DataOutputStream(client_copy.getOutputStream());

			String req_value = (String)is.readUTF();
			int num = Integer.parseInt(req_value);

			int resp_and = num * num;
			os.writeUTF(resp_and + "");	
		}
		/*
		client_copy.close();
		ss.close();
		*/
	}
}
