
package com.star.mapping.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
    
    @Id
    private int answer_Id;
    
    private String answer;
   
    @OneToOne
    private Question question;

    public Answer() {
    }

    
    public int getAnswer_Id() {
        return answer_Id;
    }

    public void setAnswer_Id(int answer_Id) {
        this.answer_Id = answer_Id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
    
    
    
}
