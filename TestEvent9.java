import java.awt.*;
import java.awt.event.*;

class TestEvent9 extends Frame implements MouseListener {
	TextField one;
	TextField two;
	TextField add;
	TextField subtract;
	TextField multiply;
	TextField divide;

	TestEvent9() {
		setSize(400, 400);
		setLayout(new BorderLayout());
		setVisible(true);

		Font font = new Font("comicsans", Font.BOLD, 21);

		Panel north = new Panel();
		one = new TextField(21);
		one.setFont(font);
		two = new TextField(21);
		two.setFont(font);
		north.add(one);
		north.add(two);

		Button button = new Button("PERFORM");
		button.addMouseListener(this);

		Panel south = new Panel();
		add = new TextField(21);
		add.setFont(font);		
		subtract = new TextField(21);
		subtract.setFont(font);
		multiply = new TextField(21);
		multiply.setFont(font);
		divide = new TextField(21);
		divide.setFont(font);
		south.add(add);
		south.add(subtract);
		south.add(multiply);
		south.add(divide);
	
		add(north, BorderLayout.NORTH);
		add(button);
		add(south, BorderLayout.SOUTH);	
	}

	public void mouseEntered(MouseEvent me) {
		if (one != null && two != null){
			add.setText("" + (Integer.parseInt(one.getText()) + Integer.parseInt(two.getText())));
			subtract.setText("" + (Integer.parseInt(one.getText()) - Integer.parseInt(two.getText())));
			multiply.setText("" + (Integer.parseInt(one.getText()) * Integer.parseInt(two.getText())));
			divide.setText("" + (Integer.parseInt(one.getText()) / Integer.parseInt(two.getText())));
		}
	}
	public void mouseExited(MouseEvent me) {
		one.setText("");
		two.setText("");
		add.setText("");
		subtract.setText("");
		multiply.setText("");
		divide.setText("");
	}
	
	public void mouseReleased(MouseEvent me) {
	}

	public void mousePressed(MouseEvent me) {
	}


	public void mouseClicked(MouseEvent me) {
	}
	public static void main(String []ar) {
		new TestEvent9();
	}
}
