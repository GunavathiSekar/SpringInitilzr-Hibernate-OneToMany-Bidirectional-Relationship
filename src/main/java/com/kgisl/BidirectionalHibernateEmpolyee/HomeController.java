package com.kgisl.BidirectionalHibernateEmpolyee;

import java.util.HashSet;  
import java.util.Set;  
  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.ModelMap;  
import org.springframework.web.bind.annotation.RequestMapping;  
// import com.kgisl.BidirectionalHibernateEmpolyee.EmployerDao;
import com.kgisl.BidirectionalHibernateEmpolyee.Employee;
import com.kgisl.BidirectionalHibernateEmpolyee.Employer;

  
@Controller  
public class HomeController    // in this class we have given that 1. and 2.
{  
  @Autowired  
  EmployerRepository employerRepository;  
    
    @RequestMapping("/test")   //request mapping should be passes to either servlet page or jsp page but there is no such pages so localhost:8080/test will have just a error page but this class ran and gives result in h2 db        
    public void test (ModelMap model)  
    {  
        Employer employer = new Employer();  
        employer.setEmployerName("Employer 1");  // in employer table "Employer 1" will be inserted
          
        Set<Employee> employees = new HashSet<Employee>();  //we use hashset for inserting employees
          
        Employee employee1 = new Employee();            //creating new emplyees
        employee1.setEmployeeName("Trevor Page");       //insserting "Trevor page" in employee table
        employee1.setEmployer(employer);  
        employees.add(employee1);  
          
        Employee employee2 = new Employee();   
        employee2.setEmployeeName("John Doe");          //inserting "john doe" in employee table
        employee2.setEmployer(employer);  
        employees.add(employee2);  
          
        employer.setEmployees(employees);  
          
        employerRepository.save(employer);  //there is no save method in repository so in localhost:8080/swagger-ui.html page will have save method error.
  
       
    }  
}  