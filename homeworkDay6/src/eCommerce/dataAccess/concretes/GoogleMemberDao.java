package eCommerce.dataAccess.concretes;

import eCommerce.dataAccess.abstracts.MemberDao;
import eCommerce.entities.concretes.Member;

public class GoogleMemberDao implements MemberDao{

	@Override
	public void registerMember(Member member) {
		System.out.println("Merhaba "+ member.getFirstName() + ".\n" + member.geteMail() + " mail adresiyle Google kayıt yöntemi ile kayıt oldun ve hesabın doğrudan aktifleştirildi.");
		member.setActive(true);
	}
	
	@Override
	public void loginMember(String eMail, String pass) {
		System.out.println("Giriş başarılı: " + eMail);
	}
	
	@Override
	public void activateMember(String activationCode) {
		System.out.println("Aktivasyon başarılı.");
	}

}
