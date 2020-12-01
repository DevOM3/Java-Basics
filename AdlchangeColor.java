import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="AdlchangeColor" width= "500"  height= "500">
</applet>
*/

public class AdlchangeColor extends Applet  implements AdjustmentListener
{
Scrollbar red;
Scrollbar green;
Scrollbar blue;
  public void init()
    {
        setLayout(new FlowLayout());
      
        red = new Scrollbar(Scrollbar.HORIZONTAL,50,5,0,300);
        green = new Scrollbar(Scrollbar.HORIZONTAL);
         blue = new Scrollbar(Scrollbar.HORIZONTAL);
        add(red);
        add(green);
        add(blue);
        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);   
    }

public void paint(Graphics g)
{
g.drawRect(50,100,200,150);
        
int x, y, z;
x = red.getValue();
y = green.getValue();
z = blue.getValue();

g.setColor(new Color(x,y,z));
g.fillRect(50,100,200,150);
}


    public void adjustmentValueChanged(AdjustmentEvent ae)
    {
	repaint();
    }


   
}