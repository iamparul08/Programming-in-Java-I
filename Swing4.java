//event handling in Swing

import java.awt.*;
import javax.swing.*;
public class Swing4 extends JFrame
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	JButton b1;
	
	public Swing4() {}
	public Swing4(String s)
	{super(s);}
	public void setComponents()
	{
		l1 = new JLabel("Addition of two numbers");
		l2 = new JLabel("First no");
		l3 = new JLabel("Second no");
		t1 = new JTextField();
		t2 = new JTextField();
		b1 = new JButton("Add");
		
		setLayout(null);
		l1.setBounds(50,50,100,20);
		l2.setBounds(50,80,100,20);
		t1.setBounds(150,80,100,20);
		l3.setBounds(50,130,100,20);
		t2.setBounds(150,130,100,20);
		b1.setBounds(80,180,100,20);
		l4.setBounds(50,240,200,20);
		
		b1.addActionListener(new Handler());
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(b1);
		add(l4);
	}
	class Handler implements ActionListener
	{
		public void ActionPerformed(ActionEvent e)
		{
			int a = Integer.parseInt(t1.getText());
			int b = Integer.parseInt(t2.getText());
			int s = a+b;
			l3.setText("Result is: "+s);
		}
	}
	public static void main(String args[])
	{
		Swing4 sw = new Swing4("String examp");
		sw.setComponents();
		sw.setSize(200,200);
		sw.setVariable(true);
		sw.setDefaultClassOperation(JFrame.EXIT_ON_CLOSE);
	}
}