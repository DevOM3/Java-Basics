import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.applet.Applet;

public class ClickToCircleAndLine extends Applet {
	Graphics g;

	public void init() {
		g = getGraphics();
		this.addMouseListener(new LineDrawer());
	}
	
	public class LineDrawer extends MouseAdapter  {
		public void mouseClicked(MouseEvent me) {
			Random rand = new Random();
			g.setColor(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
			int radius = rand.nextInt(51);
			g.drawOval(me.getX() - radius, me.getY() - radius, radius, radius);
			g.setColor(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
			g.drawLine(250, 250, me.getX(), me.getY());
		}
	}	
}

/*
<applet code="ClickToCircleAndLine" width="500" height="500">
</applet>
*/
