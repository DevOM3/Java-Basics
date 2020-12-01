import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

class JTreeTest extends JFrame {
	JTreeTest() {
		Container container = getContentPane();

		// root node 		
		DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode("Alphabets");

		// childrens of roo node
		DefaultMutableTreeNode upperCase = new DefaultMutableTreeNode("Upper Case");
		DefaultMutableTreeNode lowerCase = new DefaultMutableTreeNode("Lower Case");

		defaultMutableTreeNode.add(upperCase);
		defaultMutableTreeNode.add(lowerCase);

		for (char i='A'; i<='Z'; i++){
			upperCase.add(new DefaultMutableTreeNode(String.valueOf(i)));
		}
	
		JTree jTree = new JTree();
		container.add(jTree);				
	}	

	public static void main(String  []ar){
		JTreeTest jTreeTest = new JTreeTest();
		jTreeTest.setSize(500, 500);
		jTreeTest.setVisible(true);
		jTreeTest.setTitle("JTree Test");
		jTreeTest.setDefaultCloseOperation(JFrame.);
	}
}