import java.io.*;

class STRTOK{
	public static void main(String ar[]) throws IOException{
		FileReader fr = new FileReader("ip.txt");
		BufferedReader br = new BufferedReader(fr);
		StreamTokenizer st = new StreamTokenizer(br);

	    //st.commentChar('L');
		int t;
		while((t = st.nextToken()) != StreamTokenizer.TT_EOF){
			switch(t){
				case StreamTokenizer.TT_NUMBER:
					System.out.println(st.nval);
					break;
				case StreamTokenizer.TT_WORD:
					System.out.println(st.sval);
					break;
			}
		}
	}
}