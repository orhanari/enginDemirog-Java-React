package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobSeekerUser;

public interface JobSeekerUserDao extends JpaRepository<JobSeekerUser, Integer>{
	public JobSeekerUser findByEmail(String email);
	
	public JobSeekerUser findByNationalId(String nationalId);
}
