
package com.star.mapping.ManyToMany;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity 
public class Emp {
    @Id
    private int e_id;
    
    private String e_name;
    
    @ManyToMany
    private List<Projects> projects;

    public Emp() {
    }

    public Emp(int e_id, String e_name, List<Projects> projects) {
        this.e_id = e_id;
        this.e_name = e_name;
        this.projects = projects;
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public List<Projects> getProjects() {
        return projects;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
    }
    
    
    
    
}
