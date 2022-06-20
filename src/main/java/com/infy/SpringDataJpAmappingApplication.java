package com.infy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infy.dto.Department;
import com.infy.dto.DepartmentDTO;
import com.infy.dto.Employee;
import com.infy.dto.EmployeeDTO;
import com.infy.service.EmployeeService;

@SpringBootApplication
public class SpringDataJpAmappingApplication implements CommandLineRunner {

	@Autowired
	EmployeeService service;
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpAmappingApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//addEmployee();
		//addDepartment();
		//getDepartment();
		//addEmployeeDept();
		getEmpDept();
	}
	
	public void getEmpDept() {
		System.out.println(service.getEmpDept(2));
		
	}
	//public void addEmployeeDept() {
	//	service.addEmployeeDept();
		
	//}
	
	
	
	//public void getDepartment() {
		//Department dept=service.getDepartment(1001);
		//List<Employee> empList=dept.getEmpList();
		//for( Employee e:empList)
		//	System.out.println(e.getEmpId()+"  "+e.getEmpName()+"  "+e.getEmpSal());
	//}
	
	

	//public void addDepartment() {
		//service.addDepartment();
		
	//}
	
	
	//public void addEmployee() {
		//DepartmentDTO deptdto=new DepartmentDTO(100,"Sales");
		//EmployeeDTO dto=new EmployeeDTO(1,"Umesh", 5000, deptdto);
		//service.addEmployee(dto);
	//}
}
