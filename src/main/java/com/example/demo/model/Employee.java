package com.example.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // 
public class Employee {
	
	@Column(name ="First_name")
    private Boolean name;

    @Id
    private Long id;
    
    
    
    
	
    public Employee(Boolean name, Long id) {
        this.name = name;
        this.id = id;
    }

    
    public Employee() {

    }



    public Boolean getName() {
        return name;
    }

    public void setName(Boolean name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
