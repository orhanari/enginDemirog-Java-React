package kodlamaio.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Getter Setter lombok sistemi
@Entity //Sen bir veritabanı nesnesisin
@Table(name="jobseeker_users") //Veritabanında hangi tabloya karşılık geldiğini belirtir
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name="jobseeker_user_id")
public class JobSeekerUser extends User{
	/*@Id
	//@Column(name="jobseeker_user_id")
	@PrimaryKeyJoinColumn(name="jobseeker_user_id", referencedColumnName = "user_id")
	private int jobSeekerUserId;*/
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="national_id")
	private String nationalId;
	
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	
	
	
}
