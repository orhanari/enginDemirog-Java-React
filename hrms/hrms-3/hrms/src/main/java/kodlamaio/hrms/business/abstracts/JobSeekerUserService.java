package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerUser;

public interface JobSeekerUserService {
	DataResult<List<JobSeekerUser>> getAll();
	Result add(JobSeekerUser jobSeekerUser);
}
