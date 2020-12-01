import java.util.Scanner;

class array_ex{
	public static void main(String []args){
		int ar[] = new int[5];
		byte i;
		System.out.println("Enter 5 no");
		Scanner s = new Scanner(System.in);
		for(i=0; i<5; i++){
			ar[i] = s.nextInt();
		}
		System.out.println("You Entered :- ");
		for(i=0; i<5; i++){
			System.out.println("Array " + i + " = " + ar[i]);
		}
	}
}