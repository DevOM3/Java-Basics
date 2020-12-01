class First{
	public First(){
	
	}
	public First(Second s){
		s.sayHi();		
	}
}

class Second{
	public static void main(String []ar){
		First f = new First(new Second());
	}
	
	public void sayHi(){
		System.out.println("Hello hi");
	}
}