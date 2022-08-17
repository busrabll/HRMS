package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employees;


public interface EmployeesService {
	DataResult<List<Employees>> getAll();
	Result add(Employees employees);
}
