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

import kodlamaio.hrms.business.abstracts.SkillService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Skill;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {
	
	private SkillService skillService;

	@Autowired
	@Lazy
	public SkillsController(SkillService skillService) {
		super();
		this.skillService = skillService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Skill skill) {
		return this.skillService.add(skill);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Skill>> getAll(){
		return this.skillService.getAll();
	}
	
	@GetMapping("/getById")
	public DataResult<Skill> getById(@RequestParam int id){
		return this.skillService.getById(id);
	}
	
	@GetMapping("/getAllByJobSeekerId")
	public DataResult<List<Skill>> getAllByJobSeekerId(@RequestParam int id){
		return this.skillService.getAllByJobSeekerId(id);
	}
	
}
