import java.awt.*;
import java.awt.event.*;

class TestEvent2 extends Frame implements ActionListener {
	Choice choice;
	Button find;
	TextField selected;

	TestEvent2() {
		setSize(300, 300);
		setVisible(true);
		setLayout(new FlowLayout());

		Font font = new Font("comicsans", Font.BOLD, 21);

		choice = new Choice();
		choice.add("India");
		choice.add("Pakistan");
		choice.add("Australia");
		choice.add("Austria");
		choice.add("Canada");
		choice.add("China");
		choice.add("Japan");
		choice.add("Malasia");
		choice.setFont(font);

		find = new Button("Find");
		find.addActionListener(this);

		selected = new TextField(25);
		selected.setFont(font);
		selected.setEditable(false);

		add(choice);
		add(find);
		add(selected);
	}
	public void actionPerformed(ActionEvent ae){
				selected.setText(choice.getSelectedItem());
			}
	public static void main(String ar[]){
		TestEvent2 testevent2 = new TestEvent2();
	}
}
