package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Image;

public interface ImageService {
	Result add(Image image);
	
	DataResult<List<Image>> getAll();
	
	DataResult<Image> getById(int id);
	
	DataResult<Image> getAllByJobSeekerId(int id);
}
