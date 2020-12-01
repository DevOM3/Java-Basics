//final classes are not inherited
final class fin{
	int a;
	public fin(){
		a = 11;
	}
}

class M{
	public static void main(String []args){
		fin f =  new fin();
		System.out.println("a = " + f.a);
	}
}
