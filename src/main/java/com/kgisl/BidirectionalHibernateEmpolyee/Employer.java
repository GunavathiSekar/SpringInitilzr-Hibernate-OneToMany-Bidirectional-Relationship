package com.kgisl.BidirectionalHibernateEmpolyee;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;
import javax.persistence.OneToMany;  
  
@Entity  
public class Employer  
{  
    private Long id;  
    private String employerName;  
    private Set<Employee> employees;  //instead of list unlike eventapp we use set here(no problm)
      
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
    public Long getId()  
    {  
        return id;  
    }  
    public void setId(Long id)  
    {  
        this.id = id;  
    }  
    public String getEmployerName()  
    {  
        return employerName;  
    }  
    public void setEmployerName(String employerName)  
    {  
        this.employerName = employerName;  
    }  
      
    @OneToMany(cascade=CascadeType.ALL, mappedBy="employer")  
    public Set<Employee> getEmployees()   // in unidirectional we will not be having this employer set and get so in unidirectional employer cannot view who are all his employees but here bot know each other.
    {  
        return employees;  
    }  
    public void setEmployees(Set<Employee> employees)  
    {  
        this.employees = employees;  
    } 
} 