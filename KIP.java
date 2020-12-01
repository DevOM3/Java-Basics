import java.io.*;

class KIP{
	public static void main(String ar[]) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int a = Integer.parseInt(br.readLine());
		System.out.println(a);
	}
}