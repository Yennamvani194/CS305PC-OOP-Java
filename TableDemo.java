import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TableDemo extends JFrame{
	Label l;
	TableDemo(){
		super("JTable Demo");
		String[] heading = {"Name","Course","RollNo"};
		
		String[][] data = {
				{"VANI","CSE","0521"},
				{"PRIYA","CSE","05F9"},
				{"ANANYA","CSE","05D2"},
				{"VAGMAI","CSE","05F3"},
			};
		JTable jt = new JTable(data,heading);
		JScrollPane sp = new JScrollPane(jt);
		add(sp);
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String...args){
		new TableDemo();
	}
}
