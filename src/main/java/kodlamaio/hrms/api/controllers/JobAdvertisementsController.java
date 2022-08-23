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

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisements")
public class JobAdvertisementsController {
	
	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	@Lazy
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);	
	}
	
	@GetMapping("/getById")
	public DataResult<JobAdvertisement> getById(@RequestParam int id){
		return this.jobAdvertisementService.getById(id);
	}
	
	@GetMapping("/getByJobAdvertisement")
	public DataResult <List<JobAdvertisement>> getByJobAdvertisement(){
		return this.jobAdvertisementService.getByJobAdvertisement();
	}
	
	@GetMapping("/getByJobAdvertisementAndCompanyName")
	public DataResult <List<JobAdvertisement>> getByJobAdvertisementAndCompanyName(@RequestParam String companyName){
		return this.jobAdvertisementService.getByJobAdvertisementAndCompanyName(companyName);
	}
	
	@GetMapping("/getByJobAdvertisementAndEmployer")
	public DataResult <List<JobAdvertisement>> getByJobAdvertisementAndEmployer(@RequestParam int id){
		return this.jobAdvertisementService.getByJobAdvertisementAndEmployer(id);
	}
	
	@GetMapping("/getAllDesc")
	public DataResult<List<JobAdvertisement>> getAllSorted(){
		return this.jobAdvertisementService.getAllSorted();
	}

}