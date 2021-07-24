package com.star.TPC;

import java.io.File;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class NewMain {

    public static void main(String[] args) {
        // TODO code application logic here
           
        SessionFactory factory=new Configuration().configure(new File("src/main/java/hibernate.cfg.xml")).buildSessionFactory();
        
        Employee emp=new Employee();
        emp.setName("Raj kumar");
        
        Regular_Employee regemp=new Regular_Employee();
        regemp.setName("Swarup Usare");
        regemp.setSalary((float) 30000.00);
        regemp.setBonus(8000);

        
        Contract_Employee contremp=new Contract_Employee();
        contremp.setName("karan pake");
        contremp.setPay_per_hour((float)3000.00);
        contremp.setContract_duration("2hrs");
        
        try (Session session = factory.getCurrentSession()) {
            Transaction tx=  session.beginTransaction();
              session.save(emp);
              session.save(regemp);
              session.save(contremp);
            
            tx.commit();
        }
      
        
    }
    
}
