package in.chaithanya.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.chaithanya.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Serializable> {
	

}
