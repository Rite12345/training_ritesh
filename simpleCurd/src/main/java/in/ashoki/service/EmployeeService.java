package in.ashoki.service;

import org.springframework.data.jpa.repository.Query;

import in.ashoki.entity.EmployeeEntity;

public interface EmployeeService {
	
	//EmployeeEntity saveEmp(EmployeeEntity employee);
	
	public EmployeeEntity saveEmpolyee(EmployeeEntity employee);
	EmployeeEntity findById(Integer id);
	EmployeeEntity findByName(String name);
	

}
