package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.hrms.business.abstracts.JobTitlesService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobTitles;


@RestController
@RequestMapping("/api/jobTitles")
public class JobTitlesController {
	
	private JobTitlesService jobTitlesService;
	
	@Autowired
	public JobTitlesController(JobTitlesService jobTitlesService) {
		super();
		this.jobTitlesService = jobTitlesService;
	}

	@GetMapping("/getall")
	public DataResult<List<JobTitles>> getAll(){
		return this.jobTitlesService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobTitles jobTitles) {
		return this.jobTitlesService.add(jobTitles);	
	}
	
}