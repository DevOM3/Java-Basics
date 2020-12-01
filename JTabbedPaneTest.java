import java.awt.*;
import javax.swing.*;

class ColorPanel extends JPanel {
	public ColorPanel(){
		JLabel label = new JLabel("Selecyt Color");
		JComboBox jComboBox = new JComboBox();
		jComboBox.addItem("Red");
		jComboBox.addItem("Green");
		jComboBox.addItem("Blue");
		jComboBox.addItem("White");
		jComboBox.addItem("Black");
		jComboBox.addItem("Purple");

		add(label);
		add(jComboBox);
	}
}

class ShapePanel extends JPanel {
	public ShapePanel() {
		JLabel label = new JLabel("Select Shape"); 
		JCheckBox c1 = new JCheckBox("Circle");	 
		JCheckBox c2= new JCheckBox("Square"); 
		JCheckBox c3 = new JCheckBox("Triangle"); 
		JCheckBox c4 = new JCheckBox("Rectangle"); 
		
		add(label);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
	}
}

class CountryPanel extends JPanel {
	public CountryPanel() {
		JLabel label = new JLabel("Select Country");

		JButton b1 = new JButton("India");
		JButton b2 = new JButton("UK");
		JButton b3 = new JButton("USA");
		JButton b4 = new JButton("Japan");
		JButton b5 = new JButton("China");
	
		add(label);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
	}
}

class JTabbedPaneTest extends JFrame {
	JTabbedPaneTest() {
		Container container = getContentPane();

		JTabbedPane jTabbedPane = new JTabbedPane();
		jTabbedPane.addTab("Colors", new ColorPanel());
		jTabbedPane.addTab("Shapes", new ShapePanel());
		jTabbedPane.addTab("Countries", new CountryPanel());

		container.add(jTabbedPane);
	}


	public static void main(String []ar) {
		JTabbedPaneTest jtpt = new JTabbedPaneTest();
		jtpt.setVisible(true);
		jtpt.setSize(500, 500);
		jtpt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}
