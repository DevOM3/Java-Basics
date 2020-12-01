
import java.awt.*;
import java.awt.event.*;

// preparing card-1
class ColorPanel extends Panel
{
	public ColorPanel()
	{
		Label lb = new Label("Select Colors");
		Checkbox ch1 = new Checkbox("Red");
		Checkbox ch2 = new Checkbox("Yellow");
		Checkbox ch3 = new Checkbox("Blue");
		Checkbox ch4 = new Checkbox("Green");

		add(lb); add(ch1); add(ch2); add(ch3); add(ch4);
		// adds 4 checkboxes into panel
	}
}

// Preparing card-2
class ShapePanel extends Panel
{
	public ShapePanel()
	{
		Label lb = new Label("Select Shape");
		CheckboxGroup gr = new CheckboxGroup();
		Checkbox rb1 = new Checkbox("Circle", true, gr);
		Checkbox rb2 = new Checkbox("Rectangle", false, gr);
		Checkbox rb3 = new Checkbox("Square", false, gr);
		Checkbox rb4 = new Checkbox("Trianlge", false, gr);
		Checkbox rb5 = new Checkbox("Oval", false, gr);
		add(lb); add(rb1); add(rb2); add(rb3); add(rb4); add(rb5); 
	}
}

// Preparing card-3
class CountryPanel extends Panel
{
	public CountryPanel()
	{
		Label lb = new Label("Select Country");
		Choice ch = new Choice();
		ch.add("India");
		ch.add("Australia");
		ch.add("Bangladesh");
		ch.add("Nepal");
		ch.add("China");
		ch.add("Sri Lanka");
		add(lb); add(ch);
	}
}

// Preparing DECK panel
class DeckPanel extends Panel implements ActionListener
{
	Button btn1, btn2, btn3;
	CardLayout cl;
	
	public DeckPanel()
	{
		btn1 = new Button("Color Card");
		btn2 = new Button("Shape Card");
		btn3 = new Button("Country Card");

		cl = new CardLayout();
		setLayout(cl);

		add(new ColorPanel(), "MyColorCard");
		add(new ShapePanel(), "MyShapeCard");
		add(new CountryPanel(), "MyCountryCard");

		add(btn1); add(btn2); add(btn3);

		btn1.addActionListener(this); 
		btn2.addActionListener(this);
		btn3.addActionListener(this);		
	}

	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();
		if(s.equals("Color Card"))
		{
			// means use clicked on Color card
			// we will show "MyColorCard"
			cl.show(this, "MyColorCard");
		}
		if(s.equals("Shape Card"))
		{
			// means use clicked on Shape card
			// we will show "MyShapeCard"
			cl.show(this, "MyShapeCard");
		}
		if(s.equals("Country Card"))
		{
			// means use clicked on Country Card
			// we will show "MyCountryCard"
			cl.show(this, "MyCountryCard");
		}		
	}
}


class CardTest extends Frame
{
	public CardTest()
	{
		DeckPanel d = new DeckPanel();
		add(d);
	}
	public static void main(String ar[])
	{
		CardTest fr = new CardTest();
		fr.setSize(400,400);
		fr.setLayout(new BorderLayout());
		fr.setTitle("Demonstrating CardLayout");
		fr.setVisible(true);
	}
}
