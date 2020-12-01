import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Event13 extends Applet implements AdjustmentListener {
	Scrollbar sizeChanger;

	public void init(){
		setVisible(true);
		setLayout(null);

		sizeChanger = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 100);
		sizeChanger.setSize(1000, 21);
		sizeChanger.setLocation(20, 500);
		sizeChanger.addAdjustmentListener(this);

		add(sizeChanger);
	}
	public void paint(Graphics gr){
		gr.fillRect(100, 50, 400 + sizeChanger.getValue(), 100 + sizeChanger.getValue());
	}
	public void adjustmentValueChanged(AdjustmentEvent ae) {
		repaint();
	}
}

/*
<applet code="Event13" width="300" height="300">
</applet>
*/
