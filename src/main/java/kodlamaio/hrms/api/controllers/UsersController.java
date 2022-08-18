package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.User;

import java.util.List;

@RestController 
@RequestMapping("/api/users")
public class UsersController {

	private UserService usersService;
	
	@Autowired
	public UsersController(UserService usersService) {
		super();
		this.usersService = usersService;
	}

	@GetMapping("/getall")
	public DataResult<List<User>> getAll(){	
		return this.usersService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody User users) {
		return this.usersService.add(users);
	}
	
}