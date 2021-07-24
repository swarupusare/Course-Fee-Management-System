
package com.star.mapping.OneToOne;

import java.io.File;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class NewMain {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("project started......");
        
        SessionFactory factory=new Configuration().configure(new File("src/main/java/hibernate.cfg.xml")).buildSessionFactory();
        
        //creating question
        
        Question q=new Question();
        q.setQuestion_Id(1101);
        q.setQuestion("why use hibernate Framework ?");
    
        //creating answer
        Answer a=new Answer();
        a.setAnswer_Id(501);
        a.setAnswer("it simplify development of java application intract with the database.it use HQL(hibernate query language) is object oriented version of sql .it uses ORM tool for that.");
        
        q.setAnswer(a);
        a.setQuestion(q);
        
        try (Session session = factory.getCurrentSession()) {
            Transaction tx = session.beginTransaction();
                  
                session.save(q);
                session.save(a);
                 
            tx.commit();
        }
        
    }
    
}
