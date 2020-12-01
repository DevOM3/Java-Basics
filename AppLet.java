/*
<applet code="AppTrial.class" width="300" height="400">
</applet>
*/

import java.awt.*;
import java.applet.*;

class AppTrial extends Applet{
	public void paint(Graphics g){
		Color c = new Color(1, 1, 1);
		g.setColor(c);
		g.drawLine(30, 60, 30, 40);
	}
}

