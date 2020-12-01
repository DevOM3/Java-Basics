class Arr{
	public static void main(String []ar){
		int[] arr = new int[5];
		byte i;
		System.out.println("Enter 5 numbers :- ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		for (i=0; i<5; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements are - ");
		for(i=0; i<5; i++){
			System.out.println(arr[i]);
		}
	}
}