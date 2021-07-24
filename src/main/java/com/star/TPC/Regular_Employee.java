
package com.star.TPC;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Regular_Employee")
//@PrimaryKeyJoinColumn(name="ID")  
@DiscriminatorValue(value = "Regular_Employee")
public class Regular_Employee extends Employee{
    
    @Column(name ="Salary")
    private float salary;
    
    @Column(name = "Bonus")
    private int bonus;

    public Regular_Employee() {
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
    
}
