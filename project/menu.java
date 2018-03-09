import java.awt.*;
import java.awt.event.*; // working on check box
public class menu extends Frame implements ActionListener,ItemListener
{
Label l1,l2,l3,l4,l5;
TextField tf1,tf2,tf3,tf4;
Button b1,b2,b3;
Checkbox c1,c2,c3,c4,c5,c6;
CheckboxGroup cbg;
Choice ch;

public menu(String s)
{
super ("food menu");
setLayout(null);
setBackground(Color.pink);
l1=new Label("your order");
l1.setBounds(30,40,100,30);
l1.setBounds(
l2=new Label("amount");
l3=new Label("discount");
l4=new Label("bill amount");
l5=new Label("category");
tf1=new TextField(20);
tf1.setBounds(150,40,100,30);
tf2=new TextField(20);
tf3=new TextField(20);
tf4=new TextField(20);
c1=new Checkbox("coffee"+  "75");
c1.setBounds(30,
c2=new Checkbox("pizza"+  "200");  
c3=new Checkbox("cold drink"+  "30");
c4=new Checkbox("cake"+  "300");
cbg=new CheckboxGroup();
c5=new Checkbox("regular",false,cbg);
c6=new Checkbox("new",false,cbg);

b1=new Button("bill");
b2=new Button("reset");
b3=new Button("Exit");
c1.addItemListener(this);
c2.addItemListener(this);
c3.addItemListener(this);
c4.addItemListener(this);
c5.addItemListener(this);
c6.addItemListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
add(c1);
add(c2);
add(c3);
add(c4);
add(l1);
add(tf1);
add(l2);
add(tf2);
add(l5);
add(c5);
add(c6);
add(l3);
add(tf3);
add(l4);
add(tf4);
add(b1);
add(b2);
add(b3);
}
public void actionPerformed(ActionEvent ae)
{
float coffee=75,pizza=200,cdrink=30,cake=300,yourorder;
		if(ae.getSource()==b1)
		{
			double amt1=Double.parseDouble(tf2.getText());
			double per=0.0;
			if(c5.getState())
				per=0.25;
			if(c6.getState())
				per=0.10;
			double disc=amt1*per;
			double bill=amt1-disc;
			tf4.setText(""+bill);
			
		}
		else if(ae.getSource()==b2)
		{
			
			c1.setState(false);
			c2.setState(false);
			c3.setState(false);
			c4.setState(false);
			c5.setState(false);
			c6.setState(false);
			tf1.setText(null);
		    tf2.setText(null);
			tf3.setText(null);
			tf4.setText(null);
		}
		else if(ae.getSource()==b3)
		{
				System.exit(0);
					
		}
}
public void itemStateChanged(ItemEvent ie)
{
if(ie.getSource()==c1 || ie.getSource()==c2 || ie.getSource()==c3 || ie.getSource()==c4)
{
	String order="";
	int price=0;
	if(c1.getState())
	{
		order=order+" Coffee +";
		tf2.setText(Float.toString(75));
		price+=75;
	}
	if(c2.getState())
	{
		order=order + " pizza +";
		tf2.setText(Float.toString(200));
	    price+=200;
	}
	if(c3.getState())
	{
		order=order+" cdrink +";
		tf2.setText(Float.toString(30));
		price+=30;
	}
	
	if(c4.getState())
	{
		order=order+"cake +";
		tf2.setText(Float.toString(300));
		price+=300;
	}
	tf1.setText(order.substring(0,order.length()-1).trim());
	tf2.setText(""+price);
	
}
if(ie.getSource()==c5)
{
	tf3.setText("25%");
	
	
}
else if (ie.getSource()==c6)
{
	tf3.setText("10%");
	
	
}

}
}