import java.util.Scanner;

class Fno{
	int fno;
	public void first(int no){
		fno = no;
	}
}

class Sno extends Fno{
	int sno;
	public void sec(int no){
		sno = no;
	}
}

class Res extends Sno{
	int res;
	void result(){
		System.out.println("Addition  is " + (fno + sno));
	}
}

class MainClass{
	public static void main(String []args){
		int n1, n2;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number :- ")
		n1 = sc.nextInt();
		System.out.print("Enter a number :- ")
		n2 = sc.nextInt();

		Res r = new Res();

		r.first(n1);
		r.sec(n2);
		r.result();
	}
}