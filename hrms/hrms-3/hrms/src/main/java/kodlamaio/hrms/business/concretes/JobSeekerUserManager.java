package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerUserService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerUserDao;
import kodlamaio.hrms.entities.concretes.JobSeekerUser;

@Service
public class JobSeekerUserManager implements JobSeekerUserService{

	private JobSeekerUserDao jobSeekerUserDao;
		
	private boolean checkIfEmailExists(String email) {
		if(this.jobSeekerUserDao.findByEmail(email) != null) {
			return false;
		}
		return true;
	}
	
	private boolean checkIfNationalIdExists(String nationalId) {
		if(this.jobSeekerUserDao.findByNationalId(nationalId) != null) {
			return false;
		}
		return true;
	}
	
	private boolean checkEmptyArea(Object checkData) {
		if(checkData == null) {
			return false;
		}
		return true;
	}
	
	@Autowired
	public JobSeekerUserManager(JobSeekerUserDao jobSeekerUserDao) {
		super();
		this.jobSeekerUserDao = jobSeekerUserDao;
	}

	@Override
	public DataResult<List<JobSeekerUser>> getAll() {
		return new SuccessDataResult<List<JobSeekerUser>>
		(this.jobSeekerUserDao.findAll(), "İş arayanlar listelendi");
		
	}

	@Override
	public Result add(JobSeekerUser jobSeekerUser) {
		
		if(!this.checkEmptyArea(jobSeekerUser.getFirstName()) ||
			!this.checkEmptyArea(jobSeekerUser.getLastName())||
			!this.checkEmptyArea(jobSeekerUser.getNationalId())||
			!this.checkEmptyArea(jobSeekerUser.getEmail())||
			!this.checkEmptyArea(jobSeekerUser.getPassword())||
			!this.checkEmptyArea(jobSeekerUser.getDateOfBirth())) {
			
			return new ErrorResult("Tüm alanlar zorunludur.");
		}
		
		// MERNIS EKLENECEK VE KULLANICI BILGILENDIRILECEK
		
		if(!this.checkIfEmailExists(jobSeekerUser.getEmail())) {
			return new ErrorResult("Bu mail adresi zaten kayıtlı.");
		}
		
		if(!this.checkIfNationalIdExists(jobSeekerUser.getNationalId())) {
			return new ErrorResult("Bu TC Kimlik No zaten kayıtlı.");
		}
		
		this.jobSeekerUserDao.save(jobSeekerUser);
		return new SuccessResult("İş arayan kullanıcı eklendi. Aktivasyon bekleniyor.");
		
		
	}

}
