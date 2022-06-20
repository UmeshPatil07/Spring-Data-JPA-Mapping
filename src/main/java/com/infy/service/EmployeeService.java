package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.Department;
import com.infy.dto.Employee;
import com.infy.dto.EmployeeDTO;
import com.infy.repository.DepartmentRepository;
import com.infy.repository.EmployeeRepository;



@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repository;
	@Autowired
	DepartmentRepository deptrepo;
	
	public Employee getEmpDept(int Id) {
		Employee e= repository.findById(Id).get();
		return e;
		
	}
	
	//public boolean addEmployeeDept() {
	//	Department dept=new Department();
		//dept.setDeptId(201);
		//dept.setDeptName("Developers");
		
		//Employee emp1=new Employee(1,"Rohit",6000,dept);
		//Employee emp2=new Employee(2,"Pavan",4000,dept);
		//Employee emp3=new Employee(3,"Hitesh",8000,dept);
		//repository.save(emp1);
		//repository.save(emp2);
	//	repository.save(emp3);
	//	return true;
	//}
	
	//public Department getDepartment(int id) {
		//Department dept=deptrepo.findById(id).get();
		//return dept;
	//}
	//public boolean addDepartment() {
		
		//Employee emp1=new Employee(1,"Rohit",6000);
		//Employee emp2=new Employee(2,"Pavan",4000);
		//Employee emp3=new Employee(3,"Hitesh",8000);
		
		//Department dept=new Department();
		//dept.setDeptId(1001);
		//dept.setDeptName("Logistic");
		//dept.getEmpList().add(emp1);
		//dept.getEmpList().add(emp2);
		//dept.getEmpList().add(emp3);
		//deptrepo.save(dept);
	//	return true;
	//}
	
	
	
	
	//public boolean addEmployee(EmployeeDTO dto) {
		//Department dept=new Department();
		//dept.setDeptId(dto.getDepartment().getDeptId());
		//dept.setDeptName(dto.getDepartment().getDeptName());
		
		//Employee emp= new Employee();
		//emp.setEmpId(dto.getEmpId());
		//emp.setEmpName(dto.getEmpName());
		//emp.setEmpSal(dto.getEmpSal());
		//emp.setDepartment(dept);
		//repository.save(emp);
		//return true;
		
	//}
	

}
