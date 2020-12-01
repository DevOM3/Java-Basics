class final_test{
	//final methods cannot be overrided
	public final_test(){
		System.out.println("Constructor");
	}
	public final void fin(){
		System.out.println("Final method ");
	}
}

class fin_M extends final_test{
	static void fin(){
		System.out.println("Final methon ");
	}
	public static void main(String []ar){
		final_test ft = new final_test();
		ft.fin();
	}
}