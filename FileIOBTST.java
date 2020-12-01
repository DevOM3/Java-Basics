import java.io.*;

class FileIOBTST{
	public static void main(String []ar) throws IOException{
		FileInputStream fis = new FileInputStream("ip.txt");
		FileOutputStream fos = new FileOutputStream("op.txt");

		int c;
		while((c = fis.read()) != -1){
			fos.write(c);
		}

		fis.close();
		fos.close();
	}
}