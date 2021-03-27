//package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
class game1 extends Frame implements ActionListener{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,new0;
	TextField tf;
	int inc=0;
	game1(){
		setVisible(true);
		setLocation(300,150);
		setSize(400,300);
		setLayout(null);
		setBackground(Color.BLACK);
		
		tf=new TextField();
		tf.setSize(250,20);
		tf.setLocation(40,50);
		add(tf);
		
		b1 = new Button();
		b1.setSize(50,50);
		b1.setLocation(120,100);
		b1.addActionListener(this);
		add(b1);
		
		b2 = new Button();
		b2.setSize(50,50);
		b2.setLocation(170,100);
		b2.addActionListener(this);
		add(b2);
		
		b3 = new Button();
		b3.setSize(50,50);
		b3.setLocation(220,100);
		b3.addActionListener(this);
		add(b3);
		

		b4 = new Button();
		b4.setSize(50,50);
		b4.setLocation(120,150);
		b4.addActionListener(this);
		add(b4);
		
		b5 = new Button();
		b5.setSize(50,50);
		b5.setLocation(170,150);
		b5.addActionListener(this);
		add(b5);
		
		b6 = new Button();
		b6.setSize(50,50);
		b6.setLocation(220,150);
		b6.addActionListener(this);
		add(b6);
		
		
		b7 = new Button();
		b7.setSize(50,50);
		b7.setLocation(120,200);
		b7.addActionListener(this);
		add(b7);
		
		b8 = new Button();
		b8.setSize(50,50);
		b8.setLocation(170,200);
		b8.addActionListener(this);
		add(b8);
		
		b9 = new Button();
		b9.setSize(50,50);
		b9.setLocation(220,200);
		b9.addActionListener(this);
		add(b9);
		
		new0 = new Button(" New ");
		new0.setSize(40,20);
		new0.setLocation(320,50);
		new0.addActionListener(this);
		add(new0);
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}


