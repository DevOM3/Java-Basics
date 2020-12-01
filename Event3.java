import java.awt.*;
import java.awt.event.*;

class Event3Frame1 extends Frame implements ActionListener {
	Event3Frame1() {
		setSize(300, 300);
		setVisible(true);
		setLayout(new FlowLayout());

		Button frame2 = new Button("Frame 2");
		frame2.addActionListener(this);

		Button frame3 = new Button("Frame 3");
		frame3.addActionListener(this);

		add(frame2);
		add(frame3);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getActionCommand().equals("Frame 2")){
			new Event3Frame2();
		}
		else{
			new Event3Frame3();
		}
	}
}

class Event3Frame2 extends Frame implements ActionListener {
	Event3Frame2() {
		setSize(300, 300);
		setVisible(true);
		setLayout(new FlowLayout());

		Button frame1 = new Button("Frame 1");
		frame1.addActionListener(this);

		Button frame3 = new Button("Frame 3");
		frame3.addActionListener(this);

		add(frame1);
		add(frame3);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getActionCommand().equals("Frame 1")){
			new Event3Frame1();
		}
		else{
			new Event3Frame3();
		}
	}
}

class Event3Frame3 extends Frame implements ActionListener {
	Event3Frame3() {
		setSize(300, 300);
		setVisible(true);
		setLayout(new FlowLayout());

		Button frame2 = new Button("Frame 2");
		frame2.addActionListener(this);

		Button frame1 = new Button("Frame 1");
		frame1.addActionListener(this);

		add(frame1);
		add(frame2);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getActionCommand().equals("Frame 1")){
			new Event3Frame1();
		}
		else{
			new Event3Frame2();
		}
	}
}

class Event3 {
	public static void main(String []ar) {
		new Event3Frame1();
	}
}