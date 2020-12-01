import java.awt.*;
import java.awt.event.*;

class Game extends Frame{
	Button btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	Button btn5;
	Button btn6;
	Button btn7;
	Button btn8;
	Button btn9;

	String letter = "X";

	Game(){
		btn1 = new Button();
		btn2 = new Button();
		btn3 = new Button();
		btn4 = new Button();
		btn5 = new Button();
		btn6 = new Button();
		btn7 = new Button();
		btn8 = new Button();
		btn9 = new Button();
		
		setLayout(new GridLayout(3, 3, 3, 3));

		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setText(btn1);
			}		
		});
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setText(btn2);
			}		
		});
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setText(btn3);
			}		
		});
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setText(btn4);
			}		
		});
		btn5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setText(btn5);
			}		
		});
		btn6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setText(btn6);
			}		
		});
		btn7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setText(btn7);
			}		
		});
		btn8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setText(btn8);
			}		
		});
		btn9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setText(btn9);
			}		
		});

		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);

		setSize(300, 300);
		setVisible(true);
	}

	private void setText(Button btn){
		if (btn.getLabel() == ""){
			if (letter == "X") {
				btn.setLabel("X");
				letter = "O";
			}
			else {
				btn.setLabel("O");
				letter = "X";
			}
		}
	}
}

class TicTacToe{
	public static void main(String []args){
		Game game= new Game();	
	}
}

