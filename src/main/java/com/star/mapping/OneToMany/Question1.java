package com.star.mapping.OneToMany;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.Id;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;


@Entity
public class Question1 {
    
    @Id
     private int q_id;
      
     private String q_name;
     
     @OneToMany(mappedBy = "question1",fetch =FetchType.EAGER,cascade = CascadeType.ALL)
     private List<Answer1> ans;

    public Question1() {
        
    }

    public Question1(int q_id, String q_name, List<Answer1> ans) {
        this.q_id = q_id;
        this.q_name = q_name;
        this.ans = ans;
    }
    

    public String getQ_name() {
        return q_name;
    }

    public void setQ_name(String q_name) {
        this.q_name = q_name;
    }

    public List<Answer1> getAns() {
        return ans;
    }

    public void setAns(List<Answer1> ans) {
        this.ans = ans;
    }

     
    public int getQ_id() {
        return q_id;
    }

    public void setQ_id(int q_id) {
        this.q_id = q_id;
    }

    @Override
    public String toString() {
        return "Question1{" + "q_id=" + q_id + ", q_name=" + q_name + ", ans=" + ans + '}';
    }

     
    
      
    
}
