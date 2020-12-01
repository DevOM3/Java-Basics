class First{
	public First(){
		System.out.println("First");
	}
}

class Sec extends First{
	public Sec(){
		System.out.println("Sec");
	}
}

class Th extends Sec{
	public Th(){
		System.out.println("Thirt");
	}
}


class Inh{
	public static void main(String []args){
		Th t = new Th();
	}
}