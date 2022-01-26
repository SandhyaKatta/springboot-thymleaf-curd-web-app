package net.codejava.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import net.codejava.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

	

	

}
