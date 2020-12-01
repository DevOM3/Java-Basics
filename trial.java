import java.awt.*;
import java.applet.Applet;

public class trial extends Applet
{
    public void init()
    {
    setLayout(null);
List l1 = new List(3,true);
Choice c = new Choice();
Label la1 = new Label("Select Items");
Label la2 = new Label("Payment Type");
Button btn1 = new Button("Submit");
l1.add("Pizza");
l1.add("Burger");
l1.add("Pestree");
l1.add("Coffee");
l1.add("Tea");
l1.add("Noodles");
l1.add("Maggie");
l1.add("Pasta");
l1.add("Cold-Drinks");
l1.add("Ice-Cream");
c.add("Credit/Debit Card");
c.add("NetBanking");
c.add("GooglePay");
c.add("PhonePay");
c.add("Paytm");
la1.setBounds(50,50,100,30);//items label
l1.setBounds(150,50,100,90);////list
la2.setBounds(50,160,90,30);//payment label
c.setBounds(140,160,160,30);// choice
btn1.setBounds(110,220,90,30);//button
add(la1);
add(l1);
add(la2);
add(c);
add(btn1);
}
}
/*
<applet code="trial" width="300" height="300">
</applet>
*/