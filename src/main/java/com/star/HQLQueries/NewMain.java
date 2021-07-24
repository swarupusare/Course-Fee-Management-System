package com.star.HQLQueries;

import com.star.hibernatetut.Student;

import java.io.File;
import java.util.List;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;   //(new package)

public class NewMain {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
            SessionFactory factory = new Configuration().configure(new File("src/main/java/hibernate.cfg.xml")).buildSessionFactory();

            Session session = factory.getCurrentSession();
            Transaction tx= session.beginTransaction();
          
            
            
//            int i = 5;
//            int id=205;
//            while(id < 215 && i < 15 ){
//                
//                Student s=new Student();
//                System.out.println("enter...");
//                s.setId(id);
//                s.setName("Name "+i);
//                s.setCity("city " +i);
//                session.save(s);
//                i++;
//                id++;
//  
//            }
//=============================/=========================================
             
//              String qString="delete Student where id <= 14";
//              
//              Query c1 = session.createQuery(qString);
//              int e1 = c1.executeUpdate();
//              System.out.println("delete :" +e1);
//            
//            ===============================================================/
//              
//              String query="from Student";
//              String query1="from Student as s where s.id >201";
//              
//              String query2="from Student WHERE id=:n";
//              
//              String query3="delete Student d where d.id=201";
//              String query4="update Student set name='sahil' where id=202";
//              
//                     
//              
//              Query q=session.createQuery(query);
//              Query q1=session.createQuery(query1);
//                  @deprecated query (strike through) denoted it replaced(deprecated) by newer version but it still in use     
//              Query q2 = session.createQuery(query2);
////              Query q3 = session.createQuery(query3);
//              Query q4 = session.createQuery(query4);
//              
//              q2.setParameter("n", 202);
//              
//              
//              
//             List<Student> li =q.list();
//             List<Student> li1 = q1.list();
//             List<Student> li2 = q2.list();
//             int executeUpdate = q3.executeUpdate();
//             int executeUpdate1 = q4.executeUpdate();
//             System.out.println(executeUpdate);
//             System.out.println(executeUpdate1);
//
//             System.out.println("hello");
            
//               for(Student s1:li1)
//             {
//                 System.out.println("----------------------------------");
//                 System.out.println(s1.getName());
//                 System.out.print(s1.getCity());
//                 System.out.print(s1.getId());
//                
//             }    
//            for(Student s2:li2)
//             {
//                 System.out.println("----------------------------------");
//                 System.out.println(s2.getName());
//                 System.out.print(s2.getCity());
//                 System.out.print(s2.getId());
//                
//             }    
//             for(Student s:li)
//             {
//                 System.out.println("enter...");
//                 System.out.println(s.getName());
//                 System.out.print(s.getCity());
//                 System.out.print(s.getId());
//                
//             }
//            

////           HQL hibernate pagination example
//              
//             Query q=session.createQuery("from Student");
//             
////           pagination
//             q.setFirstResult(5);
//             q.setMaxResults(3);
//             
//             List<Student> lipage=q.list();
//             
//             lipage.forEach((sd) -> {
//                  System.out.println(sd.getName()+ " : "+sd.getCity());
//             });
             
            
            tx.commit();
         session.close();
         factory.close();
    }
    
}
