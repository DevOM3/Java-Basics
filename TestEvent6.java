import java.awt.*;
import java.awt.event.*;

class TestEvent6 extends Frame implements ActionListener, TextListener {
	Panel base;
	TextField textField;
	CardLayout cardLayout;

	TestEvent6(){
		setSize(500, 500);
		setLayout(new BorderLayout());
		setVisible(true);
		
		Panel one = new Panel();
		one.add(new Label("First"));

		Panel two = new Panel();	
		two.add(new Label("Second"));

		Panel three = new Panel();
		three.add(new Label("Three"));

		Panel textPanel = new Panel();
		textPanel.setLayout(new GridLayout());
		textField = new TextField();
		textField.setFont(new Font("comicsans", Font.BOLD, 21));
		textField.addTextListener(this);
		textPanel.add(textField);

		cardLayout = new CardLayout();
		base = new Panel();
		base.setLayout(cardLayout);
		base.add(one, "one");
		base.add(two, "two");
		base.add(three, "three");

		Button previousButton = new Button("Previous");
		previousButton.addActionListener(this);
		Button oneButton = new Button("One");
		oneButton.addActionListener(this);
		Button twoButton = new Button("Two");
		twoButton.addActionListener(this);
		Button threeButton = new Button("Three");
		threeButton.addActionListener(this);
		Button nextButton = new Button("Next");
		nextButton.addActionListener(this);

		Panel northPanel = new Panel();
		northPanel.setLayout(new GridLayout());
		northPanel.add(oneButton);
		northPanel.add(twoButton);
		northPanel.add(threeButton);

		add(base);
		add(previousButton, BorderLayout.WEST);
		add(northPanel, BorderLayout.NORTH);
		add(nextButton, BorderLayout.EAST);
		add(textPanel, BorderLayout.SOUTH);
	}
	public void actionPerformed(ActionEvent ae){
		String calledBy = ae.getActionCommand();
		if(calledBy == "Previous") {
			cardLayout.previous(base);
		}
		else if(calledBy == "One") {
			cardLayout.show(base, "one");
		}
		else if(calledBy == "Two") {
			cardLayout.show(base, "two");
		}
		else if(calledBy == "Three") {
			cardLayout.show(base, "three");
		}
		else if(calledBy == "Next") {
			cardLayout.next(base);
		}
	}
	public void textValueChanged(TextEvent te){
		String text = textField.getText().toLowerCase();

		if(text.equals("previous")){
			cardLayout.previous(base);
			textField.setText("");
		}
		else if(text.equals("one")){
			cardLayout.show(base, "one");
			textField.setText("");
		}
		else if(text.equals("two")){
			cardLayout.show(base, "two");
			textField.setText("");
		}
		else if(text.equals("three")){
			cardLayout.show(base, "three");
			textField.setText("");
		}
		else if(text.equals("next")){
			cardLayout.next(base);
			textField.setText("");
		}
		else if(text.length() > 11){
			textField.setText("");
		}
	}
	public static void main(String []ar){
		new TestEvent6();
	}
}
