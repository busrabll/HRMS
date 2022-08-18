package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employee;


@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
	
	private EmployeeService employeesService;
	
	@Autowired
	public EmployeesController(EmployeeService employeesService) {
		super();
		this.employeesService = employeesService;
	}

	@GetMapping("/getall")
	public DataResult<List<Employee>> getAll(){
		return this.employeesService.getAll();	
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employee employees) {
		return this.employeesService.add(employees);
	}
	
}