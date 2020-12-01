import java.awt.*;
import java.awt.event.*;

class TestEvent5 extends Frame implements ActionListener, TextListener {
	TextField type;
	TextField reflect;

	TestEvent5(){
		setSize(300, 200);
		setVisible(true);
		setLayout(new FlowLayout());

		Font font = new Font("comicsans", Font.BOLD, 21);
		
		type = new TextField(21);
		type.setFont(font);

		reflect = new TextField(21);
		reflect.setFont(font);

		Button reset = new Button("RESET");
		reset.setFont(font);
		reset.addActionListener(this);
		type.addTextListener(this);	

		add(type);
		add(reflect);
		add(reset);
	}
	public void actionPerformed(ActionEvent ae){
		type.setText("");
		reflect.setText("");
	}
	public void textValueChanged(TextEvent te){
		reflect.setText(type.getText());
	}
	public static void main(String []ar){
		new TestEvent5();
	}
}
