package in.ashoki.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
public class BranchEntity {

	@Id
	@GeneratedValue
	private Integer branchId;
	private String branchName;
	private String city;
	private String state;
	private String country;
	private String phoneNumberOne;
	private String phoneNumberTwo;
	private String emailId;
	private String branchPremisesType;
	private String branchPremisesRent;
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date lastModifiedDate;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	 @Column(name = "created_date", updatable = false)
	private Date createDate;
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name="updated_date")
	private Date updateDate;
	private boolean status;
	
	@OneToOne
	EmployeeEntity employee;

}
