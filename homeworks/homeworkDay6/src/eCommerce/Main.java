package eCommerce;

import eCommerce.business.abstracts.MemberService;
import eCommerce.business.concretes.MemberManager;
import eCommerce.dataAccess.concretes.GoogleMemberDao;
import eCommerce.dataAccess.concretes.StandartMemberDao;
import eCommerce.entities.concretes.Member;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberService memberService = new MemberManager(new StandartMemberDao());
		
		Member member = new Member(0, "Orhan", "ARI", "orhanari55@gmail.com", "123456");
		memberService.registerMember(member);
		
		System.out.println("");
		Member member2 = new Member(1, "Orhan", "ARI", "orhanari55@gmail.com", "123456");
		memberService.registerMember(member2);
		
		System.out.println("");
		Member member3 = new Member(2, "Engin", "Demiroğ", "engin@kodlama.io", "123456");
		memberService.registerMember(member3);
		
		System.out.println("");
		Member member4 = new Member(3, "Engin", "Demiroğ", "engin@", "123456");
		memberService.registerMember(member4);
		
		// DOĞRULAMALAR TAMAMLANDI. AKTİVASYON KONTROLÜ YAPILIYOR:
		
		System.out.println("");
		memberService.loginMember("orhanari55@gmail.com","123456");
		// AKTİVASYONSUZ GİRİŞ DENEMESİ:
		// Çıktı: Hesap aktivasyonu tamamlanmamış!: orhanari55@gmail.com
		
		System.out.println("");
		memberService.activateMember("1099");
		// GEÇERSİZ AKTİVASYON KODU:
		// Çıktı: Geçersiz aktivasyon kodu!
		
		System.out.println("");
		memberService.activateMember("1111");
		// DOĞRU AKTİVASYON NUMARASI
		// Aktivasyon başarılı: 1111
		
		
		System.out.println("");
		memberService.loginMember("orhanari55@gmail.com","123456");
		// AKTİVASYON SONRASI GİRİŞ DENEMESİ:
		// Giriş başarılı: orhanari55@gmail.com
		
		System.out.println("");
		
		
		// GOOGLE MEMBER DAO
		
		MemberService memberService2 = new MemberManager(new GoogleMemberDao());
		
		Member googleMember = new Member(4, "Orhan", "ARI", "orhanari@outlook.com", "123456");
		memberService2.registerMember(googleMember);
		
		System.out.println("");
		memberService2.loginMember("orhanari@outlook.com","123456");
		// GOOGLE İLE KAYIT OLUNMASINDAN ÖTÜRÜ, AKTİVASYON OTOMATİK TAMAMLANMIŞTIR:
		// Çıktı: Giriş başarılı: orhanari@outlook.com
		
		
	}

}
