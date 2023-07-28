package in.ashoki.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashoki.entity.BranchEntity;

public interface BranchRepo extends JpaRepository<BranchEntity,Serializable> {
	//public BranchEntity save(BranchEntity br);
	

}
