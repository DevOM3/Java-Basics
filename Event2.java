import java.awt.*;
import java.util.Random;
import java.awt.event.*;
import java.applet.Applet;

public class Event2 extends Applet {
	Graphics g;

	public void init() {
		g = getGraphics();
		this.addMouseListener(new LineDrawer());
	}
	
	public class LineDrawer extends MouseAdapter  {
		public void mouseClicked(MouseEvent me) {
			Random rand = new Random();
			g.setColor(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
			g.drawLine(250, 250, me.getX(), me.getY());
		}
	}	
}

/*
<applet code="Event2" width="500" height="500">
</applet>
*/
