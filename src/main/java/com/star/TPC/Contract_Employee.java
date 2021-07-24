
package com.star.TPC;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Contract_Employee")
//@PrimaryKeyJoinColumn(name="ID")
@DiscriminatorValue(value = "Contract_Employee")
public class Contract_Employee extends Employee{
    
    private float pay_per_hour;
    
    private String contract_duration;

    public Contract_Employee() {
    }

    public float getPay_per_hour() {
        return pay_per_hour;
    }

    public void setPay_per_hour(float pay_per_hour) {
        this.pay_per_hour = pay_per_hour;
    }

    public String getContract_duration() {
        return contract_duration;
    }

    public void setContract_duration(String contract_duration) {
        this.contract_duration = contract_duration;
    }
    
    
}
