class RNBL implements Runnable{
	public void run(){
		while(true){
			System.out.println("This is Runnable");
		}
	}
}

class RNBLTH{
	public static void main(String []ar){
		RNBL r = new RNBL();
		Thread th = new Thread(r);
		th.start();
	}
}