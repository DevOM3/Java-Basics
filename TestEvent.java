import java.awt.*;
import java.awt.event.*;

class TestEvent extends Frame implements ActionListener {
	Button copyButton;
	TextField original;
	TextField copy;

	public TestEvent() {
		setSize(300, 300);
		setLayout(new FlowLayout());
		setVisible(true);
		
		Font font = new Font("comicsans", Font.BOLD, 21);

		original = new TextField(21);
		original.setFont(font);
		
		copyButton = new Button("Copy");
		
		copy = new TextField(21);
		copy.setFont(font);
		copy.setEditable(false);

		add(original);
		add(copyButton);
		add(copy);

		copyButton.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		copy.setText(original.getText());
		original.setText("");
	}
	public static void main(String []ar) {
		TestEvent textEvent = new TestEvent();
	}
}