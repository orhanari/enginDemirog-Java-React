package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Getter Setter lombok sistemi
@Entity //Sen bir veritabanı nesnesisin
@Table(name="employer_users") //Veritabanında hangi tabloya karşılık geldiğini belirtir
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name="employer_user_id")
public class EmployerUser extends User{
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="company_website")
	private String companyWebsite;
	
	@Column(name="phone")
	private String companyPhone;
}
