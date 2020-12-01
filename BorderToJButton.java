import java.awt.*;
import javax.swing.*;

class BorderToJButton extends JFrame {
	BorderToJButton() {
		Container c = getContentPane();
		c.setLayout(null);

		JButton addBtn = new JButton("+");
    		addBtn.setBounds(100, 100, 30, 25);
    		addBtn.setBorder(new RoundedBorder(10)); //10 is the radius
    		addBtn.setForeground(Color.RED);
				

		c.add(addBtn);
	}

	public static void main(String []ar) {
		BorderToJButton btjb = new BorderToJButton();
		btjb.setVisible(true);
		btjb.setSize(500, 400);
	}
}