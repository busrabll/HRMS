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

import kodlamaio.hrms.business.abstracts.ForeignLanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.ForeignLanguage;

@RestController
@RequestMapping("/api/foreignLanguages")
public class ForeignLanguagesController {
	
	private ForeignLanguageService foreignLanguageService;

	@Autowired
	@Lazy
	public ForeignLanguagesController(ForeignLanguageService foreignLanguageService) {
		super();
		this.foreignLanguageService = foreignLanguageService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ForeignLanguage foreignLanguage) {
		return this.foreignLanguageService.add(foreignLanguage);
	}
	
	@GetMapping("/getall")
	public DataResult<List<ForeignLanguage>> getAll(){
		return this.foreignLanguageService.getAll();
	}
	
	@GetMapping("/getById")
	public DataResult<ForeignLanguage> getById(@RequestParam int id){
		return this.foreignLanguageService.getById(id);
	}
	
	@GetMapping("/getAllByJobSeekerId")
	public DataResult<List<ForeignLanguage>> getAllByJobSeekerId(@RequestParam int id){
		return this.foreignLanguageService.getAllByJobSeekerId(id);
	}

}
