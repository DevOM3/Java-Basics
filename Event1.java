import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Event1 extends Applet {
	public int cnt = 0;
	public int x, y;

	public void init() {
		this.addMouseListener(new MousePositionNotifier());
		this.addMouseMotionListener(new MousePositionNotifier());
	}

	public void paint(Graphics g){
		g.drawLine(250, 250, x, y);
	}
	
	public class MousePositionNotifier extends MouseAdapter implements MouseMotionListener  {
		public void mouseClicked(MouseEvent me) {
			x = me.getX();
			y = me.getY();
			repaint();
			cnt++;
		}
		public void mouseDragged(MouseEvent me){}
		public void mouseMoved(MouseEvent me){
			showStatus("Lines: " + cnt + "\tPoints: " + x + ", " + y + "px\tPos: " + me.getX() + ", " + me.getY() + "px");
		}
	}	
}

/*
<applet code="Event1" width="500" height="500">
</applet>
*/
