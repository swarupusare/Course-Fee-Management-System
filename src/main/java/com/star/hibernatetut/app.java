/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.star.hibernatetut;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

/**
 *
 * @author Home
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hibernate tutorial..........");
        
//        session factory(interface) is factory of session .used for creating session and session used for give  methods for database operation
         SessionFactory factory = new Configuration().configure(new File("src/main/java/hibernate.cfg.xml")).buildSessionFactory();
//        creating student
         Student st=new Student();
         st.setId(102);
         st.setName("sahil");
         st.setCity("Khed");
         //creating object of address class
         Address ad=new Address();
         ad.setState("Maharashtra");
         ad.setCity("Khed");
         ad.setIsOpen(true);
         ad.setAddedDate(new Date());
         ad.setX(23.33);
        try {
            //reading image
            FileInputStream file=new FileInputStream("src/main/java/sw.jpg");
            byte[] b=new byte[file.available()];
            file.read(b);
  
            ad.setImage(b);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(app.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(app.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
//        open(begin) transaction from session to perform operation on database
        try (//         get session for sessionfactory
                Session session = factory.getCurrentSession()) {
            //        open(begin) transaction from session to perform operation on database
            session.beginTransaction();
            session.save(st);
            session.save(ad);
            session.getTransaction().commit();
        }
        System.out.println(factory);
        System.out.println(factory.isClosed());
        
        
    }
    
}
