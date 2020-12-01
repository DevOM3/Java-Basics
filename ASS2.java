import java.awt.*;


class ASS2 extends Frame{
	public ASS2() {
		List list = new List();
		list.add("Python");
		list.add("Java");		
		list.add("R");
		list.add("C");
		list.add("C++");
		list.add("Go");
		list.add("GDScript");
		list.add("Ruby");
		list.add("Dart");
		list.setLocation(30, 70);
		list.setSize(150, 270);

		TextField textbox = new TextField(200);
		textbox.setLocation(200, 80);
		textbox.setSize(180, 40);

		Button add = new Button("Add");
		add.setLocation(400, 80);
		add.setSize(70, 40);

		Button remove = new Button("Remove");
		remove.setLocation(200, 140);
		remove.setSize(70, 40);

		Button removeall = new Button("Remove all");
		removeall.setLocation(200, 180);
		removeall.setSize(70, 40);
		
		Button bt = new Button();
		bt.setBackground(Color.white);

		this.add(list);
		this.add(textbox);
		this.add(add);
		this.add(remove);
		this.add(removeall);
		this.add(bt);
		this.setSize(300, 300);
		this.setVisible(true);			
		this.setLayout(null);
	}
	public static void main(String []ar){
		ASS2 ass2 = new ASS2();
	}
}