	@Override
	public void actionPerformed(ActionEvent g) {
		if(g.getSource()==new0) {
			game1 g1=new game1();
		}
		

		if(g.getSource()==b1) {
			inc+=1;
			if(inc%2==0) {
				b1.setLabel("O");
			}else {
				b1.setLabel("X");
			}
			b1.removeActionListener(this);
		}
		
		if(g.getSource()==b2) {
			inc+=1;
			if(inc%2==0) {
				b2.setLabel("O");
			}else {
				b2.setLabel("X");
			}
			b2.removeActionListener(this);
			
		}
		
		if(g.getSource()==b3) {
			inc+=1;
			if(inc%2==0) {
				b3.setLabel("O");
			}else {
				b3.setLabel("X");
			}
			b3.removeActionListener(this);
		}
		
		if(g.getSource()==b4) {
			inc+=1;
			if(inc%2==0) {
				b4.setLabel("O");
			}else {
				b4.setLabel("X");
			}
			b4.removeActionListener(this);
		}
		
		if(g.getSource()==b5) {
			inc+=1;
			if(inc%2==0) {
				b5.setLabel("O");
			}else {
				b5.setLabel("X");
			}
			b5.removeActionListener(this);
		}
		
		if(g.getSource()==b6) {
			inc+=1;
			if(inc%2==0) {
				b6.setLabel("O");
			}else {
				b6.setLabel("X");
			}
			b6.removeActionListener(this);
		}
		
		if(g.getSource()==b7) {
			inc+=1;
			if(inc%2==0) {
				b7.setLabel("O");
			}else {
				b7.setLabel("X");
			}
			b7.removeActionListener(this);
		}
		
		if(g.getSource()==b8) {
			inc+=1;
			if(inc%2==0) {
				b8.setLabel("O");
			}else {
				b8.setLabel("X");
			}
			b8.removeActionListener(this);
		}
		
		if(g.getSource()==b9) {
			inc+=1;
			if(inc%2==0) {
				b9.setLabel("O");
			}else {
				b9.setLabel("X");
			}
			b9.removeActionListener(this);
		}
		
		
		Font fn = new Font("Arial",Font.BOLD,20); 
		if(b1.getLabel()=="X" && b2.getLabel()=="X" && b3.getLabel()=="X") {
			tf.setText("Player 1 is winner");
			b1.setFont(fn);b2.setFont(fn);b3.setFont(fn);
			disable();
		}else if(b4.getLabel()=="X" && b5.getLabel()=="X" && b6.getLabel()=="X") {
			tf.setText("Player 1 is winner");
			b4.setFont(fn);b5.setFont(fn);b6.setFont(fn);
			disable();
		}else if(b7.getLabel()=="X" && b8.getLabel()=="X" && b9.getLabel()=="X") {
			tf.setText("Player 1 is winner");
			b7.setFont(fn);b8.setFont(fn);b9.setFont(fn);
			disable();
		}else if(b1.getLabel()=="O" && b2.getLabel()=="O" && b3.getLabel()=="O") {
			tf.setText("Player 2 is winner");
			b1.setFont(fn);b2.setFont(fn);b3.setFont(fn);
			disable();
		}else if(b4.getLabel()=="O" && b5.getLabel()=="O" && b6.getLabel()=="O") {
			tf.setText("Player 2 is winner");
			b4.setFont(fn);b5.setFont(fn);b6.setFont(fn);
			disable();
		}else if(b7.getLabel()=="O" && b8.getLabel()=="O" && b9.getLabel()=="O") {
			tf.setText("Player 2 is winner");
			b7.setFont(fn);b8.setFont(fn);b9.setFont(fn);
			disable();
		}
		
		else if(b1.getLabel()=="X" && b4.getLabel()=="X" && b7.getLabel()=="X") {
			tf.setText("Player 1 is winner");
			b1.setFont(fn);b4.setFont(fn);b7.setFont(fn);
			disable();
		}else if(b2.getLabel()=="X" && b5.getLabel()=="X" && b8.getLabel()=="X") {
			tf.setText("Player 1 is winner");
			b2.setFont(fn);b5.setFont(fn);b8.setFont(fn);
			disable();
		}else if(b3.getLabel()=="X" && b6.getLabel()=="X" && b9.getLabel()=="X") {
			tf.setText("Player 1 is winner");
			b3.setFont(fn);b6.setFont(fn);b9.setFont(fn);
			disable();
		}else if(b1.getLabel()=="O" && b4.getLabel()=="O" && b7.getLabel()=="O") {
			tf.setText("Player 2 is winner");
			b1.setFont(fn);b4.setFont(fn);b7.setFont(fn);
			disable();
		}else if(b2.getLabel()=="O" && b5.getLabel()=="O" && b8.getLabel()=="O") {
			tf.setText("Player 2 is winner");
			b2.setFont(fn);b5.setFont(fn);b8.setFont(fn);
			disable();
		}else if(b3.getLabel()=="O" && b6.getLabel()=="O" && b9.getLabel()=="O") {
			tf.setText("Player 2 is winner");
			b3.setFont(fn);b6.setFont(fn);b9.setFont(fn);
			disable();
		}
		
		else if(b1.getLabel()=="X" && b5.getLabel()=="X" && b9.getLabel()=="X") {
			tf.setText("Player 1 is winner");
			b1.setFont(fn);b5.setFont(fn);b9.setFont(fn);
			disable();
		}else if(b3.getLabel()=="X" && b5.getLabel()=="X" && b7.getLabel()=="X") {
			tf.setText("Player 1 is winner");
			b3.setFont(fn);b5.setFont(fn);b7.setFont(fn);
			disable();
		}else if(b1.getLabel()=="O" && b5.getLabel()=="O" && b9.getLabel()=="O") {
			tf.setText("Player 2 is winner");
			b1.setFont(fn);b5.setFont(fn);b9.setFont(fn);
			disable();
		}else if(b3.getLabel()=="O" && b5.getLabel()=="O" && b7.getLabel()=="O") {
			tf.setText("Player 2 is winner");
			b3.setFont(fn);b5.setFont(fn);b7.setFont(fn);
			disable();
		}
		else {
			if(inc==9) {
				tf.setText("Match is tie");
				disable();
			}
		}
		
	}
	
	public void disable() {
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
	}
	
	
}

//main class
public class tic_tac_toe {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		game1 g1=new game1();

	}

}
