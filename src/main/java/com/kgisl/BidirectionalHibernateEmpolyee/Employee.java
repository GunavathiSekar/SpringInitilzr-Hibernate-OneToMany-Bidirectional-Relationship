package com.kgisl.BidirectionalHibernateEmpolyee;

import javax.persistence.CascadeType;  
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;  
import javax.persistence.ManyToOne;  
  
@Entity  
public class Employee  
{  
    private Long id;  
    private String employeeName;  //BI-DIRECTIONAL
    private Employer employer;   //employee s d  chld cls where as employer is d parnt  cls
                                // since employee cls has employer as private the employees will knw who s d employer.
                                // employer class also has private employee so employer also kknow who are his emploees

      
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
    public String getEmployeeName()  
    {  
        return employeeName;  
    }  
    public void setEmployeeName(String employeeName)  
    {  
        this.employeeName = employeeName;  
    }  
    @ManyToOne(cascade=CascadeType.ALL)  // many 2 one, one employer has many employees and many employees has only one employer.
    public Employer getEmployer()  
    {  
        return employer;  
    }  
    public void setEmployer(Employer employer)  
    {  
        this.employer = employer;  
    }  
}  