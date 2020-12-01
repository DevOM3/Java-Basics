import java.awt.*;
import java.awt.event.*;

class Event11 extends Frame implements KeyListener {
	Label lbl;

	Event11() {
		setSize(300, 300);
		setLayout(new FlowLayout());
		setVisible(true);
	
		Font font = new Font("comicsans", Font.BOLD, 21);
	
		lbl = new Label();
		lbl.setFont(font);
	
		TextField tf = new TextField(21);
		tf.setFont(font);
		tf.addKeyListener(this);

		add(tf);
		add(lbl);
	}
	public void keyPressed(KeyEvent ke) {
		lbl.setText(ke.getKeyChar() + " pressed");
	}
	public void keyReleased(KeyEvent ke) {
		lbl.setText(ke.getKeyChar() + " released");
	}
	public void keyTyped (KeyEvent ke) {
		//lbl.setText(ke.getKeyChar() + "");
	}
	public static void main(String []ar){
		new Event11();
	}
}
