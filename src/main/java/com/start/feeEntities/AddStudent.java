
package com.start.feeEntities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class AddStudent {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String name;
    
    private String email;
    
    private String course;
    
    private String fee;
    
    private String paid;
    
    @Column(name = "LastTime_pay")
    private String due;
    
    private String address;
    
    private String city;
    
    private String state ;
    @Column(name = "ContactNo")
    private String contactno;
    
    @Temporal(TemporalType.TIME)
    private Date time;
    
    @Temporal(TemporalType.DATE)
    private Date addeddate;
    
    

    public AddStudent() {
    }

    public AddStudent(int id, String name, String email, String course, String fee, String paid, String due, String address, String city, String state, String contactno, Date time, Date addeddate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        this.fee = fee;
        this.paid = paid;
        this.due = due;
        this.address = address;
        this.city = city;
        this.state = state;
        this.contactno = contactno;
        this.time = time;
        this.addeddate = addeddate;
    }

    public AddStudent(String name, String email, String course, String fee, String paid, String due, String address, String city, String state, String contactno, Date time, Date addeddate) {
        this.name = name;
        this.email = email;
        this.course = course;
        this.fee = fee;
        this.paid = paid;
        this.due = due;
        this.address = address;
        this.city = city;
        this.state = state;
        this.contactno = contactno;
        this.time = time;
        this.addeddate = addeddate;
    }

   
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getAddeddate() {
        return addeddate;
    }

    public void setAddeddate(Date addeddate) {
        this.addeddate = addeddate;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }
    
    
    
    
    
    
    
}
