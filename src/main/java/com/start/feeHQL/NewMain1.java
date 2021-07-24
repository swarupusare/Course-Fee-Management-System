
package com.start.feeHQL;

import com.start.feeEntities.AddStudent;
import com.start.feeEntities.loadentity;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;

public class NewMain1 {

    public static void addstudentsave(String sname,String semail,String scourse,String sfee,String spaid,String sdue,String saddress,String scity,String sstate,String contact)
    {
        
        SessionFactory factory = sessionfactorycreater.getfactory();
       
        
        AddStudent s1=new AddStudent(sname, semail, scourse, sfee, spaid, sdue, saddress, scity, sstate,contact,new Date(),new Date());
        
   
        
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();
              
               session.save(s1);
        
        tx.commit();
    }
    public static loadentity getstudent(int gid){
          SessionFactory factory = sessionfactorycreater.getfactory();
       
             
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();
              
        Criteria cre = session.createCriteria(AddStudent.class);
        
        cre.add(Restrictions.eq("id", gid));
             
        List<AddStudent> lt = cre.list();
      
        loadentity load=new loadentity();
        if(lt.isEmpty()){
            load.setValidrollno(false);
        }
        for(AddStudent li:lt)
        {
            load.setValidrollno(true);
            load.setId(li.getId());
            load.setName(li.getName());
            load.setEmail(li.getEmail());
            load.setCourse(li.getCourse());
            load.setFee(li.getFee());
            load.setPaid(li.getPaid());
            load.setAddress(li.getAddress());
            load.setCity(li.getCity());
            load.setState(li.getState());
            load.setContact(li.getContactno());
           
            
        }        
        
        tx.commit();
        return load;
    }
     public static boolean updatestudent(int rollno,String name,String email,int due,String address,String city,String state,String contactn) {
        SessionFactory factory = sessionfactorycreater.getfactory();
         
             Session session = factory.openSession();

        Transaction tx = session.beginTransaction();
              
        Criteria cre = session.createCriteria(AddStudent.class);
        cre.add(Restrictions.eq("id", rollno));
             
        List<AddStudent> lt = cre.list();
        if(lt.isEmpty()){
            return false ;
                    
        }
         for(AddStudent li:lt)
        {
              li.setName(name);
              li.setEmail(email);

              int lp=Integer.parseInt(li.getPaid());
              
              int newp=lp+due;
              int fee=Integer.parseInt(li.getFee());
              if(newp==fee){
                 
              }  
              li.setPaid(String.valueOf(newp));
              li.setDue(String.valueOf(due));
              li.setAddress(address);
              li.setCity(city);
              li.setState(state);
              li.setContactno(contactn);
              
            System.out.println("going to update student");
               
        }        
          tx.commit();
       return true;
       
    }
    public static boolean deletestudent(int srollno){
          SessionFactory factory = sessionfactorycreater.getfactory();
            
          Session session = factory.openSession();

          Transaction tx = session.beginTransaction();
          
          NativeQuery createQuery = session.createNativeQuery("delete from addstudent where id = ?");
          createQuery.setParameter(1, srollno);
          
          int executeUpdate = createQuery.executeUpdate();
          
          System.out.println("executeupdate : " + executeUpdate);
          
          if (executeUpdate == 1) {
             
              return true;
          }
          tx.commit();
           
       
        return false;
    }
  
   

   
    
}
