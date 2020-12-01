import java.awt.*;
import java.awt.event.*;

class TestEvent7 extends Frame implements MouseListener {
	Label state;

	TestEvent7() {
		setSize(300, 300);
		setVisible(true);
		setLayout(new FlowLayout());

		Button checkButton = new Button("CHECK");
		checkButton.addMouseListener(this);
		state = new Label();

		add(checkButton);
		add(state);
	}

	public void mouseClicked(MouseEvent me) {
		state.setText("Mouse Clicked");
		System.out.println("Clicked");
	}

	public void mouseEntered(MouseEvent me) {
		state.setText("Mouse Entered");
		System.out.println("Entered");
	}

	public void mouseExited(MouseEvent me) {
		state.setText("Mouse Exited");
		System.out.println("Exited");
	}

	public void mousePressed(MouseEvent me) {
		state.setText("Mouse Pressed");
		System.out.println("Pressed");
	}

	public void mouseReleased(MouseEvent me) {
		state.setText("Mouse Released");
		System.out.println("Released");
	}

	public static void main(String []ar) {
		new TestEvent7();
	}
}

