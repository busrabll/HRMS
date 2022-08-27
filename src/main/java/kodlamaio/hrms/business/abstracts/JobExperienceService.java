package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobExperience;

public interface JobExperienceService {
	Result add(JobExperience jobExperience);
	
	DataResult<List<JobExperience>> getAll();
	
	DataResult<List<JobExperience>> getAllSorted();
	
	DataResult<JobExperience> getById(int id);
	
	DataResult<List<JobExperience>> getAllByJobSeekerId(int id);

}
