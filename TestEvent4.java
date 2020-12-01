import java.awt.*;
import java.awt.event.*;

class TestEvent4 extends Frame implements ActionListener{
	TextField one;
	TextField two;
	Button reset;

	TestEvent4() {
		setSize(300, 200);
		setLayout(new FlowLayout());
		setVisible(true);
		
		Font font = new Font("comicsans", Font.BOLD, 21);

		one = new TextField("Enter your name here", 21);
		one.setFont(font);

		two = new TextField(21);
		two.setFont(font);
		two.setEchoChar('#');

		reset = new Button("RESET");
		reset.setBackground(Color.RED);
		reset.setForeground(Color.YELLOW);
		reset.addActionListener(this);

		add(one);
		add(two);
		add(reset);
	}
	public void actionPerformed(ActionEvent ar){
		one.setText("");
		two.setText("");
	}
	public static void main(String []ar){
		new TestEvent4();
	}
}
