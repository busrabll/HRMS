package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobTitlesService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobTitlesDao;
import kodlamaio.hrms.entities.concretes.JobTitles;

@Service
public class JobTitlesManager implements JobTitlesService  {

	@Autowired
	private JobTitlesDao jobTitlesDao;
	
	public JobTitlesManager(JobTitlesDao jobTitlesDao) {
		super();
		this.jobTitlesDao = jobTitlesDao;
	}

	@Override
	public DataResult<List<JobTitles>> getAll() {
		
		return new SuccessDataResult<List<JobTitles>>
		(this.jobTitlesDao.findAll());
	}

	@Override
	public Result add(JobTitles jobTitles) {
		this.jobTitlesDao.save(jobTitles);
		return new SuccessResult("Job title added.");
	}
	
}