import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JRadioTest1 extends JFrame implements ItemListener {
	JLabel genderLabel;
	JLabel mealLabel;
	ButtonGroup genderGroup;
	ButtonGroup mealGroup;
	JRadioButton male;
	JRadioButton female;
	JRadioButton breakfast;
	JRadioButton lunch;
	JRadioButton dinner;	

	JRadioTest1() {
		Container container = getContentPane();
		container.setLayout(new FlowLayout());

		male = new JRadioButton("Male");
		male.addItemListener(this);
		female = new JRadioButton("Female");
		female.addItemListener(this);
		genderGroup = new ButtonGroup();
		genderGroup.add(male);
		genderGroup.add(female);		

		breakfast = new JRadioButton("Breakfast");
		breakfast.addItemListener(this);
		lunch = new JRadioButton("Lunch");
		lunch.addItemListener(this);
		dinner = new JRadioButton("Dinner");	
		dinner.addItemListener(this);
		ButtonGroup mealGroup = new ButtonGroup();
		mealGroup.add(breakfast);
		mealGroup.add(lunch);
		mealGroup.add(dinner);

		genderLabel = new JLabel("Selected Gender: ");
		mealLabel = new JLabel("Selected Meal: ");

		container.add(male);
		container.add(female);
		container.add(breakfast);
		container.add(lunch);
		container.add(dinner);
		container.add(genderLabel);
		container.add(mealLabel);		
	}

	public void itemStateChanged(ItemEvent ie) {
		if(ie.getSource().equals(male)){
			genderLabel.setText(genderLabel.getText() + "Male");
		}
		if(ie.getSource().equals(female)){
			genderLabel.setText(genderLabel.getText() + "Female");			
		}
		if(ie.getSource().equals(breakfast)){
			mealLabel.setText(mealLabel.getText() + "Breakfast");
		}
		if(ie.getSource().equals(lunch)){
			mealLabel.setText(mealLabel.getText() + "Lunch");	
		}
		if(ie.getSource().equals(dinner)){
			mealLabel.setText(mealLabel.getText() + "Dinner");			
		}

	}

	
	public static void main(String []ar) {
		JRadioTest1 jrt = new JRadioTest1();
		jrt.setSize(300, 300);
		jrt.setVisible(true);
	}	
}