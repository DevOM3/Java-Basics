import java.awt.*;

class Calculator extends Frame{
	public Calculator() {
		this.setBackground(Color.BLACK);
		this.setVisible(true);
		this.setLayout(null);
		this.setSize(395, 700);

		MenuBar menubar = new MenuBar();

		Menu calculator = new Menu("Calculator");
		Menu converter = new Menu("Converter");

		MenuItem standard = new MenuItem("Standard");
		MenuItem graphical = new MenuItem("Graphical");
		MenuItem scientific = new MenuItem("Scientific");
		MenuItem programmer = new MenuItem("Programmer");
		MenuItem date = new MenuItem("Date Calculation");

		MenuItem currency = new MenuItem("Currency");
		MenuItem volume = new MenuItem("Volume");
		MenuItem length = new MenuItem("Length");
		MenuItem weight = new MenuItem("Weight and Mass");
		MenuItem temperature = new MenuItem("Temperature");
		MenuItem energy = new MenuItem("Energy");
		MenuItem area = new MenuItem("Area");
		MenuItem speed = new MenuItem("Speed");
		MenuItem time = new MenuItem("Time");
		MenuItem power = new MenuItem("Power");
		MenuItem data = new MenuItem("Data");
		MenuItem pressure = new MenuItem("Pressure");
		MenuItem angle = new MenuItem("Angle");

		calculator.add(standard);
		calculator.add(graphical);
		calculator.add(programmer);
		calculator.add(scientific);
		calculator.add(date);	

		converter.add(currency);
		converter.add(volume);
		converter.add(length);
		converter.add(weight);
		converter.add(temperature);
		converter.add(energy);
		converter.add(area);
		converter.add(speed);
		converter.add(time);
		converter.add(power);
		converter.add(data);
		converter.add(pressure);
		converter.add(angle);

		menubar.add(calculator);
		menubar.add(converter);

		Font font = new Font("comicsans", Font.PLAIN, 51);

		// creating Entry Field
		TextField textField = new TextField(20);
		textField.setFont(font);
		textField.setLocation(10, 51);
		textField.setSize(375, 55);
		
		// Line 1
		Button percentage = new Button("%");
		percentage.setFont(font);
		percentage.setLocation(10, 110);
		percentage.setSize(90, 90);

		Button c = new Button("C");
		c.setFont(font);
		c.setLocation(105, 110);
		c.setSize(90, 90);

		Button clear = new Button("<X");
		clear.setFont(font);
		clear.setLocation(200, 110);
		clear.setSize(90, 90);

		Button divide = new Button("/");
		divide.setFont(font);
		divide.setLocation(295, 110);
		divide.setSize(90, 90);

		// Line 2
		Button _7 = new Button("7");
		_7.setFont(font);
		_7.setLocation(10, 205);
		_7.setSize(90, 90);

		Button _8 = new Button("8");
		_8.setFont(font);
		_8.setLocation(105, 205);
		_8.setSize(90, 90);

		Button _9 = new Button("9");
		_9.setFont(font);
		_9.setLocation(200, 205);
		_9.setSize(90, 90);

		Button _x = new Button("x");
		_x.setFont(font);
		_x.setLocation(295, 205);
		_x.setSize(90, 90);

		// Line 3
		Button _4 = new Button("4");
		_4.setFont(font);
		_4.setLocation(10, 300);
		_4.setSize(90, 90);

		Button _5 = new Button("5");
		_5.setFont(font);
		_5.setLocation(105, 300);
		_5.setSize(90, 90);

		Button _6 = new Button("6");
		_6.setFont(font);
		_6.setLocation(200, 300);
		_6.setSize(90, 90);

		Button subtract = new Button("-");
		subtract.setFont(font);
		subtract.setLocation(295, 300);
		subtract.setSize(90, 90);

		// Line 4
		Button _1 = new Button("1");
		_1.setFont(font);
		_1.setLocation(10, 395);
		_1.setSize(90, 90);

		Button _2 = new Button("2");
		_2.setFont(font);
		_2.setLocation(105, 395);
		_2.setSize(90, 90);

		Button _3 = new Button("3");
		_3.setFont(font);
		_3.setLocation(200, 395);
		_3.setSize(90, 90);

		Button addition = new Button("+");
		addition.setFont(font);
		addition.setLocation(295, 395);
		addition.setSize(90, 90);

		// Line 5
		Button point = new Button(".");
		point.setFont(font);
		point.setLocation(10, 490);
		point.setSize(90, 90);

		Button _0 = new Button("0");
		_0.setFont(font);
		_0.setLocation(105, 490);
		_0.setSize(90, 90);

		Button square = new Button("^2");
		square.setFont(font);
		square.setLocation(200, 490);
		square.setSize(90, 90);

		Button equals = new Button("=");
		equals.setFont(font);
		equals.setLocation(295, 490);
		equals.setSize(90, 90);

		this.add(textField);
		this.add(percentage);
		this.add(c);
		this.add(clear);
		this.add(divide);
		this.add(_7);
		this.add(_8);
		this.add(_9);
		this.add(_x);
		this.add(_4);
		this.add(_5);
		this.add(_6);
		this.add(subtract);
		this.add(_1);
		this.add(_2);
		this.add(_3);
		this.add(addition);
		this.add(point);
		this.add(_0);
		this.add(square);
		this.add(equals);
		this.setMenuBar(menubar);
	}
	
	public static void main(String []args){
		Calculator calculator = new Calculator();
	}
}