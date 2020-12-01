import java.awt.*;

class AWT1 extends Frame{
	AWT1(){
		Button btn = new Button("Click me!");
		add(btn);
		setVisible(true);
	}
	public static void main(String []ar){
		AWT1 awt1 = new AWT1();
	}
}