package eCommerce.dataAccess.abstracts;

import java.util.ArrayList;
import java.util.List;

import eCommerce.entities.concretes.Member;

public interface MemberDao {
	void registerMember(Member member);
	void loginMember(String eMail, String pass);
	void activateMember(String activationCode);
	List<Member> memberList = new ArrayList();
}
