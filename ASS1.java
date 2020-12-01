import java.awt.*;

class ASS1 extends Frame{
	public ASS1() {
		this.setSize(600, 700);
		this.setLayout(null);
		this.setVisible(true);
		
		Label label = new Label("Log In");
		label.setLocation(220, 30);
		label.setSize(400, 60);
		label.setFont(new Font("comicsans", Font.BOLD, 51));

		Panel panel = new Panel();
		panel.setLayout(null);	
		panel.setLocation(50, 100);
		panel.setSize(500, 500);

		Label usernameLabel = new Label("Username");
		usernameLabel.setLocation(25, 20);
		usernameLabel.setSize(120, 30);
		usernameLabel.setFont(new Font("comicsans", 0, 21));

		TextField username = new TextField(221);
		username.setLocation(150, 20);
		username.setSize(300, 30);

		Label passwordLabel = new Label("Password");
		passwordLabel.setLocation(25, 80);
		passwordLabel.setSize(120, 30);
		passwordLabel.setFont(new Font("comicsans", 0, 21));		

		TextField password = new TextField(221);
		password.setLocation(150, 80);
		password.setSize(300, 30);

		Button reset = new Button("Reset");
		reset.setLocation(40, 150);
		reset.setSize(150, 40);	
		reset.setFont(new Font("comicsans", 0, 21));

		Button submit = new Button("Submit");
		submit.setLocation(300, 150);
		submit.setSize(100, 40);	
		submit.setFont(new Font("comicsans", 0, 21));	

		panel.add(usernameLabel);
		panel.add(username);
		panel.add(passwordLabel);
		panel.add(password);
		panel.add(reset);
		panel.add(submit);

		this.add(label);
		this.add(panel);
	}

	public static void main(String []args) {
		ASS1 ass1 = new ASS1();
	}
}


