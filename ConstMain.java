class Const{
	public Const(){
		System.out.println("This is the Default Constructor !!!");
	}
	public Const(int a){
		System.out.println("This is Parametarized Constructor !!!");
	}
	public Const(Const c){
		System.out.println("This is Referential Constructor !!!");
	}
}

class ConstMain{
	public static void main(String []args){
		Const c = new Const();
		Const c1 = new Const(10);
		Const c2 = new Const(c);
	}
}