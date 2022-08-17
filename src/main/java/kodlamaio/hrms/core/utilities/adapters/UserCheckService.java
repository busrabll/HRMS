package kodlamaio.hrms.core.utilities.adapters;

import java.rmi.RemoteException;

import kodlamaio.hrms.entities.concretes.JobSeekers;

public interface UserCheckService {

	boolean checkIfRealPerson(JobSeekers jobSeekers) throws NumberFormatException, RemoteException;
	
}
