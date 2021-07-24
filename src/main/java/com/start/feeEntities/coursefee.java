
package com.start.feeEntities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class coursefee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;
    
    @Column(name = "Course")
    private String cname;
    
    @Column(name = "Fee")
    private String cfee;

    public coursefee() {
    }

    public coursefee(int cid, String cname, String cfee) {
        this.cid = cid;
        this.cname = cname;
        this.cfee = cfee;
    }

    public coursefee(String cname, String cfee) {
        this.cname = cname;
        this.cfee = cfee;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCfee() {
        return cfee;
    }

    public void setCfee(String cfee) {
        this.cfee = cfee;
    }
    
    
    
    
            
    
}
