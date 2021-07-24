/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.star.FEE_REPORT;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Home
 */
public class NewJFrame2 {

     JFrame f2=new JFrame();
    public NewJFrame2() {
        
        
    }
   

    void setVisible(boolean b) {
       f2.setVisible(b);
        JFrame f2=new JFrame();
        f2.setSize(500,500);
           
        JLabel l=new JLabel();
        l.setText("Fee Report");
        l.setForeground(Color.BLUE);
        l.setSize(230, 100);
        
        JButton b1=new JButton();
        b1.setText("Admin Login");
        f2.setLayout(new FlowLayout());
        f2.setDefaultCloseOperation(f2.EXIT_ON_CLOSE);
    }
    
}
