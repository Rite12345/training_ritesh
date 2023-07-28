package in.ashoki.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashoki.entity.EmployeeEntity;

public interface EmpoloyeeRepo extends JpaRepository<EmployeeEntity,Serializable> {
	EmployeeEntity findByName(String name);
	

}
