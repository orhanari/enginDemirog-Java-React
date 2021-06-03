package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EmployerUser;

public interface EmployerUserService {
	DataResult<List<EmployerUser>> getAll();
	Result add(EmployerUser employerUser);
}
