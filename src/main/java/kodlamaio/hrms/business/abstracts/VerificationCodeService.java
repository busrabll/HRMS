package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;

public interface VerificationCodeService {
	Result verifyAccount(String email);
}
