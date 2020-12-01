import java.awt.*;
import java.awt.event.*;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import javax.script.ScriptEngineManager;

class CalculatorEvent extends Frame implements ActionListener {
	TextField entry;
	Label indicator;
	Button onoff;

	public CalculatorEvent() {
		setSize(400, 400);
		setLayout(new FlowLayout());
		setVisible(true);
		setTitle("Calculator");

		entry = new TextField(21);
		entry.setFont(new Font("comicsans", Font.BOLD, 30));
		entry.setEditable(false);
		
		Font buttonFont = new Font("comicsans", Font.BOLD, 17);

		Button _1 = new Button("1");
		_1.setFont(buttonFont);
		_1.addActionListener(this);

		Button _2 = new Button("2");
		_2.setFont(buttonFont);
		_2.addActionListener(this);

		Button _3 = new Button("3");
		_3.setFont(buttonFont);
		_3.addActionListener(this);

		Button _4 = new Button("4");
		_4.setFont(buttonFont);
		_4.addActionListener(this);

		Button _5 = new Button("5");
		_5.setFont(buttonFont);
		_5.addActionListener(this);

		Button _6 = new Button("6");
		_6.setFont(buttonFont);
		_6.addActionListener(this);

		Button _7 = new Button("7");
		_7.setFont(buttonFont);
		_7.addActionListener(this);

		Button _8 = new Button("8");
		_8.setFont(buttonFont);
		_8.addActionListener(this);

		Button _9 = new Button("9");
		_9.setFont(buttonFont);
		_9.addActionListener(this);

		Button _0 = new Button("0");
		_0.setFont(buttonFont);
		_0.addActionListener(this);

		Button dot = new Button(".");
		dot.setFont(buttonFont);
		dot.addActionListener(this);

		Button equals = new Button("=");
		equals.setFont(buttonFont);
		equals.addActionListener(this);

		Button plus = new Button("+");
		plus.setFont(buttonFont);
		plus.addActionListener(this);

		Button minus = new Button("-");
		minus.setFont(buttonFont);
		minus.addActionListener(this);

		Button multiply = new Button("X");
		multiply.setFont(buttonFont);
		multiply.addActionListener(this);

		Button divide = new Button("/");
		divide.setFont(buttonFont);
		divide.addActionListener(this);

		Button sqrt = new Button("SQRT");
		sqrt.setFont(buttonFont);
		sqrt.addActionListener(this);

		Button facto = new Button("FACTO");
		facto.setFont(buttonFont);
		facto.addActionListener(this);

		Button sin = new Button("sin");
		sin.setFont(buttonFont);
		sin.addActionListener(this);

		Button cos = new Button("cos");
		cos.setFont(buttonFont);
		cos.addActionListener(this);

		Button tan = new Button("tan");
		tan.setFont(buttonFont);
		tan.addActionListener(this);

		Button clr = new Button("CLR");
		clr.setFont(buttonFont);
		clr.addActionListener(this);

		Button bksp = new Button("BKSP");
		bksp.setFont(buttonFont);
		bksp.addActionListener(this);

		onoff = new Button("ON/OFF");
		onoff.setFont(buttonFont);
		onoff.addActionListener(this);

		indicator = new Label("OFF");
		indicator.setFont(buttonFont);

		add(entry);
		add(_1);
		add(_2);
		add(_3);
		add(_4);
		add(_5);
		add(_6);
		add(_7);
		add(_8);
		add(_9);
		add(_0);
		add(dot);
		add(equals);
		add(plus);
		add(minus);
		add(multiply);
		add(divide);
		add(sqrt);
		add(facto);
		add(sin);
		add(cos);
		add(tan);
		add(clr);
		add(bksp);
		add(onoff);
		add(indicator);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == onoff) {
			if(indicator.getText().equals("ON")){
				indicator.setText("OFF");
				indicator.setForeground(Color.BLACK);
			}
			else{
				indicator.setText("ON");
				indicator.setForeground(Color.RED);
			}
		}
		else{
		if(indicator.getText().equals("ON")){

		String sourceText = ae.getActionCommand();
		if(entry.getText().equals("ERROR")){
			entry.setText("");
		}

		switch(sourceText) {
			case "1" : entry.setText(entry.getText() + sourceText);
				   break;
			case "2" : entry.setText(entry.getText() + sourceText);
				   break;
			case "3" : entry.setText(entry.getText() + sourceText);
				   break;
			case "4" : entry.setText(entry.getText() + sourceText);
				   break;
			case "5" : entry.setText(entry.getText() + sourceText);
				   break;
			case "6" : entry.setText(entry.getText() + sourceText);
				   break;
			case "7" : entry.setText(entry.getText() + sourceText);
				   break;
			case "8" : entry.setText(entry.getText() + sourceText);
				   break;
			case "9" : entry.setText(entry.getText() + sourceText);
				   break;
			case "0" : entry.setText(entry.getText() + sourceText);
				   break;
			case "." : entry.setText(entry.getText() + sourceText);
				   break;
			case "=" : 
				   ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
				   ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("JavaScript");
				   try{
			           	Object ob = scriptEngine.eval(entry.getText());
				   	entry.setText(String.valueOf(ob));
				   }
				   catch(ScriptException e){
					entry.setText("ERROR");
				   }
				   break;
			case "+" : entry.setText(entry.getText() + sourceText);
				   break;
			case "-" : entry.setText(entry.getText() + sourceText);
				   break;
			case "X" : entry.setText(entry.getText() + sourceText);
				   break;
			case "/" : entry.setText(entry.getText() + sourceText);
				   break;
			case "SQRT" : if(!entry.getText().equals("")) {entry.setText(String.valueOf(String.valueOf(Math.pow(Double.parseDouble(entry.getText()), 0.5))));}
				      break;
			case "FACTO" : if (!entry.getText().equals("")){
				       int i, factorial = 1;
				       for (i = 1; i <= (int)Double.parseDouble(entry.getText()); i++) {
				       		factorial = factorial * i; 
				       }
				       entry.setText(String.valueOf(factorial));
				       }
				       break;
			case "sin" : if(!entry.getText().equals("")) {entry.setText(String.valueOf(Math.sin(Math.toRadians(Double.parseDouble(entry.getText())))));}
				     break;
			case "cos" : if(!entry.getText().equals("")) {entry.setText(String.valueOf(Math.cos(Math.toRadians(Double.parseDouble(entry.getText())))));}
				     break;
			case "tan" : if(!entry.getText().equals("")) {entry.setText(String.valueOf(Math.tan(Math.toRadians(Double.parseDouble(entry.getText())))));}
				     break;
			case "CLR" : entry.setText("\0");
				     break;
			case "BKSP" : String text = entry.getText();
				      entry.setText(text.substring(0, text.length() - 1));
				      break;
		}
		}
		else{
			Dialog dialog = new Dialog(this, "Calculator", true);
			dialog.setLayout(new FlowLayout());
			dialog.add(new Label("Turn on the Calculator to calculate"));
			Button close = new Button("CLOSE");
			dialog.add(close);
			close.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					dialog.dispose();
				} 
			});
			dialog.setSize(300, 100);
			dialog.setVisible(true);
		}
		}
	}
	public static void main(String []ar) {
		new CalculatorEvent();
	}
}
