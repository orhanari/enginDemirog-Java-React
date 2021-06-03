package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.EmployerUser;

public interface EmployerUserDao extends JpaRepository<EmployerUser, Integer>{
	public EmployerUser findByEmail(String email);
}
