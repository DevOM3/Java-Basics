import java.awt.*;
import java.awt.event.*;

class AdapterEvent extends Frame {
	AdapterEvent() {
		setVisible(true);
		setSize(300, 300);
		setLayout(new FlowLayout());

		Button bt = new Button("BUTTON");
		bt.addMouseListener(new InnerAdapterEvent());

		add(bt);		
	}
	
	class InnerAdapterEvent extends MouseAdapter {
		public void mouseEntered(MouseEvent me){
			System.out.println("Entered");
		}
	}
	public static void main(String []ar){
		new AdapterEvent();
	}
}
