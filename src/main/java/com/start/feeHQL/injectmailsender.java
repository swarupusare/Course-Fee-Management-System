
package com.start.feeHQL;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class injectmailsender {
   
    MailSender mailSender;

    public MailSender getMailSender() {
        return mailSender;
    }

    public void setMailSender(MailSender mailSender) {
        this.mailSender = mailSender;
    }
    public void sendmessage(String from,String to,String msg,String subject){
        
        SimpleMailMessage createdmsg=new SimpleMailMessage();
        
        createdmsg.setFrom(from);
        createdmsg.setTo(to);
        createdmsg.setSubject(subject);
        createdmsg.setText(msg);
        
        mailSender.send(createdmsg);
    }
}
