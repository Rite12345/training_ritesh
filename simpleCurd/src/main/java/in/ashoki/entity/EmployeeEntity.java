package in.ashoki.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class EmployeeEntity {
	
	@Id
	private Integer id;
	private String name;
	private String desg;
	
	

}
