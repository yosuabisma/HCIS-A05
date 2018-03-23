package com.example.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.model.EmployeeModel;

public interface EmployeeService {
	EmployeeModel viewEmployee(@Param("id") int id);
	List<EmployeeModel> viewAllEmployees();
	void addEmployee(EmployeeModel employee);
	void updateEmployee(EmployeeModel employee);
	void setInactiveEmployee(@Param("id") int id);
}
