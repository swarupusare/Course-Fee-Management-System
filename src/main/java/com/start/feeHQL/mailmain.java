
package com.start.feeHQL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class mailmain {

    
    public static void sendemailmessage(String tomail,String nameemail,String courseemail){
        String lo="src/main/java/com/start/feeHQL/emailconfig.xml";
        ApplicationContext ct=new FileSystemXmlApplicationContext(lo);
        injectmailsender beanmailsender = (injectmailsender) ct.getBean("m");
        String from="swarupusare@gmail.com";
        String to=tomail;
        String msg="congratulation ! for  joining  "+courseemail+"  course to techgroup academy";
        String subject=" Welcome "+ nameemail;
        
        beanmailsender.sendmessage(from, to, msg, subject);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
