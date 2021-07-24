
package com.start.feeHQL;

import java.io.File;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class sessionfactorycreater {
    
    public static SessionFactory sessionfactory;
    
    public static SessionFactory getfactory(){
        
        if (sessionfactory == null) {
              
            sessionfactory = new Configuration().configure(new File("src/main/java/hibernate.cfg_3.xml")).buildSessionFactory();

        }
        
        
        return sessionfactory;
        
    }
}
