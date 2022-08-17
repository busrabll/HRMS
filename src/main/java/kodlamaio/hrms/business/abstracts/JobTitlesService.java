package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobTitles;


public interface JobTitlesService {
	DataResult<List<JobTitles>> getAll();
	Result add(JobTitles jobTitles);
}
