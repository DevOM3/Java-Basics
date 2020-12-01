class StrFun{
	public static void main(String []ar){
		String s = "Hi";
		System.out.println(s);

		String s1 = new String();
		s1 = "Hi1";
		System.out.println(s1);

		String s2 = new String("Hi2");
		System.out.println(s2);

		String s3 = new String(s2);
		System.out.println(s3);

		char ca[] = {'H', 'i', '4'};
		String s4 = new String(ca);
		System.out.println(s4);

		byte ba[] = {1, 2, 4, 65};
		String s5 = new String(ba);
		System.out.println(s5);

		byte ba2[] = {65, 66, 67, 68, 69, 70};
		String s6 = new String(ba2, 2, 4);
		System.out.println(s6);

		char ca2[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		String s7 = new String(ca2, 2, 4);
		System.out.println(s7);
	}
}