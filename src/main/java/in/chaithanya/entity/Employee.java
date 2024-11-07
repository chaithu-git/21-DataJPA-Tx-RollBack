package in.chaithanya.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EMP_TBL")
public class Employee {
	
	public Employee(Integer empId, String empName, String empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="Emp_Id")
	private Integer empId;
	
	@Column(name="Emp_Name")
	private String empName;
	
	@Column(name="Emp_Sal")
	private String empSal;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSal() {
		return empSal;
	}

	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}
	
	

}
