package in.ashoki.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import in.ashoki.entity.BranchEntity;

public interface BranchService {
	 BranchEntity findBybranchId(Integer branchId);
		
		BranchEntity findBybranchName(String branchName);
		
		Boolean existsByBranchName(String branchName);
		
		Boolean existsByBranchId(int branchId);
		public String saveBranch(BranchEntity br);
		
		 @Query(value = "select branch_name FROM branch ", nativeQuery = true)
		 List<String> findBybranchName();
		 
		 
		 @Query(value = "select * FROM dems.branch where status=?1", nativeQuery = true)
			List<BranchEntity> findBysetStatus(boolean status);
		 
		 

}
