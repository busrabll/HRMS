package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	DataResult<List<JobAdvertisement>> getAll();
	
	DataResult<List<JobAdvertisement>> getAllSorted();
	
	Result add(JobAdvertisement jobAdvertisement);
	
	DataResult <JobAdvertisement> getById(int id);

	DataResult <List<JobAdvertisement>> getByJobAdvertisement();

	DataResult <List<JobAdvertisement>> getByJobAdvertisementAndCompanyName(String companyName);

	DataResult <List<JobAdvertisement>> getByJobAdvertisementAndEmployer(int id);
	
}