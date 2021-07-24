
package com.star.mapping.OneToMany;

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
          SessionFactory factory=new Configuration().configure(new File("src/main/java/hibernate.cfg_1.xml")).buildSessionFactory();
          
            Question1 q1=new Question1();
            q1.setQ_id(102);
            q1.setQ_name("What is HQL ?");
            
            Answer1 a1=new Answer1();
            a1.setA_id(503);
            a1.setAns("HQL Stands for hibernate Query language.it is object oriented version of SQL(structured query language)");
            a1.setQuestion1(q1);
            
            Answer1 a2=new Answer1();
            a2.setA_id(504);
            a2.setAns("it is database independent language.so it  has own query .it doesn't depend on any database.");
            a2.setQuestion1(q1);
            
            List<Answer1> answers=new ArrayList<>();      
            answers.add(a1);
            answers.add(a2);
            
            q1.setAns(answers);
            
            
           Session session=factory.getCurrentSession();
        
           Transaction tx=session.beginTransaction();
//                    persist and save method those are similar to each other
//                    there are four state of hibernate object state
//                    <1>transient state <2> Persistent state <3> detached state <4> removed state
                         session.persist(q1);

//                         session.save(a1);
//                         session.save(a2);

////                  checking fetching technique Lazy and EAEGER get value from database using technique
//                    Question1 que1=session.get(Question1.class, 101);
//                    System.out.println(que1.getQ_id());
//                    System.out.println(que1.getQ_name());
//                    System.out.println(que1.getAns().size());
//                    List<Answer1> li=que1.getAns();
//                    li.forEach((a) -> {
//                        System.err.println(a);
//                    });
                    
        
           tx.commit();
    }
    
}
