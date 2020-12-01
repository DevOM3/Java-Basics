import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FlagChanger extends JFrame implements ActionListener {
ImageIcon ic;
JComboBox jcb;
JLabel img;

FlagChanger (){
Container c = getContentPane();

ic = new ImageIcon("india.jpg");

img = new JLabel(ic);
img.setLocation(50, 50);
img.setSize(300, 300);

jcb = new JComboBox ();
jcb.addItem("India");
jcb.addItem("France");
jcb.addItem("China");
jcb.addItem("USA");
jcb.addItem("Nepal");
jcb.addItem("Bangladesh");
jcb.setLocation(200, 350);
jcb.setSize(100, 50);
jcb.addActionListener(this);

JLabel exit = new JLabel("EXIT");
exit.addMouseListener(new MouseAdapter() {
	public void mouseClicked(MouseEvent me){
		System.exit(0);
	}
});
exit.setLocation(50, 350);
exit.setSize(50, 50);

c.add(img);
c.add(jcb);
c.add(exit);
}

public void actionPerformed(ActionEvent ae) {
	if(jcb.getSelectedItem().equals("India")){
		ic = new ImageIcon("india.jpg");
		img.setIcon(ic);	
	}
	else if(jcb.getSelectedItem().equals("France")){
		ic = new ImageIcon("france.jpg");
		img.setIcon(ic);
	}
	else if(jcb.getSelectedItem().equals("China")){
		ic = new ImageIcon("china.jpg");
		img.setIcon(ic);
	}
	else if(jcb.getSelectedItem().equals("USA")){
		ic = new ImageIcon("usa.jpg");
		img.setIcon(ic);
	}
	else if(jcb.getSelectedItem().equals("Nepal")){
		ic = new ImageIcon("nepal.png");
		img.setIcon(ic);
	}
	else if(jcb.getSelectedItem().equals("Bangladesh")){
		ic = new ImageIcon("bangladesh.jpg");
		img.setIcon(ic);
	}
}

public static void main(String []ar){
FlagChanger fc = new FlagChanger();
fc.setSize(500,500);
fc.setVisible(true);
fc.setLayout(null);
}
}