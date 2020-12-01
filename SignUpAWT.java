import java.awt.*;

class SignUpGUI extends Frame{
	public SignUpGUI() {
		this.setLayout(null);
		this.setBackground(Color.BLACK);
		this.setTitle("Sign Up Form");
		this.setResizable(false);
		this.setSize(700, 325);

		Font font = new Font("comicsans", Font.PLAIN, 24);
		
		Label nameLabel = new Label("First Name: ");
		nameLabel.setFont(font);
		nameLabel.setForeground(Color.WHITE);
		nameLabel.setLocation(10, 50);
		nameLabel.setSize(150, 20);
		
		TextField name = new TextField(20);
		name.setFont(font);
		name.setForeground(Color.WHITE);
		name.setBackground(Color.BLACK);
		name.setLocation(175, 50);
		name.setSize(500, 35);

		Label lastNameLabel = new Label("Last Name: ");
		lastNameLabel.setFont(font);
		lastNameLabel.setForeground(Color.WHITE);
		lastNameLabel.setLocation(10, 100);
		lastNameLabel.setSize(150, 20);
		
		TextField lastName = new TextField(20);
		lastName.setFont(font);
		lastName.setForeground(Color.WHITE);
		lastName.setBackground(Color.BLACK);
		lastName.setLocation(175, 100);
		lastName.setSize(500, 35);

		Label addressLabel = new Label("Address: ");
		addressLabel.setFont(font);
		addressLabel.setForeground(Color.WHITE);
		addressLabel.setLocation(10, 150);
		addressLabel.setSize(150, 20);

		TextArea address = new TextArea();
		address.setFont(font);
		address.setForeground(Color.WHITE);
		address.setBackground(Color.BLACK);
		address.setLocation(175, 150);
		address.setSize(500, 100);

		Button submit = new Button("Submit");
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.setLocation(10, 275);
		submit.setSize(75, 30);

		add(nameLabel);
		add(name);
		add(lastNameLabel);
		add(lastName);
		add(addressLabel);		
		add(address);		
		add(submit);

		setVisible(true);
	}
}

public class SignUpAWT{
	public static void main(String []args){
		SignUpGUI signUpGUI = new SignUpGUI();
	}
}

