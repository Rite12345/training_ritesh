package in.ashoki.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashoki.entity.BranchEntity;
import in.ashoki.entity.EmployeeEntity;
import in.ashoki.repository.BranchRepo;
import in.ashoki.repository.EmpoloyeeRepo;

@Service
public class BranchServiceImpl implements BranchService {
	@Autowired
	BranchRepo branchRepo;
	
	@Autowired
	EmpoloyeeRepo empoloyeeRepo;
	
	public String saveBranch(BranchEntity br)
	{
		BranchEntity save = branchRepo.save(br);
		return "save";
		
		
	}

	@Override
	public BranchEntity findBybranchId(Integer Id) {
		Optional<EmployeeEntity> findById = empoloyeeRepo.findById(Id);
		
		return null;
	}

	@Override
	public BranchEntity findBybranchName(String branchName) {
		
		return null;
	}

	@Override
	public Boolean existsByBranchName(String branchName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean existsByBranchId(int branchId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> findBybranchName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BranchEntity> findBysetStatus(boolean status) {
		// TODO Auto-generated method stub
		return null;
	}

}
