package com.javaguide.Springboot_backend;

import com.javaguide.Springboot_backend.model.Employee;
import com.javaguide.Springboot_backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);

	}
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String[] args) throws Exception{
//		Employee emp=new Employee();
//		emp.setFirstName("Ramesh");
//		emp.setLastName("cadaver");
//		emp.setEmailId("ramesh@gmail.com");
//		employeeRepository.save(emp);
//
//		Employee emp2=new Employee();
//		emp2.setFirstName("Rocky");
//		emp2.setLastName("mishra");
//		emp2.setEmailId("rocky@gmail.com");
//		employeeRepository.save(emp2);
	}

}
