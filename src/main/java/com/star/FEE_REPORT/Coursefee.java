/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.star.FEE_REPORT;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "coursefee", catalog = "fee_report_data", schema = "")
@NamedQueries({
    @NamedQuery(name = "Coursefee.findAll", query = "SELECT c FROM Coursefee c")
    , @NamedQuery(name = "Coursefee.findByCid", query = "SELECT c FROM Coursefee c WHERE c.cid = :cid")
    , @NamedQuery(name = "Coursefee.findByFee", query = "SELECT c FROM Coursefee c WHERE c.fee = :fee")
    , @NamedQuery(name = "Coursefee.findByCourse", query = "SELECT c FROM Coursefee c WHERE c.course = :course")})
public class Coursefee implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cid")
    private Integer cid;
    @Column(name = "Fee")
    private String fee;
    @Column(name = "Course")
    private String course;

    public Coursefee() {
    }

    public Coursefee(Integer cid) {
        this.cid = cid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        Integer oldCid = this.cid;
        this.cid = cid;
        changeSupport.firePropertyChange("cid", oldCid, cid);
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        String oldFee = this.fee;
        this.fee = fee;
        changeSupport.firePropertyChange("fee", oldFee, fee);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        String oldCourse = this.course;
        this.course = course;
        changeSupport.firePropertyChange("course", oldCourse, course);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cid != null ? cid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coursefee)) {
            return false;
        }
        Coursefee other = (Coursefee) object;
        if ((this.cid == null && other.cid != null) || (this.cid != null && !this.cid.equals(other.cid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.star.FEE_REPORT.Coursefee[ cid=" + cid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
