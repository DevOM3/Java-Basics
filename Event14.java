import java.awt.*;
import java.awt.event.*;

class Event14 extends Frame {
	Label _1;
	Label _2;

	public Event14() {
		setSize(300, 300);
		setVisible(true);
		setLayout(new FlowLayout());

		Font font = new Font("comicsans", Font.BOLD, 21);

		TextField one = new TextField(21);
		one.setFont(font);
		one.addFocusListener(new FocusListener(){
			public void focusGained(FocusEvent fe) {
				_1.setText("TextField 1 got Focus");
			}

			public void focusLost(FocusEvent fe) {
				_1.setText("TextField 1 lost Focus");
			}
		});

		TextField two = new TextField(21);
		two.setFont(font);
		two.addFocusListener(new FocusListener(){
			public void focusGained(FocusEvent fe) {
				_2.setText("TextField 2 got Focus");
			}

			public void focusLost(FocusEvent fe) {
				_2.setText("TextField 2 lost Focus");
			}
		});

		_1 = new Label();
		_1.setFont(font);

		_2 = new Label();
		_2.setFont(font);
	
		add(one);
		add(two);
		add(_1);
		add(_2);
	}	

	public static void main(String []ar) {
		new Event14();
	}
}
