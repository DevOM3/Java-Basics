import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Event12 extends Applet implements AdjustmentListener {
	Scrollbar r;
	Scrollbar g;
	Scrollbar b;

	public void init(){
		setVisible(true);
		setLayout(null);

		r = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);
		r.setSize(555, 11);
		r.setLocation(10, 10);
		r.addAdjustmentListener(this);
		g = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);
		g.setSize(555, 11);
		g.setLocation(10, 30);
		g.addAdjustmentListener(this);
		b = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);
		b.setSize(555, 11);
		b.setLocation(10, 50);
		b.addAdjustmentListener(this);

		add(r);
		add(g);
		add(b);
	}
	public void paint(Graphics gr){
		gr.setColor(new Color(r.getValue(), g.getValue(), b.getValue()));
		gr.fillRect(100, 200, 200, 400);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae) {
		repaint();
	}
}

/*
<applet code="Event12" width="300" height="300">
</applet>
*/
