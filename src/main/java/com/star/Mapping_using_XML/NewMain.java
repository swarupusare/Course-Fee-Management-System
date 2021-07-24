
package com.star.Mapping_using_XML;

import java.io.File;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class NewMain {

    public static void main(String[] args) {
        // TODO code application logic here
        SessionFactory factory=new Configuration().configure(new File("src/main/java/hibernate.cfg_1.xml")).buildSessionFactory();
//            mapping using xml file
         Person p=new Person(301,"swarup usare","At post bhadgaon usare wadi tal-khed","8847743896");
         
        try (Session session = factory.openSession()) {
            Transaction tx=session.beginTransaction();
               session.save(p);
            
            session.close();
        }
        
    }
    
}
