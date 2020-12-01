import javax.swing.*;
import java.net.*;
import java.awt.*; 

class JCB extends JFrame {
	JCB() {
		Container container = getContentPane();
	
		JCheckBox _1 = new JCheckBox("One");
		JCheckBox _2 = new JCheckBox("Two");
		JCheckBox _3 = new JCheckBox("Three");

		//container.add(_1);
		//container.add(_2);
		//container.add(_3);
		try{
		JCheckBox _4 = new JCheckBox(new ImageIcon(new URL("https://images-na.ssl-images-amazon.com/images/I/51Wynn0s1DL._AC_.jpg")));
		container.add(_4);
		}catch(MalformedURLException mue) {}
	}

	public static void main(String []ar) {
		JCB jcb = new JCB();
		jcb.setVisible(true);
		jcb.setLayout(new FlowLayout());
		jcb.setSize(300, 300);
		jcb.setTitle("JCheckBox");
		jcb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
