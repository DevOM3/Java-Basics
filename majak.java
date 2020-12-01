import java.awt.*;

class majak extends Frame{
	public majak(){
		setSize(300, 300);
		setVisible(true);
		majak2();
	}
	public void majak2(){
		majak m = new majak();
		majak3();
	}
	public void majak3(){
		majak m = new majak();
	}
	public static void main(String []ar){
		majak m = new majak();
	}

}