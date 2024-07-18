import java.awt.*;
import java.applet.Applet;

/*<applet code="Login" width="600" height="500">
   </applet>*/

public class Login extends Applet
{
public void init()
{
setLayout(null);
setBackground(Color.orange);
setVisible(true);
Button btn1=new Button("Reset");
Button btn2=new Button("Submit");
add(btn1);
add(btn2);

Label lb1=new Label("Enter user ID :-");
Label lb2=new Label("Enter Password :-");
Label lb3=new Label("By Gajendra Thakur");
add(lb1);
add(lb2);
add(lb3);

Font f1=new Font("Arial",Font.BOLD,16);
btn1.setFont(f1);
btn2.setFont(f1);
lb1.setFont(f1);
lb2.setFont(f1);
lb3.setFont(f1);

TextField tf1=new TextField(10);
TextField tf2=new TextField(10);
tf1.setSize(300,700);
tf2.setEchoChar('*');
add(tf1);
add(tf2);

btn1.setBounds(100,250,200,30);
btn2.setBounds(350,250,200,30);
lb1.setBounds(100,100,175,30);
lb2.setBounds(100,150,175,30);
lb3.setBounds(380,270,180,150);
tf1.setBounds(350,100,200,30);
tf2.setBounds(350,150,200,30);
}
}