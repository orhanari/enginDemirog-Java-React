package eCommerce.dataAccess.concretes;

import java.util.List;

import eCommerce.dataAccess.abstracts.MemberDao;
import eCommerce.entities.concretes.Member;

public class StandartMemberDao implements MemberDao{

	@Override
	public void registerMember(Member member) {
		System.out.println("Merhaba "+ member.getFirstName() + ".\n" + member.geteMail() + " mail adresiyle standart kayıt yöntemi ile kayıt oldun.\nLütfen mail adresine gönderilen doğrulama linki üzerinden hesabını aktifleştir.\n(Kolaylık olması için aktivasyon kodu buraya yazılmıştır: " + member.getActivateCode() + ")");
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
