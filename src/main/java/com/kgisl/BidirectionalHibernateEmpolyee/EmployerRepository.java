//instead of dao we are giving repository


package com.kgisl.BidirectionalHibernateEmpolyee;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * EmployerRepository
 */
public interface EmployerRepository extends JpaRepository<Employer,Long>{
    
}