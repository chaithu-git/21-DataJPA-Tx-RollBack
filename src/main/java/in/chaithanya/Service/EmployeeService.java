package in.chaithanya.Service;

import org.springframework.stereotype.Service;

import in.chaithanya.entity.Address;
import in.chaithanya.entity.Employee;
import in.chaithanya.repository.AddressRepository;
import in.chaithanya.repository.EmployeeRepository;
import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	
	private AddressRepository addressRepository;
	
	private EmployeeRepository employeeRepository;

	public EmployeeService(AddressRepository addressRepository, EmployeeRepository employeeRepository) {
		super();
		this.addressRepository = addressRepository;
		this.employeeRepository = employeeRepository;
	}
	@Transactional(rollbackOn=Exception.class)
	public void saveData() {
		
		Employee emp=new Employee();
		emp.setEmpId(100);
		emp.setEmpName("chaithanya");
		emp.setEmpSal("25000");
		employeeRepository.save(emp);
		
		//int  i=100/0;
		
		Address add=new Address();
		add.setAddrId(110);
		add.setEmpId(9622);
		add.setCity("hyderabad");
		add.setCountry("India");
		add.setState("Telangana");
		addressRepository.save(add);
		
		
	}
	

}
