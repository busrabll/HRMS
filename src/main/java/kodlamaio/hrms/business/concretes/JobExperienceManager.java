package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobExperienceDao;
import kodlamaio.hrms.entities.concretes.JobExperience;

@Service
public class JobExperienceManager implements JobExperienceService {
	
	private JobExperienceDao jobExperienceDao;

	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}

	@Override
	public Result add(JobExperience jobExperience) {
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("Job experience added.");
	}

	@Override
	public DataResult<List<JobExperience>> getAll() {
		return new SuccessDataResult<List<JobExperience>>
		(this.jobExperienceDao.findAll());
	}

	@Override
	public DataResult<JobExperience> getById(int id) {
		return new SuccessDataResult<JobExperience>
		(this.jobExperienceDao.getById(id));
		
	}

	@Override
	public DataResult<List<JobExperience>> getAllByJobSeekerId(int id) {
		return new SuccessDataResult<List<JobExperience>>
		(this.jobExperienceDao.getAllByJobSeekerId(id));
	}

	@Override
	public DataResult<List<JobExperience>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC, "endYear");
		return new SuccessDataResult<List<JobExperience>>
		(this.jobExperienceDao.findAll(sort), "Successful");
	}

}