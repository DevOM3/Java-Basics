import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JRadioTest extends JFrame implements ActionListener {
	JLabel genderLabel;
	JLabel mealLabel;
	ButtonGroup genderGroup;
	ButtonGroup mealGroup;
	JRadioButton male;
	JRadioButton female;
	JRadioButton breakfast;
	JRadioButton lunch;
	JRadioButton dinner;	

	JRadioTest() {
		Container container = getContentPane();
		container.setLayout(new FlowLayout());

		male = new JRadioButton("Male");
		female = new JRadioButton("Female");
		genderGroup = new ButtonGroup();
		genderGroup.add(male);
		genderGroup.add(female);		

		breakfast = new JRadioButton("Breakfast");
		lunch = new JRadioButton("Lunch");
		dinner = new JRadioButton("Dinner");	
		ButtonGroup mealGroup = new ButtonGroup();
		mealGroup.add(breakfast);
		mealGroup.add(lunch);
		mealGroup.add(dinner);

		Button submit = new Button("SUBMIT");
		submit.addActionListener(this);

		genderLabel = new JLabel("Selected Gender: ");
		mealLabel = new JLabel("Selected Meal: ");

		container.add(male);
		container.add(female);
		container.add(breakfast);
		container.add(lunch);
		container.add(dinner);
		container.add(submit);
		container.add(genderLabel);
		container.add(mealLabel);		
	}

	public void actionPerformed(ActionEvent ae) {
		String gender = "";
		String meal = "";

		/*
		if(genderGroup.getSelection().equals(male)){
			gender = "Male";
		}
		else {
			gender = "Female";
		}

		if(mealGroup.getSelection().equals(breakfast)){
			meal = "Breakfast";
		}
		else if(mealGroup.getSelection().equals(lunch)){
			meal = "Lunch";
		}
		else {
			meal = "Dinner";
		}
		
		genderLabel.setText(genderLabel.getText() + gender);
		mealLabel.setText(mealLabel.getText() + meal);
		*/
		if(male.isSelected()){
			gender = "Male";
		}
		else {
			gender = "Female";
		}
		genderLabel.setText(genderLabel.getText() + gender);

		if(breakfast.isSelected()){
			meal = "Breakfast";
		}
		else if(lunch.isSelected()){
			meal = "Lunch";
		}
		else {
			meal = "Dinner";
		}
		mealLabel.setText(mealLabel.getText() + meal);
		

		
	}

	
	public static void main(String []ar) {
		JRadioTest jrt = new JRadioTest();
		jrt.setSize(300, 300);
		jrt.setVisible(true);
	}	
}