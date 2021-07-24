
package com.star.mapping.ManyToMany;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Projects {
    @Id
     private int p_id;
     
     private String p_name;
     
     @ManyToMany(mappedBy ="projects")
     private List<Emp> employees;

    public Projects() {
    }

    public Projects(int p_id, String p_name, List<Emp> employees) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.employees = employees;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public List<Emp> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Emp> employees) {
        this.employees = employees;
    }
    
     
    
}
