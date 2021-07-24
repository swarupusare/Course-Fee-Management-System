
package com.star.HQL_CRITERIA_API;

import com.star.hibernatetut.Student;
import java.io.File;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


public class NewMain2 {


    public static void main(String[] args) {
        // TODO code application logic here
        SessionFactory factory = new Configuration().configure(new File("src/main/java/hibernate.cfg_1.xml")).buildSessionFactory();

        Session session = factory.openSession();

        Criteria createCriteria = session.createCriteria(Student.class);
        Criteria createCriteria1 = session.createCriteria(Student.class);
        System.out.println(createCriteria);
        List<Student> l = createCriteria.list();
        for (Student ss : l) {
            System.out.println(ss.getName());
        }
        System.out.println("================================");

        createCriteria.add(Restrictions.eq("name", "soham"));

        List<Student> list = createCriteria.list();

        for (Student s1 : list) {

            System.out.println(s1.getCity() + " : " + s1.getName());
        }
        System.out.println("================================");
        createCriteria1.add(Restrictions.gt("id", 210));
        List<Student> list1 = createCriteria1.list();
       
        for(Student s2:list1){
            System.out.println(s2.getId()+ " : "+s2.getName());
        }
     
    }
    
    
}
