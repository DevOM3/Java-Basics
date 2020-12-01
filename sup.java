class One{
	public One(int a){
		System.out.println(a);
	}
}

class Two extends One{
	public Two(int a, int b){
		super(3);
		System.out.println(a);
	}
}

class Three extends Two{
	public Three(int a, int b, int c){
		super(2, 3);
		System.out.println(a);
	}
}

class Sup{
	public static void main(String []args){
		Three th = new Three(1, 2, 3);
	}
}