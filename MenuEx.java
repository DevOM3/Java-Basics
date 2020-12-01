import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuEx
{
Frame frame;
MenuBar menuBar;
Menu menu1, menu2; 
MenuItem mItem1, mItem2, mItem3, mItem4, mItem5, mItem6, mItem7;
Button button1, button2, button3;
Dialog d1, d2, d3;

MenuEx()
{
frame = new Frame("MenuBar, Menu and MenuItems");

//Creating a menu bar
menuBar= new MenuBar();

//Creating first menu
menu1 = new Menu("File", true);
mItem1 = new MenuItem("New");
mItem2 = new MenuItem("Open");
mItem3 = new MenuItem("Save");

//Adding menu items to the  menu
menu1.add(mItem1);
menu1.add(mItem2);
menu1.add(mItem3);

//Creating a second sub-menu
menu2 = new Menu("Save-as");
mItem5 = new MenuItem(".jpeg");
mItem6 = new MenuItem(".png");
mItem7 = new MenuItem(".pdf");

//Adding menu items to the sub-menu
menu2.add(mItem5);
menu2.add(mItem6);
menu2.add(mItem7);

//Adding the sub-menu to the first menu
menu1.add(menu2);

//Adding our menu  to the menu bar
menuBar.add(menu1);

//Adding my menu bar to the frame by calling setMenuBar() method
frame.setMenuBar(menuBar);

frame.setSize(330,250);
frame.setVisible(true);
}

public static void main(String... ar)
{
new MenuEx();
}
}

