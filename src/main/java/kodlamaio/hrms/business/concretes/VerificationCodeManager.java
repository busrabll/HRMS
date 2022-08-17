package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.VerificationCodeService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;

public class VerificationCodeManager implements VerificationCodeService {

	@Override
	public Result verifyAccount(String email) {
		return new SuccessResult(email + " Verification code sent");
	}

}