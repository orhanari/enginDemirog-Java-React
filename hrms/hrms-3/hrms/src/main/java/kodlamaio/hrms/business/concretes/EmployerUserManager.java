package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerUserService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerUserDao;
import kodlamaio.hrms.entities.concretes.EmployerUser;

@Service
public class EmployerUserManager implements EmployerUserService{

	private EmployerUserDao employerUserDao;
	
	private boolean checkIfEmailExists(String email) {
		if(this.employerUserDao.findByEmail(email) != null) {
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
	
	private boolean checkSameDomainAndEmail(String getDomain, String getEmail) {
		Pattern regex = Pattern.compile("(?<=@)\\S+");
		Matcher regexMatcher = regex.matcher(getEmail);
		
		Pattern regex2 = Pattern.compile(".*?\\.(.*?\\.[a-zA-Z]+)");
		Matcher regexMatcher2 = regex2.matcher(getDomain);
		
		
		if (regexMatcher.find()) {
			String resultString = regexMatcher.group(0);
			if (regexMatcher2.find()) {
				String resultString2 = regexMatcher2.group(1);
				
				if (resultString.equals(resultString2)) {
					return true;
				}
			}
		} 
		return false;
	}
	
	@Autowired
	public EmployerUserManager(EmployerUserDao employerUserDao) {
		super();
		this.employerUserDao = employerUserDao;
	}

	@Override
	public DataResult<List<EmployerUser>> getAll() {
		return new SuccessDataResult<List<EmployerUser>>
		(this.employerUserDao.findAll(), "İş verenler listelendi");
		
	}

	@Override
	public Result add(EmployerUser employerUser) {
		
		
		if(!this.checkEmptyArea(employerUser.getCompanyName()) ||
				!this.checkEmptyArea(employerUser.getCompanyWebsite())||
				!this.checkEmptyArea(employerUser.getCompanyPhone())||
				!this.checkEmptyArea(employerUser.getEmail())||
				!this.checkEmptyArea(employerUser.getPassword()) ) {
				
				return new ErrorResult("Tüm alanlar zorunludur.");
				// HICBIR ZAMAN NULL DONMUYOR ?
		}
		
		if(!this.checkSameDomainAndEmail(employerUser.getCompanyWebsite(), employerUser.getEmail())) {
			/*Pattern regex = Pattern.compile("(?<=@)\\S+");
			Matcher regexMatcher = regex.matcher("deneme@mail.com");
			regexMatcher.find();
			
			Pattern regex2 = Pattern.compile(".*?\\.(.*?\\.[a-zA-Z]+)");
			Matcher regexMatcher2 = regex2.matcher("www.mail.com");
			regexMatcher2.find();*/
			
			return new ErrorResult("Mail adresi ve website eşleşmiyor.");
		}
		
		// AKTIVASYON ISLEMLERI
		
		if(!this.checkIfEmailExists(employerUser.getEmail())) {
			return new ErrorResult("Bu mail adresi zaten kayıtlı.");
		}
		
		this.employerUserDao.save(employerUser);
		return new SuccessResult("İş veren kullanıcı eklendi. Aktivasyon bekleniyor.");
		
		
	}

}
