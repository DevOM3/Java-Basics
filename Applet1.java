import java.applet.Applet;
import java.awt.Graphics;

class Applet1 extends Applet{
	public void paint(Graphics g){
		g.drawString("Welcome", 150, 150);
	}
}
/*
<applet code="Applet1.class" width="300" height="300">
</applet>
*/