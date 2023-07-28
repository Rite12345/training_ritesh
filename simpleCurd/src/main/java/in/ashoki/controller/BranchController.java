package in.ashoki.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashoki.entity.BranchEntity;
import in.ashoki.repository.EmpoloyeeRepo;
import in.ashoki.service.BranchService;

@RestController
public class BranchController {
	@Autowired
	EmpoloyeeRepo empoloyeeRepo;
	
	@Autowired
	BranchService branchService;
	
	
	@PostMapping("/save")
	public String saveBranch( @RequestBody BranchEntity be)
	{
		String saveBranch = branchService.saveBranch(be);
		return saveBranch;
		
		
	}
	
//	@PostMapping("update/{id}")
//	public String addByEmpId(@PathVariable Integer id)
//	
//	
	

}
