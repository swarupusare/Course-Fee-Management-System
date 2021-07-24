
package com.start.feeHQL;

import com.start.feeEntities.AddAccountant;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class NewMain {

    public static void addaccountantsave(String name,String password,String email,String number) {
        
        
        SessionFactory factory = sessionfactorycreater.getfactory();
        
        AddAccountant a1=new AddAccountant();
        
        a1.setName(name);
        a1.setPassword(password);
        a1.setEmail(email);
        a1.setContactNo(number);
        a1.setTime(new Date());
        a1.setDate(new Date());
        
        
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();                   
        session.save(a1);
        tx.commit();

    }
    public static boolean checkaccountant(String accname,String accpassword){
         SessionFactory factory = sessionfactorycreater.getfactory();
         AddAccountant a1=new AddAccountant();
        

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();
                   
         Criteria c=session.createCriteria(AddAccountant.class);
         c.add(Restrictions.eq("name",accname ));
         c.add(Restrictions.eq("password", accpassword));
        List<AddAccountant> list = c.list();
         if(list.isEmpty()){
             return false;
         }
         
        return true;
        
    }
   
    
}
