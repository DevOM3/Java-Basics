interface Inter{
	int no = 10;
	void get_no();
}

class Main implements Inter{
	public void get_no(){
		System.out.println("No :- " + no);
	}
	public static void main(String []args){
		new Main().get_no();
	}
}