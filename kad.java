 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class kad extends JFrame implements ItemListener,ActionListener
{
 JFrame j=new JFrame();
  JComboBox cb1,cb2,cb3;
JLabel i1,i2,i3,i4,i5,i6,i7;
JTextField t1,t2,t3;
JButton b1;
  kad()
{
 cb1=new JComboBox();
 cb1.addItem("INDIA");
 cb1.addItem("USA");
 cb1.addItem("CHINA");
 cb1.addItem("GERMANY");
 cb2=new JComboBox();
cb3=new JComboBox();
i1=new JLabel("First Name");
i2=new JLabel("Middle Name");
i3=new JLabel("Last Name");
i4=new JLabel("Country");
i5=new JLabel("State");
i6=new JLabel("District");
i7=new JLabel(" ");
t1=new JTextField(20);
t2=new JTextField(20);
t3=new JTextField(20);
b1=new JButton("Submit");
       j.add(i1);
        j.add(t1);
   j.add(i2);
   j.add(t2);
        j.add(i3);
 j.add(t3);
 j.add(i4);
   j.add(cb1);
  j.add(i5);
 j.add(cb2);
 j.add(i6);
j.add(cb3);
 j.add(b1);
j.add(i7);
              j.setVisible(true);
              j.setLayout(new FlowLayout());
              j.setSize(500,500);
  cb1.addItemListener(this);
  cb2.addItemListener(this);
  cb3.addItemListener(this);
b1.addActionListener(this);
}
                      public void itemStateChanged(ItemEvent e)
                         {
                           if(e.getSource()==cb1)
                            {
                                   String a=(String)cb1.getSelectedItem();

                               if(a.equals("INDIA"))
                                {
                                    cb2.removeAllItems();
                                    cb2.addItem("MAHARASHTRA");
                                    cb2.addItem("GUJRAT");
                                    cb2.addItem("TAMILNADU");
                                    cb2.addItem("KERALA");
                                    cb2.addItem("GOA");
                                    cb2.addItem("RAJASTHAN");
                                   }
                              if(a.equals("USA"))
                                  {
                                   cb2.removeAllItems();
                                   cb2.addItem("NEW YORK");
                                   cb2.addItem("FLORIDA");
                                   cb2.addItem("TEXAS");
                                   cb2.addItem("ALASKA");
                                   }
                              if(a.equals("CHINA"))
                                 {
                                  cb2.removeAllItems();
                                  cb2.addItem("SICHUAN");
                                  cb2.addItem("HENAN");
                                  cb2.addItem("FUJIAN");
                                  }
                              if(a.equals("GERMANY"))
                                 {
                                  cb2.removeAllItems();
                                  cb2.addItem("BAVARIA");
                                  cb2.addItem("SAXONY");
                                  cb2.addItem("HAMBURG");
                                  }
                            }
                  if (e.getSource()==cb2)
                   {
                    String dis=(String)cb2.getSelectedItem();
                              if(dis.equals("MAHARASHTRA"))
                               {
                                cb3.removeAllItems();
                                cb3.addItem("NASHIK");
                                cb3.addItem("MUMBAI");
                                 }
                      }
                 }

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
String a,b,c,d,e,f;
a=t1.getText();
b=t2.getText();
c=t3.getText();
d=(String)cb1.getSelectedItem();
e=(String)cb2.getSelectedItem();
f=(String)cb3.getSelectedItem();
i7.setText("name "+a+" "+b+" "+c+" "+f+" "+e+" "+d);

}
}

 public static void main(String kk[])
{
 new kad();
}
}