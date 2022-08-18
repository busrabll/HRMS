package kodlamaio.hrms.core.utilities.adapters;


import java.rmi.RemoteException;

import kodlamaio.hrms.entities.concretes.JobSeeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(JobSeeker jobSeekers) throws NumberFormatException, RemoteException {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result = client.TCKimlikNoDogrula(
				Integer.valueOf(jobSeekers.getNationalId()),
				jobSeekers.getFirstName(),
				jobSeekers.getFirstName(),
				jobSeekers.getBirthOfYear());
		
		return result;
	}

}
