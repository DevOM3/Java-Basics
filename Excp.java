class Excp{
	public static void main(String []ar){
		int a=10, b=0, c;
		try{
			c = a/b;
		}catch (Exception e){
			System.out.println(e);
		}
	}
}