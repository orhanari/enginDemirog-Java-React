package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job, Integer>{
	//Entity anotasyonu ile süslenmiş nesne için (Job) primary key alanın ne olduğunu belirtiyoruz ve sorguları Intellisense yapısı buna göre hazırlanıyor.
	

}
