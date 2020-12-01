import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class JTF extends JFrame implements ActionListener {
	JTextField no1;
	JTextField no2;
	JTextField sum;		

	JTF() {
		Container container = getContentPane();
		container.setLayout(null);

		JLabel no1Label = new JLabel("First number  : ");
		no1Label.setSize(150, 21);
		no1Label.setLocation(51, 51);
		JLabel no2Label = new JLabel("Second number : ");
		no2Label.setSize(150, 21);
		no2Label.setLocation(51, 101);

		no1 = new JTextField(11);
		no1.setSize(150, 21);
		no1.setLocation(200, 51);
		no2 = new JTextField(11);
		no2.setSize(150, 21);
		no2.setLocation(200, 101);
		sum = new JTextField("0", 11);
		sum.setSize(150, 21);
		sum.setLocation(200, 151);
		sum.setEditable(false);		

		JButton add = new JButton("Add");
		add.setSize(50, 21);
		add.setLocation(200, 201);
		add.addActionListener(this);
		
		container.add(no1Label);
		container.add(no1);
		container.add(no2Label);
		container.add(no2);
		container.add(sum);
		container.add(add);
	}

	public void actionPerformed(ActionEvent ae) {
		if(no1.getText() != "" && no2.getText() != ""){
			sum.setText("" + (Integer.parseInt(no1.getText()) + Integer.parseInt(no2.getText())));
			no1.setText("\0");
			no2.setText("\0");
		}
	}

	public static void main(String []ar) {
		JTF jtf = new JTF();
		jtf.setSize(300, 300);
		jtf.setVisible(true);
		jtf.setTitle("Test Swing");
	}
}
