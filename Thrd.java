class Thrd1 extends Thread{
	public void run(){
		while(true){
			System.out.println("This is thread");
		}
	}
}

class Thrd{
	public static void main(String []ar){
		Thrd1 th = new Thrd1();
		th.start();
	}
}