/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.star.FEE_REPORT;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "addstudent", catalog = "fee_report_data", schema = "")
@NamedQueries({
    @NamedQuery(name = "Addstudent_1.findAll", query = "SELECT a FROM Addstudent_1 a")
    , @NamedQuery(name = "Addstudent_1.findById", query = "SELECT a FROM Addstudent_1 a WHERE a.id = :id")
    , @NamedQuery(name = "Addstudent_1.findByAddeddate", query = "SELECT a FROM Addstudent_1 a WHERE a.addeddate = :addeddate")
    , @NamedQuery(name = "Addstudent_1.findByAddress", query = "SELECT a FROM Addstudent_1 a WHERE a.address = :address")
    , @NamedQuery(name = "Addstudent_1.findByCity", query = "SELECT a FROM Addstudent_1 a WHERE a.city = :city")
    , @NamedQuery(name = "Addstudent_1.findByCourse", query = "SELECT a FROM Addstudent_1 a WHERE a.course = :course")
    , @NamedQuery(name = "Addstudent_1.findByLastTimepay", query = "SELECT a FROM Addstudent_1 a WHERE a.lastTimepay = :lastTimepay")
    , @NamedQuery(name = "Addstudent_1.findByEmail", query = "SELECT a FROM Addstudent_1 a WHERE a.email = :email")
    , @NamedQuery(name = "Addstudent_1.findByFee", query = "SELECT a FROM Addstudent_1 a WHERE a.fee = :fee")
    , @NamedQuery(name = "Addstudent_1.findByName", query = "SELECT a FROM Addstudent_1 a WHERE a.name = :name")
    , @NamedQuery(name = "Addstudent_1.findByPaid", query = "SELECT a FROM Addstudent_1 a WHERE a.paid = :paid")
    , @NamedQuery(name = "Addstudent_1.findByState", query = "SELECT a FROM Addstudent_1 a WHERE a.state = :state")
    , @NamedQuery(name = "Addstudent_1.findByTime", query = "SELECT a FROM Addstudent_1 a WHERE a.time = :time")})
public class Addstudent_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "addeddate")
    @Temporal(TemporalType.DATE)
    private Date addeddate;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "course")
    private String course;
    @Column(name = "LastTime_pay")
    private String lastTimepay;
    @Column(name = "email")
    private String email;
    @Column(name = "fee")
    private String fee;
    @Column(name = "name")
    private String name;
    @Column(name = "paid")
    private String paid;
    @Column(name = "state")
    private String state;
    @Column(name = "time")
    @Temporal(TemporalType.TIME)
    private Date time;

    public Addstudent_1() {
    }

    public Addstudent_1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public Date getAddeddate() {
        return addeddate;
    }

    public void setAddeddate(Date addeddate) {
        Date oldAddeddate = this.addeddate;
        this.addeddate = addeddate;
        changeSupport.firePropertyChange("addeddate", oldAddeddate, addeddate);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        String oldCourse = this.course;
        this.course = course;
        changeSupport.firePropertyChange("course", oldCourse, course);
    }

    public String getLastTimepay() {
        return lastTimepay;
    }

    public void setLastTimepay(String lastTimepay) {
        String oldLastTimepay = this.lastTimepay;
        this.lastTimepay = lastTimepay;
        changeSupport.firePropertyChange("lastTimepay", oldLastTimepay, lastTimepay);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        String oldFee = this.fee;
        this.fee = fee;
        changeSupport.firePropertyChange("fee", oldFee, fee);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        String oldPaid = this.paid;
        this.paid = paid;
        changeSupport.firePropertyChange("paid", oldPaid, paid);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        String oldState = this.state;
        this.state = state;
        changeSupport.firePropertyChange("state", oldState, state);
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        Date oldTime = this.time;
        this.time = time;
        changeSupport.firePropertyChange("time", oldTime, time);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Addstudent_1)) {
            return false;
        }
        Addstudent_1 other = (Addstudent_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.star.FEE_REPORT.Addstudent_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
