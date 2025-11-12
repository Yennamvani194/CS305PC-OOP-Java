import java.awt.event.*;
import java.awt.*;
class LAB7P2 implements ActionListener{
	Button b = new Button("Click");
	Frame f = new Frame();
	GridLayout ff = new GridLayout(3,2);
	TextField tf = new TextField(50);
	Label l = new Label();
	int a=1;
              LAB7P2()
               {
                              b.setBounds(40,40,40,40);
		f.setLayout(ff);
		f.setSize(500,400);
		f.setVisible(true);
		//tf.setColumn(50,50); 
		
		l.setPreferredSize(new Dimension (100,100));
		
	
	
		b.addActionListener(this);
		f.add(tf);
	               f.add(b);
	               f.add(l);
	
		
		
		f.addWindowListener(new WindowAdapter(){
		             
			public void windowClosing(WindowEvent we){
			f.dispose();
			}
		});
		
	
	
	              f.setTitle("Event Handling");
                   }
	public void actionPerformed(ActionEvent Ae){
			l.setText(tf.getText());
			System.out.println(tf.getText() + "-" +a);
			a++;
		}
               public static void main(String...args){
              new LAB7P2();
     }
}
