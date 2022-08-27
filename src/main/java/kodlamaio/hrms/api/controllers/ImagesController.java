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

import kodlamaio.hrms.business.abstracts.ImageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Image;

@RestController
@RequestMapping("/api/images")
public class ImagesController {
	
	private ImageService imageService;

	@Autowired
	@Lazy
	public ImagesController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Image image) {
		return this.imageService.add(image);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Image>> getAll(){
		return this.imageService.getAll();
	}
	
	@GetMapping("/getById")
	public DataResult<Image> getById(@RequestParam int id){
		return this.imageService.getById(id);
	}
	
	@GetMapping("/getAllByJobSeekerId")
	public DataResult<Image> getAllByJobSeekerId(@RequestParam int id){
		return this.imageService.getById(id);
	}

}
