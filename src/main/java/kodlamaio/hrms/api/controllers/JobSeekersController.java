package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeeker;

import java.util.List;

@RestController
@RequestMapping("/api/jobSeekers")
public class JobSeekersController {
	
	private JobSeekerService jobSeekersService;
	
	@Autowired
	public JobSeekersController(JobSeekerService jobSeekersService) {
		super();
		this.jobSeekersService = jobSeekersService;
	}

	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getAll(){
		return this.jobSeekersService.getAll();	
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeeker jobSeekers) {
		return this.jobSeekersService.add(jobSeekers);
	}
	
}