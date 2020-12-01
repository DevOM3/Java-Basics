import java.awt.*;
import java.awt.event.*;

class TestEvent3 extends Frame implements ActionListener {
	Checkbox pizza;
	Checkbox burger;
	Checkbox pastry;
	Label pizzaIs;
	Label burgerIs;
	Label pastryIs;
	Button check;

	TestEvent3() {
		setSize(300, 300);
		setVisible(true);
		setLayout(new FlowLayout());

		pizza = new Checkbox("Pizza");
		burger = new Checkbox("Burger");
		pastry = new Checkbox("Pastry");

		check = new Button("Check");
		check.addActionListener(this);		

		pizzaIs = new Label();
		burgerIs = new Label();
		pastryIs = new Label();

		add(pizza);
		add(burger);
		add(pastry);		
		add(check);
		add(pizzaIs);
		add(burgerIs);
		add(pastryIs);
	}
	public void actionPerformed(ActionEvent ae) {
		if(pizza.getState()) {
			pizzaIs.setText("Pizza is Checked!");
		}
		else{
			pizzaIs.setText("Pizza is Unchecked!");
		}
		if(burger.getState()) {
			burgerIs.setText("Burger is Checked");
		}
		else {
			burgerIs.setText("Burger is Unchecked");
		}
		if(pastry.getState()) {
			pastryIs.setText("Pastry is Checked");
		}
		else {
			pastryIs.setText("Pastry is Unchecked");
		}
	}
	public static void main(String ar[]) {
		TestEvent3 testEvent3 = new TestEvent3();
	}
}

