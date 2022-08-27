package kodlamaio.hrms.core.utilities.adapters;


import java.rmi.RemoteException;

import kodlamaio.hrms.entities.concretes.JobSeeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(JobSeeker jobSeeker) throws NumberFormatException, RemoteException {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result = client.TCKimlikNoDogrula(
				Integer.valueOf(jobSeeker.getNationalId()),
				jobSeeker.getFirstName(),
				jobSeeker.getLastName(),
				jobSeeker.getBirthOfYear());
		
		return result;
	}

}
