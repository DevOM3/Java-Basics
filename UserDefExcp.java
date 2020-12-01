class MyExcp extends Exception{
	String str;
	public MyExcp(){
		str = "My Exception Occured";
	}

	public String toString(){
		return str;
	}
}

class UserDefExcp{
	public static void main(String []ar){
		try{
			throw new MyExcp();
		}
		catch(MyExcp e){
			System.out.println(e);
		}
	}
}