package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SchoolService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SchoolDao;
import kodlamaio.hrms.entities.concretes.School;

@Service
public class SchoolManager implements SchoolService {
	
	private SchoolDao schoolDao;

	@Autowired
	public SchoolManager(SchoolDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}

	@Override
	public Result add(School school) {
		this.schoolDao.save(school);
		return new SuccessResult("School added.");
	}

	@Override
	public DataResult<List<School>> getAll() {
		return new SuccessDataResult<List<School>>
		(this.schoolDao.findAll());
	}

	@Override
	public DataResult<School> getById(int id) {
		return new SuccessDataResult<School>
		(this.schoolDao.getById(id));
	}

	@Override
	public DataResult<List<School>> getAllByJobSeekerId(int id) {
		return new SuccessDataResult<List<School>>
		(this.schoolDao.getAllByJobSeekerId(id));
	}

	@Override
	public DataResult<List<School>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC, "endYear");
		return new SuccessDataResult<List<School>>
		(this.schoolDao.findAll(sort), "Successful");
	}

}