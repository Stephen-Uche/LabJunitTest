package com.example.employment;

import com.example.employment.Employee;

import java.util.List;

public interface EmployeeRepository {

	List<Employee> findAll();

	Employee save(Employee e);
}
