import javax.swing.*;

class JFirst extends JFrame {
	JButton btn;

	JFirst() {
		btn = new JButton("Button");
		add(btn);
	}
	public static void main(String []ar) {
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setSize(300, 300);
		jf.setLayout(new java.awt.FlowLayout());
	}
}