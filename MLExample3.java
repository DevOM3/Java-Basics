import java.awt.*;
import java.awt.event.*;

public class MLExample3 extends Frame implements MouseListener 
{
Button btn1;
TextField t1,t2,t3,t4,t5,t6;
public MLExample3()
{
setLayout(new FlowLayout());
t1 = new TextField(10);
t2 = new TextField(10);
t3 = new TextField(10);
t4 = new TextField(10);
t5 = new TextField(10);
t6 = new TextField(10);
btn1= new Button("Show Result");

add(btn1);
add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);

btn1.addMouseListener(this);
}

public void mouseClicked(MouseEvent e)
{

}

public void mouseExited(MouseEvent e)
{
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
}

public void mouseEntered(MouseEvent e)
{
if(t1 != null && t2 != null)
{
t3.setText("" + (Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText())));
t4.setText("" + (Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText())));
t5.setText("" + (Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText())));
t6.setText("" + (Integer.parseInt(t1.getText()) / Integer.parseInt(t2.getText())));
}
}

public void mousePressed(MouseEvent e)
{

}

public void mouseReleased(MouseEvent e)
{

}

public static void main(String ar[])
{
MLExample3 fr = new MLExample3();
fr.setSize(600,600);
fr.setVisible(true);
fr.setTitle("Demonstrating MouseListener Program");
}
}