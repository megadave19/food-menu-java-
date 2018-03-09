import java.awt.*;
import java.awt.event.*; // link for forget pass and register
import javax.swing.*;
public class login extends Frame implements ActionListener
{
Label l1,l2;
TextField tf1,tf2;
Button b1,b2,b3;
String usernames[]={"antarang","gaurav","admin"};
String password[]={"123","abc","123456"};

menu m;

public login(String s)
{
super ("login page");
setLayout(null);
setBackground(Color.blue);
l1=new Label("Username");
l1.setBounds(30,40,100,30);
tf1=new TextField(20);
tf1.setBounds(150,40,100,30);
tf1.setBackground(Color.yellow);
tf1.setForeground(Color.red);
l2=new Label("Password");
l2.setBounds(30,80,100,30);

tf2=new TextField(20);
tf2.setEchoChar('*');
tf2.setBounds(150,80,100,30);
tf2.setBackground(Color.yellow);
tf2.setForeground(Color.red);
b1=new Button("login");
b2=new Button("reset");
b3=new Button("exit");
b1.setBounds(50,160,70,30);
b2.setBounds(130,160,70,30);
b3.setBounds(210,160,70,30);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
add(l1);
add(tf1);
add(l2);
add(tf2);
add(b1);
add(b2);
add(b3);
m=new menu("order form");
m.setSize(400,400);
}
public void actionPerformed(ActionEvent ae)
{
		
		if(ae.getSource()==b1)
		{
			String user=tf1.getText();
			String pass=tf2.getText();
			int f=0,i,l=usernames.length;
		
				for(i=0;i<l;i++)
				{	
					if(user.equals(usernames[i]) && pass.equals(password[i]))
					{
							f=1;
							break;
					}
						
				}
				if(f==0)
				{
					JOptionPane.showMessageDialog(this,"Invalid User name or Password");
				}
				else
				{
						m.setVisible(true);
						this.dispose();
				}
		}
		else if(ae.getSource()==b2)
		{
			String str="";
			//System.out.println("Msg");
			tf1.setText("");
			tf2.setText("");
		}
		else if(ae.getSource()==b3)
		{
				System.exit(0);
					
		}
}
public static void main(String args[])
{
login obj=new login("awt demo");
obj.setSize(400,250);
obj.setVisible(true);
System.out.println("Msg");
}
}

