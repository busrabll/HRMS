package kodlamaio.hrms.core.utilities.adapters;

import java.rmi.RemoteException;

import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface UserCheckService {

	boolean checkIfRealPerson(JobSeeker jobSeeker) throws NumberFormatException, RemoteException;
	
}
