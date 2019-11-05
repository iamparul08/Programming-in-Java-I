import javax.swing.*;
import java.awt.*;
public class Swing3 extends JFrame
{
	JLabel=l1,l2,l3,l4;
	JTextField=t1,t2;
	JButton=b1;
	
	public Swing3() {}
	public Swing3(String a)
	{ super(s); }
	public void setComponents()
	{
		l1 = new JLabel("Addition of two numberss");
		l2 = new JLabel("First no");
		l3 = new JLabel("Second no");
		l4 = new JLabel();
		t1 = new JTextField();
		t2 = new JTextField();
		b1 = new JButton("Add");
		
		setLayout(null);
		l1.setBounds(50,50,200,20);
		l2.setBounds(50,80,100,20);
		t1.setBounds(150,80,100,20);
		l3.setBounds(50,130,100,20);
		t2.setBounds(150,130,100,20);
		b1.setBounds(80,180,100,20);
		l4.setBounds(50,240,200,20);
		
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(b1);
		add(l4);
	}
	public static void main(String[] args)
{
	Swing3 sw = new Swing3("Swing Example");
	sw.setComponents();
	sw.setVariable(true);
	sw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
