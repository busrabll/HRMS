package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployeesService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeesDao;
import kodlamaio.hrms.entities.concretes.Employees;

@Service
public class EmployeesManager implements EmployeesService {

	private EmployeesDao employeesDao;
	
	@Autowired
	public EmployeesManager(EmployeesDao employeesDao) {
		super();
		this.employeesDao = employeesDao;
	}

	@Override
	public DataResult<List<Employees>> getAll() {
		return new SuccessDataResult<List<Employees>>
		(this.employeesDao.findAll());
	}

	@Override
	public Result add(Employees employees) {
		this.employeesDao.save(employees);
		return new SuccessResult("Employee added.");
	}
	
}