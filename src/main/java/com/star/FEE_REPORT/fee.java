
package com.star.FEE_REPORT;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class fee {

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f1=new JFrame();
        NewJFrame2 f2=new NewJFrame2();
       
        f1.setSize(500,500);
        f1.setTitle("FEE REPORT");
        f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
        
        JLabel l=new JLabel();
        l.setText("Fee Report");
        l.setForeground(Color.BLUE);
        l.setSize(230, 100);
        
        JButton b1=new JButton();
        b1.setText("Admin Login");
         
         b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(false);
                f2.setVisible(true);
            }
        });
         JButton b2=new JButton();
         b2.setText("Accountant Login");
         
         f1.add(l);
         f1.add(b1);
         f1.add(b2);
         
         f1.setLayout(new FlowLayout());
         
        f1.setVisible(true);
     
        
    }

  
    
}
