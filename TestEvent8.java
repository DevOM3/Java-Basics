import java.awt.*;
import java.awt.event.*;

class TestEvent8 extends Frame implements ActionListener{
	TextField username;
	TextField password;

	TestEvent8() {
		setSize(300, 300);
		setLayout(new FlowLayout());
		setVisible(true);

		Font font = new Font("comicsans", Font.BOLD, 21);

		username = new TextField(21);
		username.setFont(font);
		password = new TextField(21);
		password.setEchoChar(' ');
		password.setFont(font);

		Button signin = new Button("Sign In");
		signin.addActionListener(this);

		add(username);
		add(password);
		add(signin);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String name = username.getText();
		String pass = password.getText();

		Dialog dialog = new Dialog(this, "Sign In", true);
		Label u = new Label();
		Label p = new Label();
		Label check = new Label();	
	
		dialog.add(u);
		dialog.add(p);
		dialog.add(check);

		if(name == "Om" && pass == "12345678"){
			u.setText("Username is correct");
			p.setText("Password is correct");
			check.setText("Access Granted!");
		}
		else {
			u.setText("Wrong Credentials");
			check.setText("Access Denied!");
		}
		dialog.setSize(400, 100);
		dialog.setVisible(true);
		
	} 
	
	public static void main(String []ar) {
		new TestEvent8();
	}
}
