package eCommerce.entities.concretes;

import eCommerce.entities.abstracts.Entity;

public class Member implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private String eMail;
	private String pass;
	private boolean isActive;
	private String activateCode;
	
	public Member() {
		
	}

	public Member(int id, String firstName, String lastName, String eMail, String pass) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getActivateCode() {
		return activateCode;
	}

	public void setActivateCode(String activateCode) {
		this.activateCode = activateCode;
	}
	
	
}
