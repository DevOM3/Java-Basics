import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.applet.Applet;

public class ClickToCircle extends Applet {
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
			g.drawOval(me.getX(), me.getY(), radius, radius);
		}
	}	
}

/*
<applet code="ClickToCircle" width="1000" height="1000">
</applet>
*/
