import java.awt.*;
import java.awt.event.*;

class Event4 extends Frame implements ActionListener {
TextArea textArea;
int fontPlain = 0;
int fontBold = 1;
int fontItalic = 2;
int currentFont = 0;
int fontSize = 18;
String text;
Scrollbar r;
Scrollbar g;
Scrollbar b;
int rc;
int gc;
int bc;

Event4(){
	MenuBar mb = new MenuBar();
	
	Menu textMenu = new Menu("Text");
	Menu fontMenu = new Menu("Font");
	Menu colorMenu = new Menu("Color");
	Menu editMenu = new Menu("Edit");

	MenuItem clear = new MenuItem("Clear");
	clear.addActionListener(this);
	MenuItem upperCase = new MenuItem("UpperCase");	
	upperCase.addActionListener(this);
	MenuItem lowerCase = new MenuItem("LowerCase");
	lowerCase.addActionListener(this);
	textMenu.add(clear);
	textMenu.add(upperCase);
	textMenu.add(lowerCase);
	

	MenuItem bold = new MenuItem("BOLD");
	bold.addActionListener(this);
	MenuItem italic = new MenuItem("ITALIC");
	italic.addActionListener(this);
	MenuItem plain = new MenuItem("PLAIN");
	plain.addActionListener(this);
	MenuItem sizep = new MenuItem("SIZE++");
	sizep.addActionListener(this);
	MenuItem sizem = new MenuItem("SIZE--");
	sizem.addActionListener(this);
	fontMenu.add(bold);
	fontMenu.add(italic);
	fontMenu.add(plain);
	fontMenu.add(sizep);
	fontMenu.add(sizem);

	MenuItem fontColor = new MenuItem("Font Color");
	fontColor.addActionListener(this);
	MenuItem backColor = new MenuItem("Back Color");
	backColor.addActionListener(this);
	colorMenu.add(fontColor);
	colorMenu.add(backColor);

	MenuItem newM = new MenuItem("New");
	newM.addActionListener(this);	
	MenuItem cut = new MenuItem("Cut");
	cut.addActionListener(this);
	MenuItem copy = new MenuItem("Copy");
	copy.addActionListener(this);
	MenuItem paste = new MenuItem("Paste");
	paste.addActionListener(this);
	editMenu.add(newM);
	editMenu.add(cut);
	editMenu.add(copy);
	editMenu.add(paste);
	
	setSize(500, 500);
	setVisible(true);

	Font textFont = new Font("Arial", Font.PLAIN, 18);
	textArea = new TextArea();
	textArea.setFont(textFont);

	mb.add(textMenu);
	mb.add(fontMenu);
	mb.add(colorMenu);
	mb.add(editMenu);
	setMenuBar(mb);
	add(textArea);
	
}

public void actionPerformed(ActionEvent ae) {
	Font textFont;
	String label = ae.getActionCommand();
	
	switch(label){
		case "Clear": textArea.setText("\0");
			      break;
		case "UpperCase": textArea.setText(textArea.getText().toUpperCase());
				  break;
		case "LowerCase": textArea.setText(textArea.getText().toLowerCase());
				  break;
		case "BOLD": textFont = new Font("Arial", Font.BOLD, fontSize);
			     currentFont = fontBold;
			     textArea.setFont(textFont);
			     break;
		case "ITALIC": textFont = new Font("Arial", Font.ITALIC, fontSize);
			       currentFont = fontItalic;
			       textArea.setFont(textFont);
			       break;
		case "PLAIN": textFont = new Font("Arial", Font.PLAIN, fontSize);
			      currentFont = fontPlain;
			      textArea.setFont(textFont);
			      break;
		case "SIZE++": textFont = new Font("Arial", currentFont, fontSize++);
			       textArea.setFont(textFont);
			       break;
		case "SIZE--": if (fontSize > 1){
                               	textFont = new Font("Arial", currentFont, fontSize--);
			       	textArea.setFont(textFont);
			       	break;
			       }
		case "Font Color": getColor("font");
			           break;
		case "Back Color": getColor("back");
			           break;
		case "New": new Event4();
			    break;
		case "Cut": text = textArea.getSelectedText();
			    textArea.setText(textArea.getText().replace(text, ""));
			    break;
		case "Copy": text = textArea.getSelectedText();
			     break;
		case "Paste": textArea.insert(text, textArea.getCaretPosition());
			      break; 
	}
}

public void getColor(String forWhom) {
	Frame f = new Frame();
	f.setSize(300, 300);
	f.setVisible(true);
	f.setLayout(null);

	r = new Scrollbar(Scrollbar.HORIZONTAL, rc, 1, 0, 256);
	r.setBackground(Color.red);
	r.addAdjustmentListener(new ForColor(forWhom));
	g = new Scrollbar(Scrollbar.HORIZONTAL, gc, 1, 0, 256);
	g.setBackground(Color.green);
	g.addAdjustmentListener(new ForColor(forWhom));
	b = new Scrollbar(Scrollbar.HORIZONTAL, bc, 1, 0, 256);
	b.setBackground(Color.blue);
	b.addAdjustmentListener(new ForColor(forWhom));
	
	r.setLocation(10, 50);
	r.setSize(256, 21);
	g.setLocation(10, 100);
	g.setSize(256, 21);
	b.setLocation(10, 150);
	b.setSize(256, 21);

	f.add(r);
	f.add(g);
	f.add(b);

}

class ForColor implements AdjustmentListener {
	String forWhom;

	ForColor(String forWhom) {
		this.forWhom = forWhom;
	}
	public void adjustmentValueChanged(AdjustmentEvent ae) {
		if(ae.getSource().equals(r)){
			rc = r.getValue();
		}
		else if(ae.getSource().equals(g)){
			gc = g.getValue();
		}
		else if(ae.getSource().equals(b)){
			bc = b.getValue();
		}
		if(forWhom.equals("font")){
			textArea.setForeground(new Color(rc, gc, bc));
		}
		else {
			textArea.setBackground(new Color(rc, gc, bc));
		}
	}
}

public static void main(String []ar) {
	new Event4();
}
}

