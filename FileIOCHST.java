import java.io.*;

class FileIOCHST{
	public static void main(String []ar) throws IOException{
		FileReader fr = new FileReader("ip.txt");
		FileWriter fw = new FileWriter("op.txt");

		int c;
		while((c = fr.read()) != -1){
			fw.write(c);
		}

		fr.close();
		fw.close();
	}
}