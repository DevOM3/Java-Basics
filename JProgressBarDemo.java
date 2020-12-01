import java.awt.*;
import javax.swing.*;

class JProgressBarDemo extends JFrame {
	JProgressBar jProgressBar;

	JProgressBarDemo() {
		Container container = getContentPane();
		container.setLayout(new FlowLayout());

		jProgressBar = new JProgressBar(0, 2000);
		jProgressBar.setStringPainted(true);		

		container.add(jProgressBar);
	}
	
	public void setProgress() {	
		int i = 0;
		
		while(i <= 1000) {	
			jProgressBar.setOrientation(SwingConstants.HORIZONTAL);
		
			jProgressBar.setValue(i);
			i = i + 20;
	
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}

			jProgressBar.setOrientation(SwingConstants.VERTICAL);

			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
	}

	public static void main(String []ar) {
		JProgressBarDemo jProgressBarDemo = new JProgressBarDemo();
		jProgressBarDemo.setSize(300, 300);
		jProgressBarDemo.setVisible(true);
		jProgressBarDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jProgressBarDemo.setProgress();
	}
}