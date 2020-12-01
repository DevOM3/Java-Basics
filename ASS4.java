import java.awt.*;

class ASS4 extends Frame{
	public ASS4(){
		this.setVisible(true);
		this.setLayout(null);
		this.setSize(500, 500);
		
		CheckboxGroup checkboxGroup = new CheckboxGroup();
		
		Checkbox _0 = new Checkbox("0");
		_0.setLocation(350, 250);
		_0.setSize(50, 50); 

		Checkbox _10 = new Checkbox("10");
		_10.setLocation(320, 200);
		_10.setSize(50, 50); 
		
		Checkbox _20 = new Checkbox("20");
		_20.setLocation(320, 150);
		_20.setSize(50, 50);
		
		Checkbox _30 = new Checkbox("30");
		_30.setLocation(350, 100);
		_30.setSize(50, 50); 
		
		Checkbox _40 = new Checkbox("40");
		_40.setLocation(400, 70);
		_40.setSize(50, 50); 

		Checkbox _50 = new Checkbox("50");
		_50.setLocation(450, 100);
		_50.setSize(50, 50); 
		
		Checkbox _60 = new Checkbox("60");
		_60.setLocation(470, 150);
		_60.setSize(50, 50); 
		
		Checkbox _70 = new Checkbox("70");
		_70.setLocation(470, 200);
		_70.setSize(50, 50); 
		
		Checkbox _80 = new Checkbox("80");
		_80.setLocation(450, 250);
		_80.setSize(50, 50); 
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setLocation(550, 60);
		scrollbar.setSize(10, 1000);

		this.add(_0);
		this.add(_10);
		this.add(_20);
		this.add(_30);
		this.add(_40);
		this.add(_50);
		this.add(_60);
		this.add(_70);
		this.add(_80);
		this.add(scrollbar);

	}
	public static void main(String []ar){
		ASS4 ass4 = new ASS4();
	}
}

