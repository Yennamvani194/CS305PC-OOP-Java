import java.awt.*;
import java.awt.event.*;
import javax.swing.tree.*;


class TreeDemo extends JFrame{
	Label l;
	TreeDemo(){
		super("JTree Demo");
		DefaultMutableTreeNode root = new DefaultMutableTreeNode ("Fruits");
		
		DefaultMutableTreeNode root = new DefaultMutableTreeNode ("APPLES");
		
		
		root.add (new DefaultMutableTreeNode ("APPLE"));
		root.add (new DefaultMutableTreeNode ("MANGO"));
		root.add (new DefaultMutableTreeNode ("GRAPHS"));
		root.add (new DefaultMutableTreeNode ("ORGANE"));
		
		apple.add (new DefaultMutableTreeNode ("GREEN APPLE"));
		apple.add (new DefaultMutableTreeNode ("RED APPLE"));
		
		
		
		
		JTree jt = new JTree(root);
		add(jt);
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String...args){
		new TreeDemo();
	}
}
