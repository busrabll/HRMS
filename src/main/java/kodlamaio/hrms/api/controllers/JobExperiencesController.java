package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobExperience;

@RestController
@RequestMapping("/api/jobExperiences")
public class JobExperiencesController {
	
	private JobExperienceService jobExperienceService;

	@Autowired
	@Lazy
	public JobExperiencesController(JobExperienceService jobExperienceService) {
		super();
		this.jobExperienceService = jobExperienceService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobExperience jobExperience) {
		return this.jobExperienceService.add(jobExperience);
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobExperience>> getAll(){
		return this.jobExperienceService.getAll();
	}
	
	@GetMapping("/getById")
	public DataResult<JobExperience> getById(@RequestParam int id){
		return this.jobExperienceService.getById(id);
	}
	
	@GetMapping("/getAllByJobSeekerId")
	public DataResult<List<JobExperience>> getAllByJobSeekerId(@RequestParam int id){
		return this.jobExperienceService.getAllByJobSeekerId(id);
	}
	
	@GetMapping("/getAllDesc")
	public DataResult<List<JobExperience>> getAllSorted(){
		return this.jobExperienceService.getAllSorted();
	}

}
