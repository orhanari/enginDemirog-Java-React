package eCommerce.business.concretes;

import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.business.abstracts.MemberService;
import eCommerce.dataAccess.abstracts.MemberDao;
import eCommerce.entities.concretes.Member;

public class MemberManager implements MemberService{

	private MemberDao memberDao;
	
	public MemberManager(MemberDao memberDao) {
		super();
		this.memberDao = memberDao;
	}
	
	int randCode = 1111;
	
	@Override
	public void registerMember(Member member) {
		
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(member.geteMail());
		boolean eMailControl = false;
		
		if (member.getPass().length() < 6) {
			System.out.println("Parolanız en az 6 karakterden oluşmalıdır.");
			return;
		}
		if (!matcher.matches()) {
			System.out.println("Mail adresiniz geçerli değil.\nÖrnek: user@example.com\nÖrnek 2: user@example");
			return;
		}
	    for (Member searchMember : memberDao.memberList) {
	        if (searchMember.geteMail().equals(member.geteMail())) {
	        	eMailControl = true;
	        }
	    }
	    if (eMailControl) {
	    	System.out.println("Mail adresi mevcut!");
	    	return;
	    }
	    if (member.getFirstName().length()<2 || member.getLastName().length()<2) {
	    	System.out.println("Ad ve soyad 2 karakterden kısa olamaz.");
	    	return;
	    }
	    member.setActive(false);
	    //Random rand = new Random();
	    //int randCode = rand.nextInt(9999 + 1 - 1000) + 1000;
	    //Kolaylık olması açısından random kaldırılmıştır, istenildiğinde kullanılabilir.
	    member.setActivateCode(String.valueOf(randCode++));
		this.memberDao.registerMember(member);
		this.memberDao.memberList.add(member);
	}

	@Override
	public void loginMember(String eMail, String pass) {
		
		boolean memberIsActive = false;
		boolean memberControl = false;
		
		if (eMail.isEmpty() || pass.isEmpty()) {
			System.out.println("Mail adresi ve parola boş bırakılamaz!");
			return;
		}
		for (Member searchMember : memberDao.memberList) {
	        if (searchMember.geteMail().equals(eMail) && searchMember.getPass().equals(pass)) {
	        	if (searchMember.getIsActive()) {
	        		memberControl = true;
	        		memberIsActive = true;
	        		break;
	        	}
	        	else {
	        		System.out.println("Hesap aktivasyonu tamamlanmamış!: " + searchMember.geteMail());
	        		memberControl = true;
	        		break;
	        	}
	        }
	    }
		if (!memberControl) {
			System.out.println("Hesap bulunamadı.");
			return;
		}
		if (memberControl && memberIsActive) {
			this.memberDao.loginMember(eMail, pass);
		}
		
	}
	@Override
	public void activateMember(String activationCode) {
		
		boolean activateStatus = false;
		
		int index = 0;
		for (Member searchMember : memberDao.memberList) {
			Member updateMember = memberDao.memberList.get(index);
			if (searchMember.getActivateCode().equals(activationCode)) {
				updateMember.setActive(true);
				memberDao.memberList.set(index, updateMember);
				activateStatus = true;
				this.memberDao.activateMember(activationCode);
				break;
			}
			
			index++;
        }
		if (!activateStatus) {
			System.out.println("Geçersiz aktivasyon kodu!");
		}
	}

	@Override
	public List<Member> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
