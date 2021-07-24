package com.star.mapping.ManyToMany;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class NewMain {

    public static void main(String[] args) {
        // TODO code application logic here
        SessionFactory factory=new Configuration().configure(new File("src/main/java/hibernate.cfg_2.xml")).buildSessionFactory();
        
        Emp e1=new Emp();
        e1.setE_id(201);
        e1.setE_name("saurabh");
        
        Emp e2=new Emp();
        e2.setE_id(202);
        e2.setE_name("shivam");
        
         Emp e3=new Emp();
        e3.setE_id(203);
        e3.setE_name("soham");   
        
        Projects p1=new Projects();
        p1.setP_id(601);
        p1.setP_name("Library Managment System");
        
        Projects p2=new Projects();
        p2.setP_id(602);
        p2.setP_name("E-Commerce Website");
        
         Projects p3=new Projects();
        p3.setP_id(603);
        p3.setP_name("Chat-Bot");
        
        
        List<Emp> emps=new ArrayList<>();
        emps.add(e1);
        emps.add(e2);
        emps.add(e3);
        
        List<Projects> projs1=new ArrayList<>();
        projs1.add(p1);
        projs1.add(p2);
        
        List<Projects> projs2=new ArrayList<>();
        projs2.add(p1);
        projs2.add(p2);
        projs2.add(p3);
                
         e1.setProjects(projs1);
         e2.setProjects(projs2);
         e3.setProjects(projs1);
         
        
        Session session=factory.getCurrentSession();
        
        Transaction tx=session.beginTransaction();
         
             session.save(e1);
              session.save(e2); 
              session.save(e3); 
              session.save(p1);
               session.save(p2);
               session.save(p3);
         
              
        
        tx.commit();
    }
    
}
