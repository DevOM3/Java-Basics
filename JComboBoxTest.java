import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class JComboBoxTest extends JFrame {
	JComboBoxTest() {
		Container c = getContentPane();
		
		JComboBox jcb = new JComboBox();
		jcb.addItem("1");
		jcb.addItem("2");
		jcb.addItem("3");
		jcb.showPopup();	

		c.add(jcb);
	}

	public static void main(String []ar) {
		JComboBoxTest jcbt = new JComboBoxTest();
		jcbt.setLayout(new FlowLayout());
		jcbt.setSize(300, 300);
		jcbt.setVisible(true);
	}
}
