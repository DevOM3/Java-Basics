import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/*
<applet code="TestEvent10" width="300" height="300">
</applet>
*/

public class TestEvent10 extends Applet implements ActionListener {
	TextField one;
	TextField two;
	TextField three;

	public void init() {	
		Font font = new Font("comicsans", Font.BOLD, 21);
	
		one = new TextField(21);
		one.setFont(font);
		two = new TextField(21);
		two.setFont(font);
		three = new TextField(21);
		three.setFont(font);

		Button apply = new Button("APPLY");
		apply.addActionListener(this);

		add(one);
		add(two);
		add(three);
		add(apply);
	}
	public void paint(Graphics g) {
		// creating rectangle		
		int red = !one.getText().equals("") ? (Integer.parseInt(one.getText())) : 255;
		int green = !two.getText().equals("") ? (Integer.parseInt(two.getText())) : 255;
		int blue = !three.getText().equals("") ? (Integer.parseInt(three.getText())) : 255;

		System.out.println("" + red + "" + green + "" + blue);
		g.setColor(new Color(red, green, blue));
		g.fillRect(100, 100, 200, 300);
	}
	public void actionPerformed(ActionEvent ae) {
		repaint();
	}	
}
                                                                                                                                                                                                                                                                                                                                                                                                  