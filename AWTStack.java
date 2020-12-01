import java.awt.*;
import java.awt.event.*;

class AWTStack extends Frame implements ActionListener {
	TextArea ta;
	TextField tf;
	int added = 0;

	AWTStack() {
		setSize(300, 300);
		setVisible(true);
		setLayout(null);

		ta = new TextArea();
		ta.setLocation(50, 50);
		ta.setSize(111, 251);
		tf = new TextField(7);
		tf.setLocation(221, 50);
		tf.setSize(51, 21);

		Button push = new Button("PUSH");
		push.setLocation(221, 111);
		push.setSize(51, 21);
		push.addActionListener(this);
		Button pop = new Button("POP");
		pop.setLocation(221, 151);
		pop.setSize(51, 21);
		pop.addActionListener(this);

		add(ta);
		add(tf);
		add(push);
		add(pop);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String label = ae.getActionCommand();

		if(label.equals("PUSH")){
			if(added < 10){
				ta.insert(tf.getText() + "\n", 0);
				tf.setText("\0");
				added++;
			}
		}
		else{
			if(added > 0){	
				String[] popArray = ta.getText().split("\\n");
				ta.setText("\0");
				int cnt = 0;
				for(String i: popArray){
					if(cnt != 0){
						ta.append(i + "\n");
					}
					cnt++;
				}
				added--;
			}
		}
	}

	public static void main(String []ar) {
		new AWTStack();
	}
}
