package in.chaithanya;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.chaithanya.Service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		EmployeeService employeeService=context.getBean(EmployeeService.class);
		
		employeeService.saveData();
	}

}
