package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;


@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	
	private EmployerService employersService;
	
	@Autowired
	public EmployersController(EmployerService employersService) {
		super();
		this.employersService = employersService;
	}

	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this.employersService.getAll();	
	}
	
	@PostMapping("/add") 
	public Result add(@RequestBody Employer employers) {
		return this.employersService.add(employers);
	}
	
}