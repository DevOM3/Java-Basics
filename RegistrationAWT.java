import java.awt.*;

class RegistrationAWT extends Frame{
	public RegistrationAWT(){
		this.setLayout(null);
		this.setBackground(Color.BLACK);
		this.setTitle("Sign Up Form");
		this.setResizable(false);
		this.setSize(1920, 1080);

		Font font = new Font("comicsans", Font.PLAIN, 21);
		
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

		Label emailLabel = new Label("E-mail ID: ");
		emailLabel.setFont(font);
		emailLabel.setForeground(Color.WHITE);
		emailLabel.setBackground(Color.BLACK);
		emailLabel.setLocation(10, 150);
		emailLabel.setSize(150, 20);

		TextField email = new TextField(20);
		email.setFont(font);
		email.setForeground(Color.WHITE);
		email.setBackground(Color.BLACK);
		email.setLocation(175, 150);
		email.setSize(500, 30);

		Label phoneLabel = new Label("Phone no.: ");
		phoneLabel.setFont(font);
		phoneLabel.setForeground(Color.WHITE);
		phoneLabel.setBackground(Color.BLACK);
		phoneLabel.setLocation(10, 200);
		phoneLabel.setSize(150, 20);

		TextField phone = new TextField(20);
		phone.setFont(font);
		phone.setForeground(Color.WHITE);
		phone.setBackground(Color.BLACK);
		phone.setLocation(175, 250);
		phone.setSize(500, 30);

		Label genderLabel = new Label("Gender: ");
		genderLabel.setFont(font);
		genderLabel.setForeground(Color.WHITE);
		genderLabel.setBackground(Color.BLACK);
		genderLabel.setLocation(10, 250);
		genderLabel.setSize(150, 20);

		CheckboxGroup gender = new CheckboxGroup();
		Checkbox male = new Checkbox("Male", true, gender);
		male.setFont(font);
		male.setForeground(Color.WHITE);
		male.setBackground(Color.BLACK);
		male.setLocation(175, 250);
		male.setSize(50, 20);

		Checkbox female = new Checkbox("Female", false, gender);
		female.setFont(font);
		female.setForeground(Color.WHITE);
		female.setBackground(Color.BLACK);
		female.setLocation(250, 250);
		female.setSize(50, 20);

		Label subjects = new Label("Subjects: ");
		subjects.setFont(font);
		subjects.setForeground(Color.WHITE);
		subjects.setBackground(Color.BLACK);
		subjects.setLocation(10, 300);
		subjects.setSize(150, 20);

		Checkbox c = new Checkbox("C");
		c.setFont(font);
		c.setForeground(Color.WHITE);
		c.setBackground(Color.BLACK);
		c.setLocation(10, 330);
		c.setSize(150, 20);

		Checkbox cpp = new Checkbox("C++");
		cpp.setFont(font);
		cpp.setForeground(Color.WHITE);
		cpp.setBackground(Color.BLACK);
		cpp.setLocation(10, 360);
		cpp.setSize(150, 20);

		Checkbox python = new Checkbox("Python");
		python.setFont(font);
		python.setForeground(Color.WHITE);
		python.setBackground(Color.BLACK);
		python.setLocation(10, 390);
		python.setSize(150, 20);

		Checkbox java = new Checkbox("Java");
		java.setFont(font);
		java.setForeground(Color.WHITE);
		java.setBackground(Color.BLACK);
		java.setLocation(10, 420);
		java.setSize(150, 20);

		Checkbox advancedJava = new Checkbox("Advanced Java");
		advancedJava.setFont(font);
		advancedJava.setForeground(Color.WHITE);
		advancedJava.setBackground(Color.BLACK);
		advancedJava.setLocation(10, 450);
		advancedJava.setSize(200, 20);

		Label addressLabel = new Label("Address: ");
		addressLabel.setFont(font);
		addressLabel.setForeground(Color.WHITE);
		addressLabel.setLocation(10, 500);
		addressLabel.setSize(150, 20);

		TextArea address = new TextArea();
		address.setFont(font);
		address.setForeground(Color.WHITE);
		address.setBackground(Color.BLACK);
		address.setLocation(175, 500);
		address.setSize(500, 100);

		Button submit = new Button("Submit");
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.setLocation(10, 600);
		submit.setSize(75, 30);

		add(nameLabel);
		add(name);
		add(lastNameLabel);
		add(lastName);
		add(emailLabel);
		add(email);
		add(phoneLabel);
		add(phone);
		add(genderLabel);
		add(male);
		add(female);
		add(subjects);
		add(c);
		add(cpp);
		add(python);
		add(java);
		add(advancedJava);
		add(addressLabel);		
		add(address);		
		add(submit);

		setVisible(true);
	}
	
	public static void main(String []args){
		new RegistrationAWT();
	}
}