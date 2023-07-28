package in.ashoki.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashoki.entity.EmployeeEntity;
import in.ashoki.repository.EmpoloyeeRepo;
import in.ashoki.service.EmployeeService;

@RestController

public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	EmpoloyeeRepo empoloyeeRepo;
	@PostMapping("/saveEmp")
	public String saveEmpl(@RequestBody EmployeeEntity employee )
	{
		 EmployeeEntity saveEmpolyee = employeeService.saveEmpolyee(employee);
		return "saveEmpolyee";
		
	}
	
	@PostMapping("/add/{name}")
	public String findByEmp(@PathVariable String name,@RequestBody EmployeeEntity employee)
	{
		EmployeeEntity findByName = empoloyeeRepo.findByName(name);
		if(findByName!=null)
		{
			empoloyeeRepo.save(employee);
			return "data save11111";
			
		}else {
			return "name not exist";
		}
		
		
	}
	{
		
	}
	

}
