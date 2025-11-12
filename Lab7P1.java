import java.awt.event.*;
import java.awt.*;
class Lab7p1{
	public static void main(String...args){
	final int[] a = {0};
		Frame f = new Frame();
		GridLayout ff = new GridLayout(3,2);
		f.setLayout(ff);
		
		
		f.setSize(500,400);
		TextField tf = new TextField(50);
		//tf.setColumn(50,50); 
		Label l = new Label();
		l.setPreferredSize(new Dimension (100,100));
		
		Button b = new Button("Click");
		b.setBounds(40,40,40,40);
		b.addActionListener(new ActionListener(){
	
		public void actionPerformed(ActionEvent Ae){
			l.setText(tf.getText());
			System.out.println(tf.getText() + "-" +a[0]);
			a[0]++;
		}
		
		});
		f.setLayout(new GridLayout());
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
			f.dispose();
			}
		});
		
	
	f.add(tf);
	f.add(b);
	f.add(l);
	f.setVisible(true);
	f.setTitle("Event Handling");
}
}
