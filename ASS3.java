import java.awt.*;

class ASS3 extends Frame{
	public ASS3(){
		this.setLayout(null);
		this.setSize(500, 500);

		List list = new List();
		list.add("India");
		list.add("Pakistan");
		list.add("Bangladesh");
		list.add("Afganistan");
		list.add("Turkmenstaan");
		list.add("China");
		list.add("Jaan");
		list.add("UK");
		list.add("USA");
		list.add("Brazil");
		list.add("Peru");
		list.add("Austria");
		list.add("Australia");
		list.setLocation(50, 50);	
		list.setSize(70, 150);
		
		Button remove = new Button("Remove Selected item");
		remove.setLocation(50, 230);
		remove.setSize(70, 30);
		
		Choice choice = new Choice();
		choice.add("India");
		choice.add("Pakistan");
		choice.add("Bangladesh");
		choice.add("Afganistan");
		choice.add("Turkmenstaan");
		choice.add("China");
		choice.add("Jaan");
		choice.add("UK");
		choice.setLocation(150, 50);
		choice.setSize(125, 30);

		Button add = new Button("Add Item");
		add.setLocation(150, 100);
		add.setSize(125, 30);		

		this.add(list);
		this.add(remove);
		this.add(choice);
		this.add(add);
		this.setVisible(true);
	}
	public static void main(String ar[]){
		ASS3 ass3 = new ASS3();
	}
}