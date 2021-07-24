
package com.star.mapping.OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "answer1")
public class Answer1 {
    
     @Id
     private int a_id;
      
     private String ans;
     
     
     @ManyToOne
     @JoinColumn(name = "Question_ID")
     private Question1 question1;


    public Answer1() {
    }

    public Answer1(int a_id, String ans, Question1 question1) {
        this.a_id = a_id;
        this.ans = ans;
        this.question1 = question1;
    }
    

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

   

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public Question1 getQuestion1() {
        return question1;
    }

    public void setQuestion1(Question1 question1) {
        this.question1 = question1;
    }
    
     
      
}
