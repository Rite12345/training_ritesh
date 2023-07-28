package in.ashoki.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashoki.entity.EmployeeEntity;
import in.ashoki.repository.EmpoloyeeRepo;

@Service
public class EmployeeServiceImpl  implements EmployeeService{

	@Autowired
	EmpoloyeeRepo empoloyeeRepo;

	@Override
	public EmployeeEntity saveEmpolyee(EmployeeEntity employee) {
		EmployeeEntity save = empoloyeeRepo.save(employee);
		return save;
	}

	@Override
	public EmployeeEntity findById(Integer id) {
		
		return null;
	}

	@Override
	public EmployeeEntity findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
