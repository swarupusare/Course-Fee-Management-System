
package com.star.HQL_SQL;


import java.io.File;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;


public class app1 {


    public static void main(String[] args) {
        try ( // TODO code application logic here
                SessionFactory factory = new Configuration().configure(new File("src/main/java/hibernate.cfg.xml")).buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            Transaction tx = session.beginTransaction();
            String q="select * from  Student";
            NativeQuery n1 = session.createNativeQuery(q);
            
            System.out.println("using NativeQuery (new) insted SQLQuery (old) ");
            List<Object[]> list = n1.list();
            for(Object[] a:list){
                System.out.println( a[1]+" : "+ a[2]);
                
            }
            tx.commit();
            session.close();
        }
         
    }
    
}
