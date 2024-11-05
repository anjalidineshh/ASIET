import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class test implements ActionListener
{
JLabel u,w,l;
JTextField t1,t2;
JButton b1,b2;

test()
{
JFrame f= new JFrame("login page");
u=new JLabel("username");
w=new JLabel("password");
l=new JLabel(" ");
t1=new JTextField(16);
t2=new JPasswordField(16);
b1=new JButton("submit");
b2=new JButton("cancel");
JPanel p=new JPanel(new GridLayout(3,3));
p.add(u);
p.add(t1);
p.add(b1);
p.add(w);
p.add(t2);
p.add(b2);
p.add(l);
b1.addActionListener(this);
b2.addActionListener(this);
f.add(p);
f.setSize(400,300);
f.show();
}
public void actionPerformed(ActionEvent e)
{
 String s=e.getActionCommand();
 if(s.equals("submit"))
 {
 String s1=t1.getText();
 String s2=t2.getText();
 String s3=s1+" "+s2;
 l.setText(s3);
 }
 else 
 {
 t1.setText(" ");
 t2.setText(" ");}}
 public static void main(String args[])
 {
 test t=new test();
 }
 }
