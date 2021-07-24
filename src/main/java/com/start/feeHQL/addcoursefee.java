
package com.start.feeHQL;

import com.start.feeEntities.coursefee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class addcoursefee {
    
    public static void savecourseandfee(String name,String fee){
       
        SessionFactory factory = sessionfactorycreater.getfactory();
        
        coursefee f1=new coursefee(name, fee);
        
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();
              
               session.save(f1);
        
        tx.commit();

        
    }
}
