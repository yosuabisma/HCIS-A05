package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeMapper;
import com.example.model.EmployeeModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmployeeServiceDatabase implements EmployeeService{
	@Autowired
	EmployeeMapper employeeMapper;
	@Override
	public EmployeeModel viewEmployee(int id) {
		return employeeMapper.viewEmployee(id);
	}
	@Override
	public List<EmployeeModel> viewAllEmployees() {
		return employeeMapper.viewAllEmployees();
	}
	@Override
	public void addEmployee(EmployeeModel employee) {
		employeeMapper.addEmployee(employee);
	}
	@Override
	public void updateEmployee(EmployeeModel employee) {
		employeeMapper.updateEmployee(employee);
	}
	@Override
	public void setInactiveEmployee(int id) {
		employeeMapper.setInactiveEmployee(id);
	}

}
