import java.awt.*;
import javax.swing.*;

class JTableDemo extends JFrame{
	JTableDemo() {
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		String heading[] = {"Name", "Class", "Age"};
		String data[][] = {
					{"Om", "TY CO", "17"},
					{"Bhargavi", "Third", "8"},
					{"Abhishek", "12th", "17"},
					{"Ajay", "TY CO", "19"},
					{"Dhananjay", "TY CO", "18"},
				  };
		
		JTable jTable = new JTable(data, heading);

		add(jTable);
	}

	public static void main(String []ar) {
		JTableDemo jTableDemo = new JTableDemo();
		jTableDemo.setSize(500, 500);
		jTableDemo.setVisible(true);
		jTableDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
}
