package com.TaskOfCompany.Chistoap.repository;

import com.TaskOfCompany.Chistoap.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByUserName(String userName);
}
